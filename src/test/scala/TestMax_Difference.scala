import org.example.Max_Difference
import org.scalatest.funsuite.AnyFunSuite

class TestMax_Difference extends AnyFunSuite{
  test("Max_Difference"){
    assert(Max_Difference.difference(array1= Array(2, 3, 1, 7, 9, 5, 11, 3, 5),0,1,0)===10)
  }

}
