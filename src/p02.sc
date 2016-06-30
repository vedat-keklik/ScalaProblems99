object p02{

  def penultimate[T](l:List[T]) : T = l match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  penultimate(List(1,1,2,3,5,8))

}

