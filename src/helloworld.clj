(ns .helloworld)
; The traditional "Hello World" Program.

(defn helloworld
  ([] "Hello World")
  ([name] (str "Hello " name))
  )

(->
  (println)
  (helloworld)
  (str "Zac")
  )

(helloworld "Kon'Ken")