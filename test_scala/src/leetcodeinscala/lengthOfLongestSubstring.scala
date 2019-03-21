package leetcodeinscala

import scala.collection.mutable

//暴力方法求解

class lengthOfLongestSubstring {
  def lengthOfLongestSubstring1(s:String) : Int = {
    val n = s.length
    var ans = 0
    for(i <- 0 until n )
      for(j <- i+1 until n )
        if (allUnique(s,i,j))
          ans = Math.max(ans,j-i)
    return ans

  }
  def allUnique(s :String,start : Int,end :Int ): Boolean = {
    val set = new mutable.HashSet[Character]()
    for (key <- start to end -1  ) {
      var ch = s.charAt(key)
      if (set.contains(ch))
        return false
      set.add(ch)
    }
    return true
  }
}





object lengthOfLongestSubstring {

  def main(args: Array[String]): Unit = {
    val acc = new lengthOfLongestSubstring
    val str = acc.lengthOfLongestSubstring1("assdfaa")
    println(str)

  }








}
