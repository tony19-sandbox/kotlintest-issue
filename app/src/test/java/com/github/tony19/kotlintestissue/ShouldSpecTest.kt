package com.github.tony19.kotlintestissue

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class ShouldSpecTest : ShouldSpec({
    "String.length" {
        should("return the length of the string") {
            "sammy".length shouldBe 5
            "".length shouldBe 0
        }

        should("be a dummy for another test") {
            " ".length shouldBe 1
        }
    }
})