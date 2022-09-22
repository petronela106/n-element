import java.util.*;
class Solution{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt(),i=1;
String s="";
while(s.length()<n){
s+=i+"";i++;
}
System.out.println(
s.charAt(n-1));
}
}

