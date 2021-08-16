
import org.example.Count_numbers
import org.scalatest.funsuite.AnyFunSuite

class TestCount_number extends AnyFunSuite{
  test("Count_numbers") {
    assert(Count_numbers.countnumber(list1 = List(67,2,4,5,6,23))===6)
  }

}
