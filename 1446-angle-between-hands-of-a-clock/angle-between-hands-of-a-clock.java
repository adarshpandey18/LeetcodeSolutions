class Solution {
    public double angleClock(int hour, int minutes) {
        return Math.min(Math.abs(11.0 / 2.0 * minutes - 30 * hour),360-Math.abs(11.0 / 2.0 * minutes - 30 * hour));
    }
}
