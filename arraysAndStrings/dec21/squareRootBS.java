class squareRootBS {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int low = 1, high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < (long) x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return Math.round(high);
    }
}
