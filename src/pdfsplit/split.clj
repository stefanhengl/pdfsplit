(ns pdfsplit.split
  (:import [org.apache.pdfbox.pdmodel PDDocument]
           [org.apache.pdfbox.multipdf Splitter]))


(defn split-ext
  "split-ext returns a vector [root .ext] "
  [path]
  (clojure.string/split path #"(?=\.)"))


(defn create-file-name
  "convenience function to append a page number to a pdf"
  [pdf page]
  (let [[root ext] (split-ext pdf)]
  (str root "_" page ext)))


(defn split
  "Split splits pdfs into single pages.
  Split takes a path to a (multi-page) pdf, splits it into single pages,
  and saves the pages as PDF to disk. It returns a lazy seq of the split files."
  [pdf]
  (let [splitter (Splitter.)]
    (with-open [pd (PDDocument/load (clojure.java.io/file pdf))]
      ; split
      (let [pddocs (into [] (.split splitter pd))]
        ; save
        (doseq [[page pddoc] (map-indexed vector pddocs)]
          (.save pddoc (create-file-name pdf page)))
        ; return file-paths of single-page PDFs to caller
        (map #(create-file-name pdf %) (range (.getNumberOfPages pd)))
        ))))
