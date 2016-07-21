Class power{
Public String longestCommonPrefix(String[] strs) {
    String longestPrefix = "";
    if(strs.length>0){
        longestPrefix = strs[0];
    }
    for(int i=1; i<strs.length; i++){
        String analyzing = strs[i];
        int j=0;
        for(; j<Math.min(longestPrefix.length(), strs[i].length()); j++){
            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
                break;
            }
        }
        longestPrefix = strs[i].substring(0, j);
    }
    return longestPrefix;
Public class Prefix{
Public static void main (String args[])
{
String s1="http//google_ghhj_gjk";
power p=new power();
p.lingestCommonprefix(s1);
}}
