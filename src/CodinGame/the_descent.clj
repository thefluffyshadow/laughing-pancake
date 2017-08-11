(ns Player
  (:gen-class))

; The while loop represents the game.
; Each iteration represents a turn of the game
; where you are given inputs (the heights of the mountains)
; and where you have to print an output (the index of the mountain to fire on)
; The inputs you are given are automatically updated according to your last actions.
(def mountains (atom {}))

(defn -main [& args]
  (while true
    (loop [i 8]
      (when (> i 0)
        (let [mountainH (read)]
          ; mountainH: represents the height of one mountain.
          (swap! mountains assoc :i mountainH)

          (binding [*out* *err*]
                   (println (str mountains)))
          
        (recur (dec i)))))
    
    ; (binding [*out* *err*]
    ;   (println "Debug messages..."))
    
    ; The index of the mountain to fire on.
    (println "4")))