object p05 {

  def reverse[T](l: List[T]): List[T] = {

    def reverseRecursive[T](output:List[T],l: List[T]): List[T] = l match {

      case Nil => output
      case head::tail=>reverseRecursive(head::output, tail)

    }
    reverseRecursive(Nil,l)

  }

  reverse(List(1,2,3,4,5,6))

}

