(ns .functions
  (:gen-class))

; This namespace is an example for me to learn the different forms and functions of the forms of functions in clojure.

; Example of a higher-order function - a function that takes another function as an argument.
; This turned out to be significantly less exciting than it sounds.
; Because this is it:
(defn Example [] (println (filter even? (range 0 10))))      ; Apparently, because the range thing is a function, that
                                                             ; makes this a higher-order function.

; Example of a function that's defined to take multiple (and variadic 'cause I felt like it) numbers of arguments.
(defn Example2
  ([] (println "0 Arguments were passed."))
  ([arg1] (println "1 argument was passed:" arg1))
  ([arg1 arg2] (println "2 arguments were passed:" arg1 "&" arg2))
  ([arg1 arg2 & arg_n] (println "More than 2 arguments were passed: " arg1 ", " arg2 ", "
                               (clojure.string/join " & " arg_n))))

; Example of a variadic function - a function that can take a variable number of arguments.
(defn Example3 [& others]                           ; & key signifies the variable arguments to be handled.
  (println (clojure.string/join ", " others)))

; RELEASE THE KRAKEN
(Example)
(Example2)
(Example2 "thing 1")
(Example2 "thing 2" "thing 3")
(Example2 "thing 4" "thing 5" "thing 6" "thing 7" "thing 8")
(Example3 "Ruby" "Weiss" "Blake" "Yang")
