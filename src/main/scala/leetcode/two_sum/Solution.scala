package leetcode.two_sum

object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    OnePassHashTable.compute(nums, target)
  }
}

