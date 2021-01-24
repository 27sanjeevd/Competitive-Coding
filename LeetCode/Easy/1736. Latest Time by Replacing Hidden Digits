class Solution {
    public String maximumTime(String time) {
        
        String[] temp1 = time.split(":");
        
        String[] temp2 = temp1[0].split("");
        
        if (temp2[0].equals("?") && temp2[1].equals("?")){
            temp2[0] = "2";
            temp2[1] = "3";
        }
        else if (temp2[0].equals("?")){
            if (Integer.parseInt(temp2[1]) > 3){
                temp2[0] = "1";
            }
            else{
                temp2[0] = "2";;
            }
        }
        else if (temp2[1].equals("?")) {
            if (Integer.parseInt(temp2[0]) == 2){
                temp2[1] = "3";
            }
            else{
                temp2[1] = "9";;
            }
        }
        String[] temp3 = temp1[1].split("");
        
        if (temp3[0].equals("?") && temp3[1].equals("?")){
            temp3[0] = "5";
            temp3[1] = "9";
        }
        else if (temp3[0].equals("?")){
            temp3[0] = "5";
        }
        else if (temp3[1].equals("?")) {
            temp3[1] = "9";
        }
        
        String output = "";
        output = temp2[0] + temp2[1] + ":" + temp3[0] + temp3[1];
        
        return output;
    }
}
