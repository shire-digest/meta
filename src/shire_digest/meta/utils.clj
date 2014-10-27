(ns shire-digest.meta.utils
  "Utilities."
  (:require [clj-time.format :as time-format]
            [clj-time.local :as time-local]
            [clojure.java.io :as io]))


(def date-formatter (time-format/formatter "yyyy-MM-dd"))

(defn today
  "Get today's date."
  []
  (time-format/unparse date-formatter (time-local/local-now)))


(defn prepare-directory
  "Create a directory."
  [directory-absolute-path]
  (io/make-parents (str directory-absolute-path "/foobar")))
