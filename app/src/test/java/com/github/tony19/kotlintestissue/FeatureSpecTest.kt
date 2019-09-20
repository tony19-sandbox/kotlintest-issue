package com.github.tony19.kotlintestissue

import io.kotlintest.specs.FeatureSpec

class FeatureSpecTest : FeatureSpec({
    feature("the can of coke") {
        scenario("should be fizzy when I shake it") {
            // test here
        }
        scenario("and should be tasty") {
            // test here
        }
    }
})