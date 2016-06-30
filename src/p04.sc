object p04 {

  def length[T](l: List[T]): Int = {

    def lengthRecursive[T](n:Int,l: List[T]): Int = (n,l) match {

      case (_,Nil)=> n
      case (_,_::tail)=>lengthRecursive(n+1,tail)

    }
    lengthRecursive(0,l)

  }

  length(List(1,2,3,4,5,6))

}

