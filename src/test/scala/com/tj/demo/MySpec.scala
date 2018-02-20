package com.tj.demo
import org.junit.runner.RunWith
import org.specs2.mutable._
import org.specs2.runner._


object MySpec extends Specification {
  "This wonderful system" should {
    "save the world" in {
      val list = Nil
      list must beEmpty
    }
  }
}
