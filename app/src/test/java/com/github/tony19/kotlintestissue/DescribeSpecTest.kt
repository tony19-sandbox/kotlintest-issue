package com.github.tony19.kotlintestissue

import io.kotlintest.specs.DescribeSpec

// kotlintest single runner does not work for this test
class DescribeSpecTest : DescribeSpec({
    describe("foo") {
        it("start as zero") {
            // test here )
        }
    }
    describe("score") {
        it("start as zero") {
            // test here
        }
        context("with a strike") {
            it("adds ten") {
                // test here
            }
            it("carries strike to the next frame") {
                // test here
            }
        }

        describe("for the opposite team") {
            it("Should negate one score") {
                // test here
            }
        }
    }
})