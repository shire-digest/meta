(ns shire-digest.meta.post
  "Post structure.")


(defn make
  "Make a post with:
  - link
  - title
  - author (optional)
  - date (optional)
  - summary (optional)"
  [& {:keys [link title author date summary]}]
  {:pre [(and link title)]}
  {:link link
   :title title
   :author author
   :date date
   :summary summary})
