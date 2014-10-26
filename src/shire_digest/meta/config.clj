(ns shire-digest.meta.config
  "Configuration manipulation.")


(defn refine
  "Refine config from user provided."
  [user-config]
  (merge {:sites {} :generators {}}
         (select-keys user-config [:sites :generators])))
