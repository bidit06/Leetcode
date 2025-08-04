class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap = new HashMap<>();

        for(String s : strs){
            int[] key_signature = new int[26];

            for(char c : s.toCharArray()){
                key_signature[c - 'a']++;
            }

            String keyy = Arrays.toString(key_signature);
            hmap.putIfAbsent(keyy , new ArrayList<>());
            hmap.get(keyy).add(s);
        }
        
        return new ArrayList<>(hmap.values());
    }
}