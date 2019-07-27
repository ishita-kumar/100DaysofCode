class Solution {
    public int removeDuplicates(int[] num) {
      if(num.length == 0) return 0;
      int sorted = 1;
      for(int i = 1; i < num.length; i++){
        if(num[i] != num[i - 1]){
          num[sorted] = num[i];
          sorted++;
        }
      }
      return sorted;
    }
}