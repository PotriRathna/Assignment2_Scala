import org.example.Replace_element
import org.scalatest.funsuite.AnyFunSuite
class TestReplace_element extends AnyFunSuite{
  test("Replace_element") {
    assert(Replace_element.replace(array1 = Array(9, 5, 8, 4, -10, 21, 6, 17, -1),8) === Array(21, 21, 21, 21, 21, 21, 17, 17, -1))
  }
}
