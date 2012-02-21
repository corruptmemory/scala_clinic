import scala.xml.Elem

def foo(x:Elem):String = (x match {
    case <div>{y}</div> => y
    case <span>{y}</span> => y
    case <script>{y}</script> => y
    case _ => "Unhandled case"
  }).toString
