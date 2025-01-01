public class maximum_score {
    public int maxScore(String s) {
        int ans=Integer.MIN_VALUE;
        int ones=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;

            }
        }

        int zeroes=0;
        // the reason behind the s.length()-1 split is because we don't need to make it empty till last.
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                ones--;

            }
            if(s.charAt(i)=='0'){
                zeroes++;

                
            }
            ans=Math.max(ans,zeroes+ones);

        }
        return ans;
    }
}
