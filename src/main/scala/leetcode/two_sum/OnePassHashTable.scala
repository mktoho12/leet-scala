package leetcode.two_sum

object OnePassHashTable extends TwoSum {
  override def compute(nums: Array[Int], target: Int): Array[Int] = {
    val map = collection.mutable.Map[Int, Int]()
    for(i <- nums.indices) {
      val diff = target - nums(i)
      if(map.contains(diff) && map(diff) != i) {
        return Array(map(diff), i)
      }
      map(nums(i)) = i
    }
    throw new IllegalArgumentException
  }
}
