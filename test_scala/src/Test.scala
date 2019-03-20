//
//import com.sun.corba.se.impl.javax.rmi.CORBA.Util
//
//class ChecksumAccumulator {
//  private var total = 0
//  var sum = 0
//
//  def add (b : Byte) : Unit = {
//    total += b
//  }
//
//  def checksum() : Int = {
//    return ~(sum & 0xFF) + 1
//  }
//}
//
//
//object Test {
//  def main(args: Array[String]): Unit = {
//
//    val acc = new ChecksumAccumulator
//    val csa = new ChecksumAccumulator
//    acc.sum = 7
//    acc.add(1)
//    val a = acc.checksum()
//    println(a)
////    println(csa.sum)
//  }
//
//}
