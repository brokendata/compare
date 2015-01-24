package com.brokendata.scrapers
import org.jsoup.nodes.Document

trait Scraper {
  def downloadHTML(url: String): Document
  def downloadPrices(page: String): String
}


