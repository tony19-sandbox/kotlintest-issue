> Demo for bug in [`kotlintest-intellij-plugin`](https://github.com/kotlintest/kotlintest-intellij-plugin) (cannot run single test in Intellij)

This bug affects only some test styles:

 * [AnnotationSpec](https://github.com/tony19-sandbox/kotlintest-issue/blob/45f9e1c/app/src/test/java/com/github/tony19/kotlintestissue/AnnotationSpecTest.kt)
 * [DescribeSpec](https://github.com/tony19-sandbox/kotlintest-issue/blob/45f9e1c/app/src/test/java/com/github/tony19/kotlintestissue/DescribeSpecTest.kt)
 * [ExpectSpec](https://github.com/tony19-sandbox/kotlintest-issue/blob/45f9e1c/app/src/test/java/com/github/tony19/kotlintestissue/ExpectSpecTest.kt)
 * [WordSpec](https://github.com/tony19-sandbox/kotlintest-issue/blob/45f9e1c/app/src/test/java/com/github/tony19/kotlintestissue/WordSpecTest.kt)

## Steps to reproduce

 1. From Android Studio 3.5, install the `kotlintest-intellij-plugin` 3.3.0.11
 2. Open one of the corresponding test files under `app/src/test`.
 3. Click the green icon next to one of the tests in the file from step 2. This opens a context menu with three options to choose from (two of which are identical). Pick the second menu option, which should run just a single test.
 4. Observe that the entire suite runs instead of the intended test from step 3.
