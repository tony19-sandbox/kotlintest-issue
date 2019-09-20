package com.github.tony19.kotlintestissue

import io.kotlintest.shouldBe
import io.kotlintest.specs.WordSpec

// kotlintest single runner does not work for this test
class WordSpecTest : WordSpec({
    "Hello" When {
        "asked for length" should {
            "return 5" {
                "Hello".length shouldBe 5
            }
        }
        "appended to Bob" should {
            "return Hello Bob" {
                "Hello " + "Bob" shouldBe "Hello Bob"
            }
        }
    }
})