(ns kata-morse.core-test
  (:require [clojure.test :refer :all]
            [kata-morse.core :refer :all]))

(deftest test-morse-code
  (testing "Test the morse code with data provided in the Kata"
    (is (= (decode ".... . -.--   .--- ..- -.. .") "HEY JUDE")))

  (testing "Test the morse code with data provided in the Kata"
    (is (= (decode (str "-. --- -... .-.. .   .--. .- - .-. .. .-   "
                        "- ..-   .... . .-. -- --- ... .-   "
                        "-... .- -. -.. . .-. .-"))
                   "NOBLE PATRIA TU HERMOSA BANDERA"))))
