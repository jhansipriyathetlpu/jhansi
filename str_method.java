class str
{
 public static void main(String ar[])
 {
//length
 String s="hello world",s1="Welcome";
 System.out.println("length="+s.length());
//compare
 System.out.println("compare('a','a')="+"a".compareTo("a"));
 System.out.println("compare="+s.compareTo(s1));
 System.out.println("compare="+"Abc".compareToIgnoreCase("ab"));
//equals
 System.out.println("equal="+s.equals(s1));
 System.out.println("equal(case)="+"All".equalsIgnoreCase("all"));
//starts and ends with
 System.out.println("startswith('h')="+s.startsWith("H"));
 System.out.println("endswith('come')="+s1.endsWith("come"));
//substring
 System.out.println("substring(2,7)="+s.substring(2,7));
 System.out.println("Substring="+s1.substring(2));
//replace
 System.out.println("replace="+s.replace('l','o'));//all occurances of char
 System.out.println(s);//immutable
 System.out.println("replace="+s1.replace("Wel","here"));//all occurances of string
 System.out.println(s1);//immutable
 System.out.println("replacfirst="+s.replaceFirst("l","o"));
 System.out.println("replaceAll="+s.replaceAll("l","o"));
//concat 
 System.out.println("concate="+s.concat(s1));

 System.out.println("character="+s.charAt(3));

 System.out.println("index="+s.indexOf("o"));
 
 System.out.println("last index="+s.lastIndexOf("l"));
 }
}