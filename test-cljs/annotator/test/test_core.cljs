(ns annotator.test.test-core
  (:require-macros [cemerick.cljs.test :refer (are is deftest with-test run-tests testing test-var)])
  (:require [cemerick.cljs.test :as t]
            [annotator.core :as core]))

(deftest edit
  (is (= 42 (core/meaning-of-life))))
