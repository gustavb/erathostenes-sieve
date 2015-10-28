(ns eratosthenes-sieve.core
  (:gen-class))

(defn primes-up-to [n]
  (filter #(or (not= (mod % 2) 0) (= % 2)) (range 2 (inc n))))