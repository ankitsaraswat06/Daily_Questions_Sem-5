// Last updated: 02/08/2025, 15:27:57
class Solution {
    public boolean isAlphanumeric(String str) {
        if(str.equals("")) return false;
        for(int i=0; i<str.length(); i++) {
            if(!Character.isLetterOrDigit(str.charAt(i)) && str.charAt(i)!='_') return false;
        }
        return true;
    }
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> el = new ArrayList<>();
        List<String> gr = new ArrayList<>();
        List<String> ph = new ArrayList<>();
        List<String> res = new ArrayList<>();

        for(int i=0; i<code.length; i++) {
            if(isAlphanumeric(code[i]) && !businessLine[i].equals("invalid") && isActive[i] == true) {
                if(businessLine[i].equals("electronics")) el.add(code[i]);
                else if(businessLine[i].equals("grocery")) gr.add(code[i]);
                else if(businessLine[i].equals("pharmacy")) ph.add(code[i]);
                else if(businessLine[i].equals("restaurant")) res.add(code[i]);
            }
        }

        Collections.sort(el);
        Collections.sort(gr);
        Collections.sort(ph);
        Collections.sort(res);

        List<String> combined = new ArrayList<>();
        combined.addAll(el);
        combined.addAll(gr);
        combined.addAll(ph);
        combined.addAll(res);

        return combined;

        
        
    }
}