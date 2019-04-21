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


  def lengthOfLongestSubstring2(s:String) : Int = {
    val n = s.length
    val set = mutable.HashSet[Character]()
    var ans = 0
    var i = 0
    var j = 0
    while (i < n && j < n){
      if (!set.contains(s.charAt(j))){
        j+=1
        set.add(s.charAt(j))
        ans = Math.max(ans, j - i)
      }else {
        i+=1
        set.remove(s.charAt(i))
        }
      }
  return ans

  }



}





object lengthOfLongestSubstring {

  def main(args: Array[String]): Unit = {
    val acc = new lengthOfLongestSubstring
    val str = acc.lengthOfLongestSubstring2("assdfaa")
    println(str)

  }








}
