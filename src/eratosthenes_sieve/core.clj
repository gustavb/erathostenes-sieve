(ns eratosthenes-sieve.core
  (:gen-class))

(defn- integers-up-to [n]
  (range 2 (inc n)))

(defn- multiple-of? [n p]
  (and (= (mod n p) 0) (not= n p)))

(defn- sieve [numbers prime]
  (let [sieved (remove #(multiple-of? % prime) numbers)
        next-prime (first (drop-while #(<= % prime) sieved))]
    (if next-prime
      (recur sieved next-prime)
      sieved)))

(defn primes-up-to [n]
  (sieve (integers-up-to n) 2))