/**
  * Created by edzzn on 6/27/17.
  */

object Test{
  def main(args: Array[String]): Unit = {
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 20)
    val charlie = new Person("Charlie", 17)

    for (person <- List(alice, bob, charlie, "jose")){
      person match {
        case Person("Alice", 25) => println("Hello Alice")
        case Person("Bob", 20) => println("Hello Bob")
        case Person("Charlie", 17) => println("Hello Charlie")
        case _ => println("Hello")

      }
    }
  }
}

// case class
case class Person(name: String, age: Int)