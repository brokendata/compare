package com.brokendata.scrapers
import com.brokendata.websites._



  trait Scraper[T] {
    def scrapePrices(website: T): String
  }

  object Scraper {
    implicit object GoogleScraper extends Scraper[Google] {
      def scrapePrices(website: Google): String = {
        val element = website.html.select("#rso li._Ked ol li div._tyb")
        val text = element.text()
          /*
          .split("\\s\\$")
          .map(x => x.replace("$","")
          .split("from")
          .map(_.trim()))
          .map(x => (x(1),x(0))) */
        text
      }
    }

    def downloadPrices[T :Scraper](w: T) = implicitly[Scraper[T]].scrapePrices(w)
  }






