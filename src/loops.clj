(ns .loops
  (:gen-class))

;; Example of the while loop
(defn Example []
  (println "While loop start:")

  (def x (atom 1))

  (while ( < @x 5)
    (do
      (println @x)
      (swap! x inc)
      )
    )
  )

;; Example of the doseq loop statement
(defn Example2 []
  (println "Doseq loop start")
  (doseq [n [0 1 2]]
    (println n)
    )
  )


(Example)
(Example2)
