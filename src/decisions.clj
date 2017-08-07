(ns .decisions
  (:gen-class))

(def x 2)
(def y 2)
(def z 8)
(def pi 3.14)

; Example of a simple if statement
(defn Example [x y]
  (println "if statement start")
  (if (= x y)
    (println "Values are equal.")
    (println "Values are not equal.")))



; Example of a case statement
(defn Example2 [x]
  (println "case statement start")
  (case x
    2 (println "x is 2.")         ; execute in the case that x is 2.
    4 (println "x is 4.")         ; execute in the case that x is 4.
    8 (println "x is 8.")         ; execute in the case that x is 8.
    3.14 (println "x is pi. Or close enough.")  ; execute in the case that x is 3.14.
    (println "x is not of note."))) ; execute in the case that none of these are true.



; Example of a cond statement
(defn Example3 [x]
  (println "Cond statement start")

  (cond
    (= x pi) (println "x is pi.")
    (<= x pi) (println "x is less than or equal to pi.")
    (> x pi) (println "x is greater than pi.")))



(Example x y)
(Example2 pi)
(Example3 pi)
