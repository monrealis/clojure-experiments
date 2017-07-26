(ns experiments.optimal-stopping)

(defn generate-random [n]
  (let [range (range n)]
    (shuffle range)
    )
  )

(def n 10)

(defn is-found [] 
  (let [input (generate-random n)]
    (let [m (Math/ceil (* n 0.37))] 
      (let [head (take m input) tail (subvec input m)]
        (let [best-in-last (apply max tail)]
          (let [found-best (= best-in-last 9)]
            found-best
            )
          )
        )
      )
    
    
    )
  )

(count
  (filter
    (fn [found] found)
    (map 
      (fn [i] (is-found)) 
      (take 100 (iterate inc 1))
      )
    )
)










