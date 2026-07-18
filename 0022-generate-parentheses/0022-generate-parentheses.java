class Solution {
    void addingparenthesis(List <String> res,int n,int open,int close,String unprocessed){
        if(unprocessed.length()==2*n){
            res.add(unprocessed);
            return;
        }
        if(open<n) addingparenthesis(res,n,open+1,close,unprocessed+"(");
        if(close<open) addingparenthesis(res,n,open,close+1,unprocessed+")");

    }
    public List<String> generateParenthesis(int n) {
        List<String> str=new ArrayList<>();
        addingparenthesis(str,n,0,0,"");
        return str;
    }
}