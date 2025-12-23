// Last updated: 23/12/2025, 18:35:40
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        StringBuilder sOne = new StringBuilder(s1);
4        StringBuilder sTwo = new StringBuilder(s2);
5        StringBuilder sThree = new StringBuilder(s3);
6        int c= 0;
7
8        while(!(sOne.toString().equals(sTwo.toString()) && sTwo.toString().equals(sThree.toString()))) {
9            int l1 = sOne.length();
10            int l2 = sTwo.length();
11            int l3 = sThree.length();
12            if(l1>=l2 && l1>=l3 && l1>0) {
13                sOne.deleteCharAt(l1-1);
14                c++;
15            } else if(l2>=l1 && l2>=l3 && l2>0) {
16                sTwo.deleteCharAt(l2-1);
17                c++;
18            } else if(l3>=l1 && l3>=l2 && l3>0) {
19                sThree.deleteCharAt(l3-1);
20                c++;
21            }
22        }
23        if(sOne.toString().equals("") || sTwo.toString().equals("")||sThree.toString().equals("")) return -1;
24        return c;
25    }
26}