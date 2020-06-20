class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> mapset = new HashMap<>();

        for (int i = 0; i < J.length(); ++i)
            mapset.put(J.charAt(i), 1);
      
        int count = 0;
        for (int i = 0; i < S.length(); ++i)
            if (mapset.containsKey(S.charAt(i)))
                count++;
        return count;
    }
}
