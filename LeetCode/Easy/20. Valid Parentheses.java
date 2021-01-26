class Solution {
    public boolean isValid(String s) {
		
		String s1 = s;
        s1 = s1.replace("()", "");
        s1 = s1.replace("{}", "");
        s1 = s1.replace("[]", "");

        while (s1.length() < s.length()){
            s = s1;
            
            s1 = s1.replace("()", "");
            s1 = s1.replace("{}", "");
            s1 = s1.replace("[]", "");
            
        }
        
        if (s1.length() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
