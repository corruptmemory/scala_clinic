// Simple
for (i <- 1 to 100) yield i+1
// translates to
Range.inclusive(1,100).map(i => i+1)

// Guarded
for (i <- 1 to 100 if i%2==0) yield i+1
// translates to
Range.inclusive(1,100).withFilter(i => i%2 == 0).map(i => i+1)

// Nested
for (i <- 1 to 100; j <- i to 100) yield i+j
// translates to
Range.inclusive(1,100).flatMap(i => Range.inclusive(i,100).map(j => i+j))
