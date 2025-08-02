class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String , Integer> first_str = new HashMap<>();
        HashMap<String , Integer> second_str = new HashMap<>();
        int count = 0;

        for(int left = 0 ; left < s.length() ; left++){
            if(!first_str.containsKey(s.charAt(left) + "")){
                count = 1;
                for(int right = left+1 ; right < s.length() ; right++){
                    if(s.charAt(left) == s.charAt(right)){
                        count = count + 1;
                    }
                }
                first_str.put(s.charAt(left) +"" , count);
            }
        }
        
        for(int left = 0 ; left < t.length() ; left++){
            if(!second_str.containsKey(t.charAt(left) + "")){
                count = 1;
                for(int right = left+1 ; right < t.length() ; right++){
                    if(t.charAt(left) == t.charAt(right)){
                        count = count + 1;
                    }
                }
                second_str.put(t.charAt(left) +"" , count);
            }
        }

        
        if (first_str.equals(second_str)) {
            return true;
        } else {
            return false;
        }
        
        
    }
}