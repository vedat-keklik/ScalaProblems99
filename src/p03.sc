object p03 {

  def nth[T](n: Int, l: List[T]): T = (n, l) match {
    case (0, head :: _) => head
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

  nth(0, List(1, 2, 3))

}

