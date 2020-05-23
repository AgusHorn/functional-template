(ns exercise6)

(defn faverage
  "Calculates the average of a given sequence."
  [x]
  (if (empty? x)
      0
      (/ (reduce + x) (count x)))
)




