(ns eratosthenes-sieve.core-test
  (:require [clojure.test :refer :all]
            [eratosthenes-sieve.core :refer :all]))

(deftest eratosthenes-sieve-test
  (testing "facts about eratosthenes sieve"
    (testing "it returns all primes up to a given number"
      (is (= (primes-up-to 2) [2]))
      (is (= (primes-up-to 3) [2 3]))
      (is (= (primes-up-to 5) [2 3 5]))
      (is (= (primes-up-to 5) [2 3 5]))
      (is (= (primes-up-to 11) [2 3 5 7 11]))

      )))

