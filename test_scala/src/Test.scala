

class ChecksumAccumulator {
  var sum = 0
}


object Test {
  def main(args: Array[String]): Unit = {

    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator
    acc.sum = 7
    println(acc.sum)
    println(csa.sum)
  }

}
