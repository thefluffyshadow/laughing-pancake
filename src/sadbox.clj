(ns .sadbox
  (:gen-class))

(defn thing1 []
  (let [string ""]
    (dotimes [n 8]
      (print n)
      (if (< n 7)
        (print " + ")
        (print "\n")))))

(thing1)
(thing1)
(thing1)
