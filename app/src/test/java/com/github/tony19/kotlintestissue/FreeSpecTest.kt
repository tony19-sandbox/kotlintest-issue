package com.github.tony19.kotlintestissue

import io.kotlintest.shouldBe
import io.kotlintest.specs.FreeSpec

class FreeSpecTest : FreeSpec({
    "String.length" - {
        "should return the length of the string" {
            "sammy".length shouldBe 5
            "".length shouldBe 0

            5 shouldBe false
        }
        "whatever" - {
            "i don't" - {
                "care" {
                    5 shouldBe 5
                }
            }
        }
    }
    "containers can be nested as deep as you want" - {
        "and so we nest another container" - {
            "yet another container" - {
                "finally a real test" {
                    1 + 1 shouldBe 2
                }
            }
            "and another" {
                5 shouldBe true
            }
        }
    }
})