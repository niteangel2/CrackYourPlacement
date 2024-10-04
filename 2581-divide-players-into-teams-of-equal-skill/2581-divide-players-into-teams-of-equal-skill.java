class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sum=0;
        int i=0;
        int j=skill.length-1;
        int m=skill[0]+skill[j];
        while(i<j){
            if(skill[i]+skill[j]==m)
            {
                sum+=skill[i]*skill[j];
                i++;
                j--;
                
            }
            else{
                return -1;
            }
                
        }
        return sum;
    }
}