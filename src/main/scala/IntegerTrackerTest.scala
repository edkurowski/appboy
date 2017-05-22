object IntegerTrackerTest extends App {

  val ints = Seq(1, 2, 3, 4, 2, 5, 3, 3)

  val tracker = new IntegerTracker()

  ints.foreach(tracker.track)

  println(tracker.get_max())
  println(tracker.get_min())
  println(tracker.get_mean())
  println(tracker.get_mode())
}
