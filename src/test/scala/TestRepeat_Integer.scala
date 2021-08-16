import org.example.Repeat_Integer
import org.scalatest.funsuite.AnyFunSuite

class TestRepeat_Integer extends AnyFunSuite{

    test("Repeat_Integer") {
      assert( Repeat_Integer.repeat(List(1,2,3,4),2)===List(1,1,2,2,3,3,4,4 ))
    }
}
