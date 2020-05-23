(ns exercise3)

(defn fibonacci
  "Calculates the fibonacci result for the given input value."
  [x]
  (if (< x 2)
      x
      (+ (fibonacci (- x 1)) (fibonacci (- x 2)))
  )
)
