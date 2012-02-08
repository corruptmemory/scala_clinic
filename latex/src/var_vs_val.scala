val x = new StringBuilder()
x = new StringBuilder() // ->> Won't compile
x.append("updated")
x.toString // ->> "updated"

var y = new StringBuilder()
y = new StringBuilder() // ->> Works fine!
y.append("updated")
y.toString // ->> "updated"
