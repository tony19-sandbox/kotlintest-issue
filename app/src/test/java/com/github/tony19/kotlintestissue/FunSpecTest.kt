package com.github.tony19.kotlintestissue

import io.kotlintest.shouldBe
import io.kotlintest.specs.FunSpec

class FunSpecTest : FunSpec({
    context("a test group") {
        test("String length should return the length of the string") {
            "sammy".length shouldBe 5
            "".length shouldBe 0
        }

        test("dummy for another test") {
            " ".length shouldBe 1
        }
    }
})
