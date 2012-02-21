// simple symbol import
import java.io.File

// wildcard import
import java.io._

// multiple imports from same parent namespace
import java.io.{File,FileInputStream}

// nested imports
import java.io.File, File._

// rename symbol
import java.io.{File => JFile}
