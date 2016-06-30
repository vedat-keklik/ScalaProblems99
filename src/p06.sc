object p06 {


  def isPalindromeRecursive[T](l: List[T]): Boolean = l match {

    case head::Nil => true
    case a::b::Nil => a==b
    case l => if(l.head==l.last) isPalindromeRecursive(l.tail.init) else false

  }


  isPalindromeRecursive(List(1,2,3,3,2,1))
  isPalindromeRecursive(List(1,2,3,2,1))
  isPalindromeRecursive(List(1,2,2,1))
  isPalindromeRecursive(List(1,2,1))
  isPalindromeRecursive(List(1,1))
  isPalindromeRecursive(List(1))

  isPalindromeRecursive(List(1,2,3,4,5,6))
  isPalindromeRecursive(List(1,2,2))

}

