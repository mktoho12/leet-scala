package leetcode.two_sum

object TwoPassHashTable extends TwoSum {
  override def compute(nums: Array[Int], target: Int): Array[Int] = {
    val map = nums.zipWithIndex.toMap
    map.foreach { case (num, idx) =>
      val diff = target - num
      if(map.contains(diff) && map(diff) != idx) {
        return Array(idx, map(diff))
      }
    }
    throw new IllegalArgumentException
  }
}

