(defproject pdfsplit "0.4.0"
  :description "A Clojure library that splits and merges (multi-page) PDFs."
  :url "https://github.com/stefanhengl/pdfsplit"
  :scm {:name "git" :url "https://github.com/stefanhengl/pdfsplit" }
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [
                 [org.clojure/clojure "1.9.0"]
                 [org.apache.pdfbox/pdfbox "2.0.8"]
                 ]
  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :creds :gpg}]]
  )

