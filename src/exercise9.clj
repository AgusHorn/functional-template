(ns exercise9)

(defn word-count 
  "Returns a map where each key is a distinct word in a given sentence and each value is the number of occurences of that word in the sentence."
  [x]
  (let [words {}]
       (doseq [word (clojure.string/split x #"\s")]
           (if (contains? words word)
               (update-in words [:word] inc)
               (assoc-in words [:word] 1)
           )
           (println words)
        )
       (println words)
   words)
)




