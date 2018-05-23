(ns pdfsplit.merge
  (:import [org.apache.pdfbox.multipdf PDFMergerUtility]))


(defn merge-pdfs
  "merge-pdfs merge different pdfs into one pdf"
  [target & sources]
  (let [merger (PDFMergerUtility.)]
    (.setDestinationFileName merger target)
    (doseq [source sources] (.addSource merger source))
    (.mergeDocuments merger)
    )
  )
