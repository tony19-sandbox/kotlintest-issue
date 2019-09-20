package com.github.tony19.kotlintestissue

import io.kotlintest.specs.ExpectSpec

// kotlintest single runner does not work for this test
class ExpectSpecTest : ExpectSpec({
    context("a calculator") {
        expect("simple addition") {
            // test here
        }
        expect("integer overflow") {
            // test here
        }
    }
})