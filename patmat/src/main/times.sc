import patmat._

object tiempo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  Huffman.times("y tu mama tambien".toList)       //> res0: List[(Char, Int)] = List((y,1), ( ,3), (t,2), (u,1), (m,3), (a,3), (b,
                                                  //| 1), (i,1), (e,1), (n,1))
  val ordList = Huffman.makeOrderedLeafList(Huffman.times("ym tuma mamma".toList))
                                                  //> ordList  : List[patmat.Huffman.Leaf] = List(Leaf(u,1), Leaf(t,1), Leaf(y,1),
                                                  //|  Leaf( ,2), Leaf(a,3), Leaf(m,5))
  Huffman.combine(ordList)                        //> res1: List[patmat.Huffman.CodeTree] = List(Fork(Leaf(u,1),Leaf(t,1),List(u, 
                                                  //| t),2), Leaf(y,1), Leaf( ,2), Leaf(a,3), Leaf(m,5))
}