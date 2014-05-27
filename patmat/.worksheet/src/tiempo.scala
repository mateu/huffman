import patmat._

object tiempo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(44); val res$0 = 
  Huffman.times("y tu mama tambien".toList);System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(83); 
  val ordList = Huffman.makeOrderedLeafList(Huffman.times("ym tuma mamma".toList));System.out.println("""ordList  : List[patmat.Huffman.Leaf] = """ + $show(ordList ));$skip(27); val res$1 = 
  Huffman.combine(ordList);System.out.println("""res1: List[patmat.Huffman.CodeTree] = """ + $show(res$1))}
}
