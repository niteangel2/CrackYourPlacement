class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st = new Stack<>();
        int cnt = 1;
        st.push(cnt);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < pattern.length();i++) {
            if(pattern.charAt(i) == 'I') {
                while(st.size() > 0) {
                    sb.append(st.pop());
                }
                st.push(++cnt);
            }
            else if(pattern.charAt(i) == 'D') {
                st.push(++cnt);
            }
        }
        while(! st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}