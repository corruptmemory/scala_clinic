// If expressions yield a value
val x = if (fuBar == 9) "nine"
        else "not nine"

// Chained if elses
val y = if (fuBar == 1) "one"
        else if (fuBar == 2) "two"
        else "something else"

// imperative if
if (fuBar == 10) println("fuBar is equal to ten")

// Multi-line expressions are bracketed
val z = if (fuBar == 0) {
          val r = rand.next()
          r.toString
        } else "non-zero"
