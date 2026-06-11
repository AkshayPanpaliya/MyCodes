class Solution {
    int count=0;
    int steps(int num)
    {
        if(num==0) return 0;
        if(num%2==0)
        {
            num=num/2;
        }
        else
        {
            num=num-1;
        }
        count++;
        steps(num);
        return count;

    }
    public int numberOfSteps(int num) {
      steps(num);
      return count;
      
    }
}