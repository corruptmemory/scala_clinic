def foo(x:Int, // Int's are value types
        y:String, // Strings are reference types
        z: => String):String = // Something that eventally will result in a string
  if (x < 0) y
  else z // Exression only forced if this branch evaluated
