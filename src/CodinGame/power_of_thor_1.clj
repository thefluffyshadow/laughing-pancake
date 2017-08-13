;(ns CodinGame.Power_of_Thor
;  (:gen-class))
(ns Player
  (:gen-class))

(defn -main [& args]
  (let [lightX (read) lightY (read) initialTX (read) initialTY (read)]
    (while true
      (let [remainingTurns (read) dir_str (atom "")
            dX (- lightX initialTX) dY (- lightY initialTY)]
        (cond
          (< dY 0) (swap! dir_str str "N")     ; tell Thor to start going North.
          (> dY 0) (swap! dir_str str "S")     ; Otherwise, go south.
          (= dY 0) (swap! dir_str str ""))
        (cond
          (< dX 0) (swap! dir_str str "W")   ; tell Thor to go westerly.
          (> dX 0) (swap! dir_str str "E")   ; Otherwise, tell Thor to go easterly.
          (= dX 0) (swap! dir_str str ""))

        (println @dir_str)))))
