class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        Map<Character,Character> hp = new HashMap<>();

        hp.put(')','(');
        hp.put(']','[');
        hp.put('}','{');

        for(char c: s.toCharArray()){
            if(hp.containsKey(c)){
                if(st.isEmpty() || hp.get(c) != st.pop()){
                    return false;
                }
            } else if(hp.containsValue(c)){
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
