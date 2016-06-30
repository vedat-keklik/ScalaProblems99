import scala.annotation.tailrec

object p08 {

  var cnt1 = 0;
  var cnt2 = 0;

  def compress[T](ls: List[T]): List[T] = {
    @tailrec
    def compressRecursive[T](output: List[T], ls: List[T]): List[T] = ls match {
      case a :: b :: tail => {
        cnt1 = cnt1 + 1;
        if (a == b) compressRecursive(output, b :: tail)
        else compressRecursive(a :: output, b :: tail)
      }
      case b :: Nil => cnt1 = cnt1 + 1; (b :: output).reverse
      case Nil => cnt1 = cnt1 + 1; output
    }
    compressRecursive(Nil, ls);
  }

  // original solution:
  def compressTailRecursive[A](ls: List[A]): List[A] = {
    @tailrec
    def compressR(result: List[A], curList: List[A]): List[A] = curList match {
      case h :: tail => cnt2 = cnt2 + 1; compressR(h :: result, tail.dropWhile(_ == h))
      case Nil => cnt2 = cnt2 + 1; result.reverse
    }
    compressR(Nil, ls)
  }

  /*
    If N is a small number, then "compress" computes the solution
    faster than "compressTailRecursive"

    On the other hand compressTailRecursive is way faster than my own implementation
    when N becomes ~100000 level.

   */
  val list = List('a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a, 'a)
  compress(list)
  compressTailRecursive(list)
  cnt1
  cnt2
}
