import com.brokendata.scrapers.compare._
import com.brokendata.websites._


object Example extends App{
  val query = "theory black dress"

  downloadPrices(Google(query))


}
