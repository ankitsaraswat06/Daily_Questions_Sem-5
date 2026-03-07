// Last updated: 07/03/2026, 14:25:23
1class Solution {
2    public int[] sortByBits(int[] arr) {
3        Integer[] intArr = new Integer[arr.length];
4        for(int i=0; i<arr.length; i++) {
5            intArr[i] = arr[i];
6        }
7        Arrays.sort(intArr, (a,b) -> {
8            int bitCountA = Integer.bitCount(a);
9            int bitCountB = Integer.bitCount(b);
10            return bitCountA == bitCountB ? Integer.compare(a,b) : Integer.compare(bitCountA, bitCountB);
11        });
12        for(int i=0; i<arr.length; i++) {
13            arr[i] = intArr[i];
14        }
15        return arr;
16    }
17}