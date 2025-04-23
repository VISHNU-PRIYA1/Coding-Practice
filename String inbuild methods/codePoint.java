public class codePoint{
public static void main(String[] args){
String s="Vishnu te";
for(int i=0;i<s.length();i++)
{
System.out.println(s.codePointAt(i));
System.out.println(s.codePointBefore(i+1));
}
System.out.println(s.codePointCount(0,s.length()));
}}
