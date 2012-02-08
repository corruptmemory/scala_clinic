// File: package.scala
package foo

package object bar {
  def printBar = println("bar")
}

// File: Foo.scala
package foo.bar

class Foo {
  def foo = printBar
}
