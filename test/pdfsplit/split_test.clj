(ns pdfsplit.split-test
  (:require
    [clojure.java.io :as io]
    [clojure.test :refer :all]
    [pdfsplit.split :refer :all]
    ))


(deftest split-test
  (testing "split 3-page pdf into 3 pages"
    (let [file-names (split "resources/3page.pdf")]
      (is (= 3 (count file-names)))
      (is (every? #(.isFile %) (map io/file file-names)))
      (doseq [file file-names] (io/delete-file file))
      )))