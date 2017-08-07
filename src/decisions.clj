(ns .decisions
  (:gen-class))

; Example of a simple if statement
(defn Example [] (
  if ( = 2 2)
  (println "Values are equal")
  (println "Values are not equal")))

(Example)
