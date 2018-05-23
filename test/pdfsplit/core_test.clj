(ns pdfsplit.core-test
  (:require
    [clojure.java.io :as io]
    [clojure.test :refer :all]
    [pdfsplit.core :refer :all]
    ))


(deftest a-test
  (testing "split 3-page pdf into 3 pages"
    (let [file-names (split "resources/test_page.pdf")]
      (is (= 3 (count file-names)))
      (doseq [file file-names] (io/delete-file file)))))