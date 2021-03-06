;;; Problem definition: https://projecteuler.net/problem=1
;; Find the sum of all the multiplies of 3 or 5 below 1000.

(defn multiplies-sum "Find the sum of all the multiplies belowe (exclusive) upperBound" [upperBound]
  (let [multiplies-filter  #(or ((divisible-by? 3) %) ((divisible-by? 5)  %))]
    (apply + (filter multiplies-filter (range 0 upperBound)) )))

(defn divisible-by? [num]
  "returns function which checks if passed argument is a number divisible by [num]"
  #(zero? (mod % num)))

;;; Alternative solution using the step parameter in range and concat
(reduce + (set (concat (range 0 1000 3) (range 0 1000 5))))
