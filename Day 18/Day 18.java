 /* THIS IS NOT MY SOLUTION, FOUND IT ON LEETCODE AND IT WAS LIFE CHANGING!*/ 
 boolean hasAlternatingBits2(int n) {
       
        n = n ^ (n>>1);
        return (n & n+1) == 0;
    }
   
    /* UNDERSTANDING THE SOLUTION: 
      n =         1 0 1 0 1 0 1 0
        n >> 1      0 1 0 1 0 1 0 1
        n ^ n>>1    1 1 1 1 1 1 1 1
        n           1 1 1 1 1 1 1 1
        n + 1     1 0 0 0 0 0 0 0 0
        n & (n+1)   0 0 0 0 0 0 0 0
      */


