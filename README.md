[![Clojars Project](https://img.shields.io/clojars/v/pdfsplit.svg)](https://clojars.org/pdfsplit)
[![Build Status](https://travis-ci.com/stefanhengl/pdfsplit.svg?branch=master)](https://travis-ci.com/stefanhengl/pdfsplit)
# pdfsplit

A Clojure library that splits (multi-page) PDFs into single pages.

## Usage

`split` splits a pdf, saves the individual pages to disk, and
 returns a lazy sequence of the file-names (string)

```clojure
(:require [pdfsplit.core :refer [split]])
(split "path/to/file.pdf")
```
