(ns project-euler.euler002)

; Project: Project Euler, Problem 2

; Problem Description:
; Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the
; first 10 terms will be:
; 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
; By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the
; even-valued terms.

; Last Updated 19 August 2017

(defn DoTheThing [limit]
  (loop [n1 1, n2 2, accumulator 2]
    (let [f (+ n1 n2)]
      (if (>= f limit) accumulator (recur n2 f (if (= (mod f 2) 0) (+ accumulator f) accumulator))))))

(def limit 4000000)
(def correct-answer 461732)

(defn -main [& args]
  (let [answer (DoTheThing limit)]
    (println "Sum of the even fibonacci terms under 4,000,000 =" answer "which is"
             (if (= answer correct-answer) "correct!" (str (- answer correct-answer) " off.")))))
