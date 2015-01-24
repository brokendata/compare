package com.brokendata

import org.jsoup.Jsoup


object Scrapper {
  val Doc = Jsoup.connect("https://www.google.com/search?tbm=shop&q=theory+black+dress")
    .userAgent("Mozilla/5.0 (X11; Linux i686) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.114 Safari/537.36")
    .get()

  val Element = Doc.select("#rso li._Ked ol li div._tyb")

}
