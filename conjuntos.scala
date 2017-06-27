object Conjuntos {

  def union(l1 : List[Int], l2 : List[Int]) : List[Int] = {
    return List.concat(l1, l2).toSet.toList

  }
  def interseccion(l1 : List[Int], l2 : List[Int]) : List[Int] = {
    return l1.filter(l2.toSet)
  }

  def diferencia(l1 : List[Int], l2 : List[Int]) : List[Int] ={
//    return l1 diff l2

    // Otra forma
    return l1.filterNot(l2.toSet)
  }

  def main(args: Array[String]): Unit = {
    val A = List(1, 2, 3, 4, 6, 8, 10)
    val B = List(1, 2, 3, 5, 7, 9, 11)

    println(A)
    println(B)

    println("Union")
    val uni = union(A, B)
    println(uni)

    println("Interseccion")
    val inter = interseccion(A, B)
    println(inter)

    println("Diferencia")
    val diff = diferencia(A, B)
    println(diff)


  }


}