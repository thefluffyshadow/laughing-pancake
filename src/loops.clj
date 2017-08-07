(ns .loops
  (:gen-class))

;; This program displays Hello World
(defn Example []
  (def x (atom 1))

  (while ( < @x 5)
    (do
      (println @x)
      (swap! x inc))))

(Example)