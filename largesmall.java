public String minCat(String a, String b) {
  if(a.length()>b.length())
  {
    return a.substring(1)+b.substring(0);
  }
  else if(a.length()<b.length())
  {
    return a.substring(0)+b.substring(1);
  }
  else
  {
    return a+b;
  }
}
public static void main(String[] args){
mincat("hello","hi");
