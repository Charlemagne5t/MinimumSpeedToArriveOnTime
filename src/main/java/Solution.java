public class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if (hour < dist.length - 1) {
            return -1;
        }
        int result = -1;

        int left = 1;
        int right = 10_000_000;
        int mid = left + (right - left) / 2;

        while (left <= right) {
            mid = left + (right - left) / 2;
            double currentTime = calculateTime(mid, dist);

            if (currentTime > hour) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }

        return result;
    }

    private double calculateTime(int speed, int[] distances) {
        double time = 0.0;
        for (int i = 0; i < distances.length - 1; i++) {
            time += Math.ceil((double) distances[i] / speed);
        }
        time += (double) distances[distances.length - 1] / speed;

        return time;
    }
}
