import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minSpeedOnTimeTest1() {
        int[] dist = {1, 3, 2};
        double hour = 6;
        int expected = 1;
        int actual = new Solution().minSpeedOnTime(dist, hour);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minSpeedOnTimeTest2() {
        int[] dist = {1, 3, 2};
        double hour = 2.7;
        int expected = 3;
        int actual = new Solution().minSpeedOnTime(dist, hour);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minSpeedOnTimeTest3() {
        int[] dist = {1, 3, 2};
        double hour = 1.9;
        int expected = -1;
        int actual = new Solution().minSpeedOnTime(dist, hour);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void minSpeedOnTimeTest4() {
        int[] dist = {1, 1, 100_000};
        double hour = 2.01;
        int expected = 10_000_000;
        int actual = new Solution().minSpeedOnTime(dist, hour);

        Assert.assertEquals(expected, actual);
    }




    @Test
    public void minSpeedOnTimeTest5() {
        int[] dist = {5,3,4,6,2,2,7};
        double hour = 10.92;
        int expected = 4;
        int actual = new Solution().minSpeedOnTime(dist, hour);

        Assert.assertEquals(expected, actual);
    }
}
