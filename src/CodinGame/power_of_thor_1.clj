;(ns CodinGame.Power_of_Thor
;  (:gen-class))
(ns Player
  (:gen-class))

; Referenced https://gist.github.com/MikeMKH/730228a3f658b9b76b72

(defn -main [& args]
  (let [[lightX lightY initialTX initialTY] (repeatedly 4 read)
        delta-x (- lightX initialTX) delta-y (- lightY initialTY)
        dist-x (Math/abs delta-x) dist-y (Math/abs delta-y)
        y-seq (cond (neg? delta-y) (repeat dist-y \N)
                    (pos? delta-y) (repeat dist-y \S))
        x-seq (cond (pos? delta-x) (repeat dist-x \E)
                    (neg? delta-x) (repeat dist-x \W))
        ]
    (while true
      (let [remainingTurns (read)]
           (println \E)
           ))))
