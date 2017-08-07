(ns .functions
  (:gen-class))

; This namespace is an example for me to learn the different forms and functions of the forms of functions in clojure.

; Example of a higher-order function - a function that takes another function as an argument.
; This turned out to be significantly less exciting than it sounds.
; Because this is it:
(defn Example []
  (println (filter even? (range 0 10))))                     ; Apparently, because the range thing is a function, that
                                                           ; makes this a higher-order function.

(defn Example2
  ([] (println "0 Arguments were passed."))
  ([arg1] (println "1 argument was passed: " arg1))
  ([arg1 arg2] (println "2 arguments were passed: " arg1 " & " arg2))
  ([arg1 arg2 & argn] (println "More than 2 arguments were passed: " arg1 ", " arg2 ", "
                               (clojure.string/join " & " argn))))





; Example of a variadic function - a function that can take a variable number of arguments.
(defn Example3 [message & others]                           ; & key signifies the variable arguments to be handled.
  (println message ": " (clojure.string/join ", " others)))


(Example)
(Example2)
(Example2 "thing1")
(Example2 "thing2" "thing3")
(Example2 "thing4" "thing5" "thing6" "thing7" "thing8")
(Example3 "I fart in your general direction" "Your mother was a hamster" "Your father smelt of elderberries")
