(ns day1.core
  (:require [clojure.string :as s]))

(defn parse-input [input]
  (let [lines (s/split-lines input)]
    (println lines)
    lines))

(defn total-increments [measurements]
  (reduce
   (fn [incr measurement i]
     ((case (and (> i 0) ([:i measurements]))))
      ;; incr + (i > 0 && (measurements[i - 1] < measurement ? 1 : 0)) || 0
     )[0]))
(defn part1 [input] (total-increments (parse-input input)))