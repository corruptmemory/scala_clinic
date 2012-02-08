// Any number of traits
trait Bar
trait Baz
class Foo extends Bar with Baz

// Only one class, but with any number of traits
trait Bad
class Woo extends Foo with Bad

// Traits can inherit from other traits
trait Car extends Bar with Baz with Bad
