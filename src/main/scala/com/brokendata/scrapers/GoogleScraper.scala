package com.brokendata.scrapers
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

object GoogleShoppingScraper extends Scraper {

  def downloadURL(url: String): Document = {
    val Doc = Jsoup.connect(url)
      .userAgent("Mozilla/5.0 (X11; Linux i686) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.114 Safari/537.36")
      .get()

    Doc
  }

  def downloadPrices(url: String): String = {
    val Doc = downloadURL(url)
    val Element = Doc.select("#rso li._Ked ol li div._tyb")

    Element.text()
  }

}

