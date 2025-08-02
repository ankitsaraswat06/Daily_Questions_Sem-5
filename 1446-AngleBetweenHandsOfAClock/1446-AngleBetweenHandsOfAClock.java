// Last updated: 02/08/2025, 18:54:37
class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = Math.abs((30*hour)-(5.5*minutes));
        return Math.min(angle, 360-angle);
    }
}