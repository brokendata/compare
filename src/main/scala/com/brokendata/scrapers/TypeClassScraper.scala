package com.brokendata.scrapers
import com.brokendata.websites._

object compare {

  trait Scraper[T] {
    def scrapePrices(website: T): String
  }

  object Scraper {
    implicit object GoogleScraper extends Scraper[Google] {
      def scrapePrices(website: Google): String = {
        val element = website.html.select("#rso li._Ked ol li div._tyb")
        element.text()
      }
    }
  }

  def downloadPrices[T :Scraper](w: T) = implicitly[Scraper[T]].scrapePrices(w)

}


