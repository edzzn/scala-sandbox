/**
  * Created by edzzn on 6/27/17.
  */

trait Equal {
  def isEqual(x :Any) : Boolean
  def isNotEqual(x :Any) : Boolean = !isEqual(x)
}

class Point(val xc: Int, val yc :Int) extends Equal{
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit ={
    x = x + dx
    y = y + dy
    println("P [" + x + ", " + y + "]")
  }

  override def isEqual(obj: Any): Boolean = (obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x)

  def showXY(): Unit ={
    println("P [" + x + ", " + y + "]")
  }
}

class Location(override val xc: Int,override val yc :Int, val zc :Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int): Unit ={
    x = x + dx
    y = y + dy
    z = z + dz
    showLoc()
  }

  def showLoc(): Unit ={
    println("P [" + x + ", " + y  + ", " + z + "]")
  }
}


object Main{

  def main(args: Array[String]): Unit = {
    var loc = new Location(1,2,3)
    loc.showLoc()
    loc.showXY()
    loc.move(2,3,4)
    loc.move(1,2,3)

    var p1 = new Point(2,6)
    var p2 = new Point(3,6)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(2))

  }
}