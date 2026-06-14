class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> hp = new HashMap<>();
        for(char c: s1.toCharArray()){
            hp.put(c,hp.getOrDefault(c,0) + 1);
        }

        int need = hp.size();

        for(int i=0;i<s2.length();i++){
            Map<Character, Integer> hm = new HashMap<>();
            int cur = 0;
            for(int j=i;j<s2.length();j++){
                char c = s2.charAt(j);
                hm.put(c,hm.getOrDefault(c,0)+1);

                if(hp.getOrDefault(c,0) < hm.get(c)){
                    break;
                }

                if(hp.getOrDefault(c,0) == hm.get(c)){
                    cur++;
                }

                if(cur == need){
                    return true;
                }
            }
        }
        return false;
    }
}
