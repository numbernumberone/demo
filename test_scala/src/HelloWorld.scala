
import java.text.SimpleDateFormat
import java.util.Date

object HelloWorld {

  def main(args: Array[String]) {


    val time = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'+0800'").format(new Date())

    println(time)




  }
}
