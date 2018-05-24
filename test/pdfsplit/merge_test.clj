(ns pdfsplit.merge-test
  (:require [clojure.test :refer :all]
            [pdfsplit.merge :refer :all]
            [clojure.java.io :as io])

  (:import
    [org.apache.pdfbox.pdmodel PDDocument])
  )


(deftest merge-test
  (testing "merge 3 1-page pdf into 1 3-page pdf"
    (merge-pdfs "resources/merged.pdf" "resources/test_page_0.pdf" "resources/test_page_1.pdf" "resources/test_page_2.pdf")
    (is (.isFile (io/file "resources/merged.pdf")))
    (is (= 3 (.getNumberOfPages (PDDocument/load (clojure.java.io/file "resources/merged.pdf")))))
    (io/delete-file "resources/merged.pdf")
    )
  )