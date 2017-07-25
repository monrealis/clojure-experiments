(ns experiments.optimal-stopping)

(defn generate-random [n]
  (let [range (range n)]
    (shuffle range)
    )
  )

(def n 10)

(let [input (generate-random n)]
  (let [m (Math/ceil (* n 0.37))] 
    (let [head (take m input) tail (subvec input m)]
      (let [best-in-last (apply max tail)]
        (let [found-best (= best-in-last 9)]
          (println found-best)
          )
        )
      )
    )
  )












