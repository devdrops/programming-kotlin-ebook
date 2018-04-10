fun main(args: Array<String>) {
  val name = "Joseph Lettuces"
  val counter = Array(5, { k -> k * k })
  val columnLimit = 20

  val template = "     Hello, ${name}!\n Greetings from Mars! You're the ${counter.size} here.\n            Peace!"
  println(template)
}
