(ns experiments.optimal-stopping)

(defn generate-random [n]
  (let [range (range n)]
    (shuffle range)
    )
  )

(def n 10)

(def input (generate-random n))

(def m (Math/ceil (* n 0.37)))


(def head (take m input))
(def tail (subvec input m))

(def best-in-last (apply max tail))

(def found-best (= best-in-last 9))

(println found-best)

