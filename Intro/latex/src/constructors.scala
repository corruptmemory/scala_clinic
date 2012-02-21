// Trivial
class Foo
val x = new Foo() // Does nothing, but works

// Define a private value in the constructor
class Foo(x:Int) // Type annoation on arguments *always* required
val x = new Foo(8) // The '8' is trapped inside a Foo, never to escape

// Define a read-only value as an argument
class Foo(val x:Int)
val x = new Foo(8)
x.x // ->> returns 8
x.x = 9 // ->> Will not compile: cannot set a 'val'

// Define a read/write value
class Foo(var x:Int)
val x = new Foo(8)
x.x // ->> returns 8
x.x = 9 // ->> Works! x.x == 9
