import scala.collection.mutable.HashMap

class IntegerTracker {

  var max = Int.MinValue
  var min = Int.MaxValue
  var count = 0
  var total = 0
  val numCounts = new HashMap[Int, Int]()

  var curMaxSeen = 0
  var curMaxCount = 0

  def track(num: Int): Unit = {
    if (num > max) max = num
    if (num < min) min = num
    count += 1
    total += num
    val numCount = numCounts.getOrElse(num, 0)
    numCounts.put(num, numCount + 1)

    if (curMaxSeen < numCount + 1) {
      curMaxCount = numCount
      curMaxSeen = num
    }
  }

  def get_max(): Int = max

  def get_min(): Int = min

  def get_mean(): Float = total.toFloat / count.toFloat

  def get_mode(): Int = curMaxSeen
}