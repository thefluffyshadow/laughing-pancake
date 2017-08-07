(ns .loops
  (:gen-class))

(def condition_end 3)

; Example of the while loop
; Also includes the mysterious atom data type!
(defn Example []
  (println "While loop start")

  (def x (atom 1))

  (while ( < @x condition_end)
    (do
      (println @x)
      (swap! x inc))))

;; Example of the doseq loop statement
(defn Example2 []
  (println "Doseq loop start")
  (doseq [n (range condition_end)]
    (println n)))



;; Example of the dotimes loop statement
(defn Example3 []
  (println "Dotimes loop start")
  (dotimes [n condition_end]
    (println n)))



; Example of the loop loop statement
(defn Example4 []
  (println "Loop loop start")

  (loop [x 0]
    (when (< x condition_end)
      (println x)
      (recur (inc x)))))





(Example)
(Example2)
(Example3)
(Example4)
