public class chartoInt{
public static void main(String[] args){
String str="vishn!u @priya?";
String a="";
str=str.trim();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)>=97&&str.charAt(i)<=122 || str.charAt(i)>=65&&str.charAt(i)<=90){
char c=str.charAt(i);
String b=Character.toString(c);
a=a.concat(b);
}
else if(str.charAt(i)==' '){
System.out.println(a);
}
else{
System.out.println(a);
a="";
}}
if(!a.isEmpty())
{
System.out.println(a);
}
}}