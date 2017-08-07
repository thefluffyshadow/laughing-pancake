(ns .helloworld)
; The traditional "Hello World" Program.

(def hello_name "Kon'Ken")

(defn helloworld
  ([] "Hello World")
  ([you] (str "Hello " you)))

(println (helloworld))
(println (helloworld hello_name))
