import org.example.Remove_oddposition
import org.scalatest.funsuite.AnyFunSuite

class TestRemove_oddposition extends AnyFunSuite{
  test("Remove_oddposition") {
    assert(Remove_oddposition.remove(List(2, 5, 3, 4, 6, 7, 8, 9))===List(5,4,7,9))
  }

}
