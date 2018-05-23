[![Clojars Project](https://img.shields.io/clojars/v/pdfsplit.svg)](https://clojars.org/pdfsplit)
[![Build Status](https://travis-ci.com/stefanhengl/pdfsplit.svg?branch=master)](https://travis-ci.com/stefanhengl/pdfsplit)
# pdfsplit

A Clojure library that splits and mergees (multi-page) PDFs.

## Usage

### Split
`split` splits a pdf, saves the individual pages to disk, and
 returns a lazy sequence of the file-names (string)

```clojure
(:require [pdfsplit.split :refer [split]])
(split "path/to/file.pdf")
```

### Merge
```clojure
(:require [pdfsplit.merge :refer [merge-pdfs]])
(merge-pdfs "path/to/target.pdf" "path/to/source1" "path/to/source2" "path/to/source3")
```