(ns shire-digest.meta.utils-test
  (:require [clojure.test :refer :all]
            [shire-digest.meta.utils :refer :all]))

(deftest test-today
  (testing "Get today's date."
    (is (today))))
