//********************************************************************
//  Demonstrates the use of a formal interface.
//********************************************************************

public class SecretTest
{
   //-----------------------------------------------------------------
   //  Creates a Secret object and exercises its encryption.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Secret hush = new Secret ("Crack me and hack me!");
      System.out.println (hush);

      hush.encrypt();
      System.out.println (hush);

      hush.decrypt();
      System.out.println (hush);
   }
}