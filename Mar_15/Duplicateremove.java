package Mar_15;

public class Duplicateremove {
	public static void main(String[] args) {
		String str="tusharsinghmehar";
		System.out.println("string is:"+str);
		System.out.println("new String is:"+removeDublicate(str));
	}
   public static String removeDublicate(String str) {
	   String newstr="";
	   for(int i=0; i<str.length(); i++) {
		   char ch=str.charAt(i);
		   if(newstr.indexOf(ch)==-1) {
			   newstr+=ch;
			   // newstr= newstr+ch;
			   
		   }
	   }
	   return newstr ;
	   
   }

}
