(ns shire-digest.meta.link-test
  (:require [clojure.test :refer :all]
            [shire-digest.meta.link :refer :all]))

(deftest test-make
  (testing "Make link"
    (let [test-url "http://example.com"
          test-host "example.com"
          maked (make :url test-url :host test-host)
          {:keys [url host]} maked]
      (is (= test-url url))
      (is (= test-host host))))
  (testing "Make link without url or host"
    (is (thrown? java.lang.AssertionError (make) "Should not accept."))))

(deftest test-parse-string
  (testing "Create link from string"
    (let [link (parse-string "http://www.example.com/foo/bar")
          {:keys [url host]} link]
      (is (= url "http://www.example.com/foo/bar"))
      (is (= host "www.example.com")))))
