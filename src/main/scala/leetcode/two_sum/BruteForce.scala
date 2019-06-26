package leetcode.two_sum

object BruteForce extends TwoSum {
  override def compute(nums: Array[Int], target: Int): Array[Int] = {
    for (first <- nums.indices; second <- nums.indices if first != second) {
      if (nums(first) + nums(second) == target) {
        return Array(first, second)
      }
    }
    throw new IllegalArgumentException
  }
}

