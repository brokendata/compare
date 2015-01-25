package com.brokendata.websites
import org.jsoup.nodes.Document

class Google (val query: String, val html: Document)

object Google extends Website {
  def apply(query: String) = {
    val formatedQuery = formatQuery(query)
    val html = downloadHTML(formatedQuery)

    new Google(formatedQuery, html)
  }

  def formatQuery(q: String): String = {
    "https://www.google.com/search?tbm=shop&q=" + q.replace(" ","+")
  }

}
