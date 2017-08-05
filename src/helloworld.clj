(ns helloworld)
; The traditional "Hello World" Program.

(defn helloworld                                            ; No arguments here.
  ([] println "Hello, World! ^_^")
  ([name] println (str "Hello, " name "!"))
  ([name name2] println (str "Hello, " name " and " name2 "!"))
  )

(helloworld)                                                ; Execute the function.
(helloworld "Zac")
(helloworld "Zac" "Bart")