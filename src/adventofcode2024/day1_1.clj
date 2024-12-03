(ns adventofcode2024.day1-1
  (:gen-class)
  (:require [adventofcode2024.helpers :as c]))

(require '[clojure.string :as str])

(def inputFile "day1-1.txt")

(defn pairs
  "pairs"
  [inFile]
  (map #(str/split % #" +") (str/split-lines (slurp inFile))))

(defn re-pair
  "pairs up each element from the first list with the second"
  [fst snd]
  (partition 2 (interleave fst snd)))

(defn doChallenge
  "Reads the input file"
  []
  (let [pairs (pairs inputFile)
        fst (sort (c/intify (map first pairs)))
        snd (sort (c/intify (map second pairs)))]
    (reduce + (map (comp abs #(- (first %) (second %))) (re-pair fst snd)))))
