// Last updated: 02/08/2025, 18:52:28
class Solution {
    public boolean[] isPrimeWithSieve(int n) {
        boolean [] arr = new boolean[n+1];
        for(int i=2; i<=n; i++) {
            if(!arr[i]) {
                for(int j = 2*i; j<= n; j+=i) {
                    arr[j] = true;
                }
            }
        }

        return arr;
    }
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] isComposite = isPrimeWithSieve(n);
        int j = 0;
        for(int i=2; i<=n/2; i++) {
            j = n-i;
            if(!isComposite[i] && !isComposite[j]) {
                ans.add(new ArrayList<>(Arrays.asList(i,j)));
            }
        }
        return ans;
    }
}