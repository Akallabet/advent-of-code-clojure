(ns day1.core-test
  (:require [clojure.test :as test]
            [day1.core :refer [parse-input, part1]]))

(def example "199
200
208
210
200
207
240
269
260
263")

;; (test/deftest a-test
;;   (test/testing "FIXME, I fail."
;;     (test/is (= (parse-input example) [199 200 208 210 200 207 240 269 260 263]))))

(test/deftest part-1-example
  (test/testing "Part 1 - Example"
    (test/is (= 7 (part1 example)))))

;; (speclj/describe "parse input"
;;                  (speclj/it "parses the input"
;;                             (speclj/should= [1 2 3] (parse-input example))))
