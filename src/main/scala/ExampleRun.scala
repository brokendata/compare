import com.brokendata.scrapers.compare._
import com.brokendata.websites._


object Example extends App{
  val query = "theory black dress"

  downloadPrices(Google(query))


}



x.split("\\s\\$").map(x => x.replace("$","").split("from").map(_.trim()))
