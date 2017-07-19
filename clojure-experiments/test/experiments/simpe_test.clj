(ns experiments.simple_test
  (:require [clojure.test :refer :all]
            [my-project.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(run-tests)
