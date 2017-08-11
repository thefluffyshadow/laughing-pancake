; Programmer:         Zachary Champion
; Project:            Laughing Pancake
; Description:        Getting familiar with clojure - this program is a first attempt to make a functional piece of code
;                     in Clojure.
;                     The function of this piece of code is to compute the sum of the multiples of 3 and 5 that are less
;                     than a certain number - 1000 is the default.
; Date last updated:  10 August 2017
(ns .euler001)

(def total (atom 0))
(def i (atom 0))
(def target 1000)

(defn multiples [target]
  (while (< @i target)
    (cond  ; Test if the current value in i is a mult of 3 or 5.
      (= (mod @i 3) (mod @i 5) 0) (reset! total (+ @total (* 2 @i)))  ; If it's a mult of 3 & 5, add it twice.
      (= (mod @i 3) 0) (reset! total (+ @total @i))  ; If so, add it to the total.
      (= (mod @i 5) 0) (reset! total (+ @total @i))  ; If so, add it to the total.
      )

    (swap! i inc)
    )

  (println "Sum of the multiples less than" target ": " @total)
  )

(multiples 1000)
