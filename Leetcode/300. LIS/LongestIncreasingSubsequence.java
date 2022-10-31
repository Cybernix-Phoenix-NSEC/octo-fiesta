This can be solved by 
RECURSION : T.C = O(2^n)   S.C = O(N) with aux stack space
MEMOIZATION: T.C = O(N*N)  S.C = O(N)
TABULATION

BINARY SEARCH:   TC - O(N*logN)
  
  "Binary search solution"
  
  class Solution {
    public int search(ArrayList<Integer> list, int key ){
        
        int l = 0, r= list.size()-1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(list.get(m)==key){
                return m;
            }
            else if(list.get(m)>key){
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        //If control comes over here it means the key is not present in the list
        return l;
        
    }
      
    public int lengthOfLIS(int[] nums) {
        //MAKE AN ARRAYLIST FOR FAKE LONGEST INCREASING SUBSEQ
      ArrayList<Integer> list = new ArrayList<>();
      
      for(int i =0;i<nums.length;i++){
            if(i==0||list.get(list.size()-1)<nums[i]){
                list.add(nums[i]);
            }
            else{
                //search for the element
                // if present do nothing if not change the successive index with the element
                int index = search(list,nums[i]);
                list.set(index,nums[i]);
                
            }
      }
       return list.size();
        
    }
}


  
  
  
  
  //TABULATION METHOD
  class Solution {

    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);
        int ans = 1;
        for(int i =0;i<nums.length;i++){
            int maxSeq = 0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    maxSeq = Math.max(maxSeq,dp[j]);
                }
            }
            dp[i] = 1+maxSeq;
            ans = Math.max(dp[i],ans);
        }
        
        return ans;
        
    }
}
