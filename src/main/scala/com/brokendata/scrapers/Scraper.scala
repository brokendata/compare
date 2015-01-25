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
        """\$([\d.]+) from ([^\$]+)""".r.findAllMatchIn(text)
          .map(m => (m.group(2).trim, m.group(1)))
          .toArray

        text
      }
    }

    def downloadPrices[T :Scraper](w: T) = implicitly[Scraper[T]].scrapePrices(w)
  }






