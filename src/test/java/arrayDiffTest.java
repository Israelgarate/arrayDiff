import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class arrayDiffTest {

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, arrayDiff.arrayDiffFnc(new int[]{1, 2}, new int[]{1}));
        assertArrayEquals(new int[] {2,2}, arrayDiff.arrayDiffFnc(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[] {1}, arrayDiff.arrayDiffFnc(new int[]{1, 2, 2}, new int[]{2}));
        assertArrayEquals(new int[] {1,2,2}, arrayDiff.arrayDiffFnc(new int[]{1, 2, 2}, new int[]{}));
        assertArrayEquals(new int[] {}, arrayDiff.arrayDiffFnc(new int[]{}, new int[]{1, 2}));
    }

}
