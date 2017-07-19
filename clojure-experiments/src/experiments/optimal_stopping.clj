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

(def best (apply max (take m head)))

(println input)
(println "best in first" best)
(println "first" head)
(println "last" tail)

(println (or (first (filter #(> % best) tail)) (last tail)))






