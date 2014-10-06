(ns shire-digest.meta.post-test
  (:require [clojure.test :refer :all]
            [shire-digest.meta.post :refer :all]))

(deftest test-make
  (testing "Make without optional parameters"
    (let [test-link "test-link"
          test-title "test-title"
          test-author nil
          test-date nil
          test-summary nil
          maked (make :link test-link :title test-title)
          {:keys [link title author date summary]} maked]
      (is (= test-link link))
      (is (= test-title title))
      (is (= test-author author))
      (is (= test-date date))
      (is (= test-summary summary))))
  (testing "Make with optiona parameters"
    (let [test-link "test-link"
          test-title "test-title"
          test-author "test-author"
          test-date "test-date"
          test-summary "test-summary"
          maked (make :link test-link
                      :title test-title
                      :author test-author
                      :date test-date
                      :summary test-summary)
          {:keys [link title author date summary]} maked]
      (is (= test-link link))
      (is (= test-title title))
      (is (= test-author author))
      (is (= test-date date))
      (is (= test-summary summary))))
  (testing "Make without link and title"
    (let [test-link nil
          test-title nil
          test-author nil
          test-date nil
          test-summary nil]
      (is (thrown? java.lang.AssertionError (make)) "Should not accept."))))
