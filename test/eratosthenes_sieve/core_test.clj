(ns eratosthenes-sieve.core-test
  (:require [clojure.test :refer :all]
            [eratosthenes-sieve.core :refer :all]))

(deftest eratosthenes-sieve-test
  (testing "facts about eratosthenes sieve"
    (testing "it returns all primes up to a given number"
      (is (= (primes-up-to 2) [2])))))

