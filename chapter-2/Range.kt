fun main(args: Array<String>) {
  val aToZ = "a".."z"

  println("c" in aToZ)

  val countingUp = 10.rangeTo(100)
  val countingDown = 50.downTo(40)

  println(countingUp.toString())
  println(countingDown.toString())
}

