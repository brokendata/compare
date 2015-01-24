package com.brokendata.scrapers
import org.jsoup.Jsoup

object GoogleShoppingScraper extends Scraper {

  def downloadURL(page: String):

  def downloadPrices(page: String): String = {
    val Doc = Jsoup.connect(page)
      .userAgent("Mozilla/5.0 (X11; Linux i686) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.114 Safari/537.36")
      .get()

    val Element = Doc.select("#rso li._Ked ol li div._tyb")

    Element.text()
  }

}

