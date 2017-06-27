/**
  * Created by edzzn on 6/27/17.
  */

import scala.util.matching.Regex

object RegexTest {
  def main(args: Array[String]): Unit = {
    val pattern = "Scala".r
    val str = "Scala is a Scalable and okay"

    println(pattern findFirstIn str)
  }
}

object RegexTest2 {
  def main(args: Array[String]): Unit = {
    val pattern = new Regex("(S|s)cala")
    val str = "Scala is a Scalable and okay"

    println((pattern findAllIn  str).mkString(", "))
    println((pattern replaceFirstIn (str, "Java")))
  }
}

