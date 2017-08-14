(ns Player
  (:gen-class))

; Referenced https://gist.github.com/MikeMKH/730228a3f658b9b76b72
; Last Updated 13 August 2017

(defn -main [& args]
  (let [[lightX lightY initialTX initialTY] (repeatedly 4 read)
        delta-x (- lightX initialTX) delta-y (- lightY initialTY)

        dist-x (Math/abs delta-x) dist-y (Math/abs delta-y)

        y-seq (cond (neg? delta-y) (repeat dist-y \N)
                    (pos? delta-y) (repeat dist-y \S)
                    :else nil)

        x-seq (cond (pos? delta-x) (repeat dist-x \E)
                    (neg? delta-x) (repeat dist-x \W)
                    :else nil)

        max-length (max dist-x dist-y)
        normalize-length #(concat % (repeat (- max-length (count %)) ""))
        moves (map str (normalize-length y-seq) (normalize-length x-seq))
        ]

    (doseq [move moves]
      (let [remainingTurns (read)]
           (println move)
           ))))
