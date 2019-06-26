package leetcode.two_sum

import org.scalatest.{FlatSpec, Matchers}

class TwoPassHashTableTest extends FlatSpec with Matchers{

  it should "compute" in {
    TwoPassHashTable.compute(Array(2, 7, 11, 15), 9) should equal(Array(0, 1))
  }

}
