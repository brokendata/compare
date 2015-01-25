import com.brokendata.scrapers.Scraper._
import com.brokendata.websites._


object Example extends App{
  val query = "theory black dress"

  downloadPrices(Google(query))


}



