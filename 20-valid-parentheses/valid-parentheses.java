class Solution {
    public boolean isValid(String s) {
        
        HashMap<Character , Character> hmap = new HashMap<>();
        hmap.put(')' , '(');
        hmap.put(']' , '[');
        hmap.put('}' , '{');

        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()){
            if(hmap.containsKey(c)){
                if(!stk.isEmpty() && stk.peek() == hmap.get(c)){
                    stk.pop();
                }
                else{
                    return false;
                }

            }
            else{
                stk.push(c);
            }
        }

        return stk.isEmpty();

    }

}