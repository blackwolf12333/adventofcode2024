(ns adventofcode2024.core
  (:gen-class))

(require '[clojure.string :as str])
(require '[adventofcode2024.day1-1 :as day1_1])
(require '[adventofcode2024.day1-2 :as day1_2])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (day1_1/doChallenge))
  (println (day1_2/doChallenge)))
