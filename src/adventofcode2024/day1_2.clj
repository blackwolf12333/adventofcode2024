(ns adventofcode2024.day1-2
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
        fst (c/intify (map first pairs))
        snd (c/intify (map second pairs))
        occurrences (frequencies snd)]
    (reduce #(+ %1 (* %2 (get occurrences %2 0))) 0 fst)))
