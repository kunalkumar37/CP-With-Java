class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String>ans=new ArrayList<>();
        
        int n=words2.length;
        for(int i=0;i<words1.length;i++){
            int count=0;
            for(int j=0;j<words2.length;j++){
                if(words1[i].contains(words2[j])){
                count++;

                }
                else{
                    count--;

                }

            }
            if(count==n){
                ans.add(words1[i]);

            }
           

        }
        return ans;
    }
}

