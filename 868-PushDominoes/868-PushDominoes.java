// Last updated: 02/08/2025, 18:55:41
class Solution {
    public String pushDominoes(String dominoes) {
        StringBuilder ans = new StringBuilder();
        int n = dominoes.length();
        int[] forces = new int[n];
        
        int force = 0;
        for(int i=0; i<n; i++) {
            if(dominoes.charAt(i) == 'R') {
                force = n;
            } else if(dominoes.charAt(i) == 'L') {
                force = 0;
            } else {
                force = Math.max(force-1, 0);
            } 
            forces[i] += force;
        }

        force = 0;
        for(int i=n - 1; i>=0; i--) {
            if(dominoes.charAt(i) == 'L') {
                force = n;
            } else if(dominoes.charAt(i) == 'R') {
                force = 0;
            } else {
                force = Math.max(force-1, 0);
            } 
            forces[i] -= force;
        }

        for(int i=0; i<n; i++) {
            if(forces[i]> 0) {
                ans.append('R');
            } else if(forces[i] < 0) {
                ans.append('L');
            } else {
                ans.append('.');
            }
        } 
        

        return ans.toString();
        
    }
}