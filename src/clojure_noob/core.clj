(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn train
  []
  (println "Choo choo!")
)

(if true
  "By Zeus's hammer!"
  "By Aquaman's trident!")

(if false
  "By Zeus's hammer!"
  "By Aquamans's trident!")

(if false
  "By Odin's Elbow!")

(if true
  (do (println "Success!")
      "By Zeus's hammer!")

  (do (println "Failure!")
      "By Aquaman's trident!")
)

(when true
  (println "Success!")
  "abra cadabra")

(nil? 1)

(nil? nil)

(if "bears eat beets"
  "bears beets Battlestar Galactica")

(if nil
  "This won't be the result because nil is falsey"
  "nil is falsey")

(= 1 1)

(= nil nil)

(= 1 2)

(or false nil :large_I_mean_venti :why_cant_I_just_say_large)

(or (= 0 1) (= "yes" "no"))

(or nil)

(and :free_wifi :hot_cofee)

(and :feelin_super_cool nil false)

(def failed-protagonist-names
  ["Larry Potter" "Dorren the Explorer" "The Incredible Bulk"])

failed-protagonist-names

(def severity :mild)
(def error-message "OH GOD! IT'S A DIASTER! WE'RE")
