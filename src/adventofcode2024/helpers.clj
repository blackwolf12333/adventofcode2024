(ns adventofcode2024.helpers)

(defn intify
  "maps string list to ints"
  [coll]
  (map #(Integer/parseInt %) coll))
