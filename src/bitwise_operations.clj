(ns .bitwise-operations(:gen-class))

;; This program displays Hello World
(defn Example []
   (def x (bit-and 00111100 00001101))
   (println x)

   (def x (bit-or 00111100 00001101))
   (println x)

   (def x (bit-xor 00111100 00001101))
   (println x))

(Example)
