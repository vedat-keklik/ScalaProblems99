import java.util.NoSuchElementException

object p01{

  def lastRecursive[T](l:List[T]) : T = l match {
    case h :: Nil => h
      /* This case defines that end of the list

         Example: 5,Nil
         In this example "h" is 5, because the next
         element is Nil
       */
    case _ :: tail => lastRecursive(tail)
      /* If first case fails
         then this case will be checked

         Example: 1,2,3,4,5,Nil
         In this example "tail" is (2,3,4,5)
       */
    case _ => throw new NoSuchElementException
      /* If there is no head or tail in the list
         then function will throw an exception
       */
  }

  lastRecursive(List(1,2,3,4,5,6,7,8))

}

