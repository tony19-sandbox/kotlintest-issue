package com.github.tony19.kotlintestissue

import io.kotlintest.shouldBe
import io.kotlintest.specs.AbstractAnnotationSpec
import io.kotlintest.specs.AnnotationSpec

// kotlintest single runner does not work for this test (no gutter icon at all)
class AnnotationSpecExample : AnnotationSpec() {

    @AbstractAnnotationSpec.BeforeEach
    fun beforeTest() {
        println("Before each test")
    }

    @AbstractAnnotationSpec.Test
    fun test1() {
        1 shouldBe 1
    }

    @AbstractAnnotationSpec.Test
    fun test2() {
        3 shouldBe 3
    }
}