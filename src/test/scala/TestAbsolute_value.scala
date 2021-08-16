import org.example.Absolute_value
import org.scalatest.funsuite.AnyFunSuite

class TestAbsolute_value extends AnyFunSuite{
  test("Absolute_value") {
    assert(Absolute_value.absolute(list1 = List(1, -2, -3, 4, -5, -6))===List(1,2,3,4,5,6))
  }
}
