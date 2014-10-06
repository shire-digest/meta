(ns shire-digest.meta.link
  "Link structure."
  (:require [clojurewerkz.urly.core :as urly]))

(defn make
  "Make a link with:
  - url
  - host"
  [& {:keys [url host]}]
  {:pre [(and url host)]}
  {:url url
   :host host})

(defn parse-string
  "Parse a link from string."
  [link-str]
  (let [u (urly/url-like link-str)]
    (make :url link-str
          :host (urly/host-of u))))
