(ns Player
  (:gen-class))

(def mountains (atom {}))

(defn -main [& args]
  (while true  ; Game loop
    (loop [i 8]
      (when (> i 0)
        (let [mountainH (read)
        (recur (dec i)))))

    (println (key (apply max-key val @mountains)))))