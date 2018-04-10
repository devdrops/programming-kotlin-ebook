data class Person(
  val name: String,
  val age: Int,
  val id: String
)

class People() {
  fun Adult(info: Person): String {
    val template = "Hi, ${info.name}! Your age is ${info.age}, and your full ID is ${info.id}."
    return template
  }

  fun Child(info: Person): String {
    val template = "Hey, ${info.name}! Your age is ${info.age}, and your full ID is ${info.id}."
    return template
  }

  fun Elder(info: Person): String {
    val template = "Greetings, ${info.name}! Your age is ${info.age}, and your full ID is ${info.id}."
    return template
  }
}

fun main(args: Array<String>) {
  val person1 = Person("Jose das Couves", 30, "6172707445")
  val person2 = Person("Chavo del Ocho", 15, "7329899350")
  val person3 = Person("Dona Neves", 90, "1271399616")

  val people = People()
  val adult = people.Adult(person1)
  val child = people.Child(person2)
  val elder = people.Elder(person3)

  println(adult)
  println(child)
  println(elder)
}


