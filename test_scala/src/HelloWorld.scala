object HelloWorld {

  def main(args: Array[String]) {
    //val greetStrings = new Array[String](3)
    val greetStrings: Array[String] = new Array[String](3)
    greetStrings(0) = "hello"
    greetStrings(1) = ","
    greetStrings(2) = "world!\n"

    for(i <- 0 to 2)
      print(greetStrings(i))

    println("Hello World! 我是王锐");
  }

}
