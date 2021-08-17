import org.example.Max_Product
import org.scalatest.funsuite.AnyFunSuite

class TestMax_Product extends AnyFunSuite{
  test("Max_product") {
    assert(Max_Product.product(array1 = Array(2, 3, 1, 7, 9, 5, 11, 3, 5),0,1,0)===99)
  }

}
