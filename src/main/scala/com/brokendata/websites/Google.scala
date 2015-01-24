package com.brokendata.websites

/**
 * Created by ryan on 1/23/15.
 */
object Google {

  def search(q: String): String = {
    "https://www.google.com/search?tbm=shop&q=" + q.replace(" ","+")
  }

}
