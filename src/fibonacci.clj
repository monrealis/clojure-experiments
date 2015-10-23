 (ns fibonacci)

(def fib-seq
  (lazy-cat [0 1] (map + (rest fib-seq) fib-seq)))

(println (take 20 fib-seq))