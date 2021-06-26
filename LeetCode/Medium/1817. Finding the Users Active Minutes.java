class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] temp1 = new int[k];
        
        HashMap<Integer, ArrayList<Integer>> a1 = new HashMap();
        
        for(int[] log: logs){
            int id = log[0];
            int time = log[1];
            
            if (!a1.containsKey(id)){
                a1.put(id, new ArrayList<Integer>());
            }
            
            if (!a1.get(id).contains(time)){
                a1.get(id).add(time);
            }
        }
        
        for(int id: a1.keySet()){
            int temp = a1.get(id).size();
            temp1[temp-1]++;
        }
        
        return temp1;
    }
}
