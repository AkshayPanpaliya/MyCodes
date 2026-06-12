class Solution {
    public void check(int n,List<String>list,String curr,int open,int close)
    {
        if(curr.length()==2*n)
        {
            list.add(curr);
            return;
        }
        if(open<n)
        {
            check(n,list,curr+"(",open+1,close);
        }
        if(close<open)
        {
            
            check(n,list,curr+")",open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        int left=0;
        int right=0;
        String curr="";
        check(n,list,curr,left,right);
        return list;
    }
}