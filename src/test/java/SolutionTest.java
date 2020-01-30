import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void withArrayResult(){
        Solution solution = new Solution();
        int[] indexArray = solution.twoSum(new int[] {2,7,11,15}, 9);
        boolean resultCompare = Arrays.equals(indexArray, new int[] {0,1});
        Assert.assertTrue(resultCompare);
    }

    @Test
    public void withNullResult(){
        Solution solution = new Solution();
        int[] indexArray = solution.twoSum(new int[] {2,7,11,15}, 27);
        boolean resultCompare = Arrays.equals(indexArray, null);
        Assert.assertTrue(resultCompare);
    }
}
