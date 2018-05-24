[![Build Status](https://travis-ci.com/stefanhengl/pdfsplit.svg?branch=master)](https://travis-ci.com/stefanhengl/pdfsplit)
# pdfsplit

A Clojure library that splits and merges PDFs.

## Installation

[![Clojars Project](http://clojars.org/pdfsplit/latest-version.svg)](http://clojars.org/pdfsplit)

## Usage

### Split
`split` splits a pdf, saves the individual pages to disk, and
 returns a lazy sequence of the file-names (string)

```clojure
(:require [pdfsplit.split :refer [split]])
(split "path/to/file.pdf")
```

Given a multi-page pdf "file.pdf", the indiviudal pages are saved next to "file.pdf"
as file_0.pdf, file_1.pdf and so on.
### Merge
`merge-pdfs` merges arbitraily many source PDFs into one target PDF
```clojure
(:require [pdfsplit.merge :refer [merge-pdfs]])
(merge-pdfs "path/to/target.pdf" "path/to/source1.pdf" "path/to/source2.pdf" "path/to/source3.pdf")
```
