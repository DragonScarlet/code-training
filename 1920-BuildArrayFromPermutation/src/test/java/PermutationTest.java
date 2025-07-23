import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kuma.Permutation;

class PermutationTest {

    @Test
    void test_001() {
        int[] result = Permutation.buildArray(new int[]{0,2,1,5,3,4});
        Assertions.assertArrayEquals(new int[]{0,1,2,4,5,3}, result);
    }

    @Test
    void test_002() {
        int[] result = Permutation.buildArray(new int[]{5,0,1,2,3,4});
        Assertions.assertArrayEquals(new int[]{4,5,0,1,2,3}, result);
    }
}
