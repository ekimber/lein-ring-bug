(ns lein-ring-bug.core
  (:require [munge-tout.core :refer [to-java]]))

(def x (to-java [java.util.List [String]] ["A" "B" "C"]))

(println x)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

