package leetcode.two_sum

import org.scalatest.{FlatSpec, Matchers}

class OnePassHashTableTest extends FlatSpec with Matchers {

  it should "compute" in {
    OnePassHashTable.compute(Array(2, 7, 11, 15), 9) should equal(Array(0, 1))
  }

}
