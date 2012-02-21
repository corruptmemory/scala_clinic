// 0 or more indicated with a '*'
def foo(prefix:String,args:Int*):Unit =
  println("%s: %s".format(prefix,List(args:_*))) // "splat" with ':_*'
