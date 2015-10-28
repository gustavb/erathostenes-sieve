(ns eratosthenes-sieve.core
  (:gen-class))

(defn- integers-up-to [n]
  (range 2 (inc n)))

(defn- multiple-of? [n p]
  (and (= (mod n p) 0) (not= n p)))

(defn primes-up-to [n]
  (remove #((multiple-of? % 2))
          (integers-up-to n)))