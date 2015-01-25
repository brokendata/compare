package com.brokendata.websites

import org.jsoup.Jsoup
import org.jsoup.nodes.Document


trait Website {
  def downloadHTML(url: String): Document = {
    val Doc = Jsoup.connect(url)
      .userAgent("Mozilla/5.0 (X11; Linux i686) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.114 Safari/537.36")
      .get()

    Doc
  }
}