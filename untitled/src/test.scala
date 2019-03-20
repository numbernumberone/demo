import scala.collection.mutable.ArrayBuffer

object testdemo1 {
  def main(args: Array[String]): Unit = {
    val s = Array("sfd","sdfsdf")
    val s1 = ArrayBuffer[Int]()
    val s2 = new ArrayBuffer[Int]()

    s1 += 1

    val num = s1.toArray

    println(0 until 10)


    for(i <- 0 until 10)
      println(i + ": " )

  }
}
