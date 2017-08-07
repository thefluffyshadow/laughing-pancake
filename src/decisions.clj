(ns .decisions
  (:gen-class))

(def x 2)
(def y 2)
(def z 8)

; Example of a simple if statement
(defn Example [x y]
  (if (= x y)
    (println "Values are equal.")
    (println "Values are not equal.")
  )
)

(Example x z)
