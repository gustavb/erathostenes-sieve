(ns eratosthenes-sieve.core
  (:gen-class))

(defn primes-up-to [n]
  (range 2 (inc n)))