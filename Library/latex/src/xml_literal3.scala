import scala.xml.NodeSeq

def foo(x:NodeSeq) = <div>
                       <span>{x}</span>
                     </div>

// foo:scala.xml.NodeSeq => scala.xml.Elem
