package leetcode.two_sum

import org.scalatest.{FlatSpec, Matchers}

class SolutionTest extends FlatSpec with Matchers {
  behavior of "Two Sum"

  it should "Select two numbers in the array for which the sum is the " +
    "target number and return their indices." in {
    Solution.twoSum(Array(2, 7, 11, 15), 9) should equal(Array(0, 1))
  }

}
