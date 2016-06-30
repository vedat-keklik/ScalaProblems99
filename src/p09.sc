import scala.annotation.tailrec

object p09 {
  def pack[T](ls: List[T]): List[List[T]] = {
    @tailrec
    def packRecursive[T](output: List[List[T]], ls: List[T]): List[List[T]] =
      ls match {
        case a :: b => {
          val (prev, next) = ls span {
            _ == a
          }
          packRecursive(prev :: output, next)
        }
        case Nil => output.reverse
      }

    packRecursive(Nil, ls);
  }


  pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
}
