(ns hello)

(def hello (fn [] "Hello world"))

(hello)                                                     ;

(defn argcount
  ([] 0)
  ([x] 1)
  ([x y] 2)
  ([x y & more] (+ (argcount x y) (count more))))

(argcount)

(argcount 1)

(argcount 1 2)

(argcount 1 2 3 4 5)

(defn make-adder [x]
  (let [y x]
    (fn [z] (+ y z))))
(def add2 (make-adder 2))

(let [my-vector [1 2 3 4]
      my-map {:fred "ethel"}
      my-list (list 4 3 2 1)]
  (println (list
             (conj my-vector 5)
             (assoc my-map :ricky "lucy")
             (conj my-list 5)
             my-vector
             my-map
             my-list)))
