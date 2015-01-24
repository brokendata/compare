import com.brokendata.scrapers.GoogleShoppingScraper
import com.brokendata.websites.Google

object compare extends App{

  GoogleShoppingScraper.downloadPrices(Google.search("Theory Black Dress"))

}
