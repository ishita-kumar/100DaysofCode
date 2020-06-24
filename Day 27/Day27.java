class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,value=0,remainder=0;
        int mult=1;
        
       while(n!=0){
            remainder=n%10;  
            n=n/10;
            sum = sum+remainder;
            System.out.println("sum"+sum);
            mult=mult*remainder;
        
        }
    System.out.println("mult-sum"+mult+"-"+sum);
      return mult-sum;  
    }
}
