import java.sql.SQLOutput;

public class palindrome {

  static int reverseNumber(int n) {
       int rev = 0;
       while (n > 0){
           rev = rev * 10 + n % 10;
       n = n / 10;}
   return rev;
   }

   static boolean reverseString(String s){
      s=s.toLowerCase();

      String rev = "";
      for(int i= s.length() - 1; i>=0 ; i--)
          rev = rev +s.charAt(i);

      return s.equals(rev);
   }

   public static void main(String a[]){
//       int num = 143;
//       int rev = reverseNumber(num);
//       System.out.println(num);
//
//       if(num == rev)
//       System.out.println("yes");
//       else System.out.println("no");

       String s= "leve";

       boolean res = reverseString(s);
        if(res){
            System.out.println(s + " is palindrome");
        }else System.out.println(s + " is not palindrome");
   }
}
