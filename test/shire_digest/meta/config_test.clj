(ns shire-digest.meta.config-test
  (:require [clojure.test :refer :all]
            [shire-digest.meta.config :refer :all]))


(def complete-config {:sites {"http://example.org" {:crawler :test-crawler}}
                      :generators {:simple {:path "/var/temp"}}})


(deftest test-refine
  (testing "Complete config"
    (let [config complete-config
          refined-config (refine config)]
      (is (= (:sites config) (:sites refined-config)))
      (is (= (:genrators config) (:genrators refined-config)))))
  
  (testing "Partial config"
    (let [config (select-keys complete-config [:sites])
          refined-config (refine config)]
      (is (= (:sites config) (:sites refined-config)))
      (is (= {} (:generators refined-config))))))
