public int numberOfSteps (int num) {
        
      int steps=0;
        while(num>0)
        {
             // check if num is odd and sub 1 from it.
            if((num & 1) >0)
            {
                num=num ^1;
            }
            else
            {   // if num is even , divide by 2(right shift by 1 bit)
                num=num>>1;
            }
            steps++;
        }

        return steps;
        
    }
