package com.brokendata.scrapers


trait Scraper {
  def downloadPrices(page: String): String
}


