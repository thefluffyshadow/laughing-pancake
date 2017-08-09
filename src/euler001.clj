; Programmer:         Zachary Champion
; Project:            Laughing Pancake
; Description:        Getting familiar with clojure - this program is a first attempt to make a functional piece of code
;                     in Clojure.
;                     The function of this piece of code is to compute the sum of the multiples of 3 and 5 that are less
;                     than a certain number - 1000 is the default.
; Date last updated:  9 August 2017
(ns .euler001)

(defn multiples [target]
  (def total (atom 0))
  (def i (atom 0))

  (while ( < @i target)
    (do
      (cond  ; Test if the current value in i is a mult of 3 or 5.
        (= (rem i 3) 0) (swap! total (+ total i))  ; If so, add it to the total.
        (= (rem i 5) 0) (swap! total (+ total i))  ; If so, add it to the total.
        )

      (swap! i inc)
      )
    )

  (println "Sum of the multiples less than" target ": " @total)
  )

(multiples 1000)
