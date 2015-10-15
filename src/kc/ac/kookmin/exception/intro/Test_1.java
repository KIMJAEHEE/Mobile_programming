package kc.ac.kookmin.exception.intro;
import java.io.*;

class AAA
{
   public void readFile()
   {
      try {
         FileWriter reader=new FileWriter("c:\\a.txt");
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public void close() {
   
   }
}
public class Test_1 {   
	public static void main(String[] args) {
    
    AAA a=new AAA();
    a.readFile();
    
    String path = AAA.class.getResource("").getPath(); 
    File path1 = new File(".");  System.out.println(path1.getAbsolutePath());
    
    a.close();
 }

}
