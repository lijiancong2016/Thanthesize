package size;

import java.util.Scanner;
public class ho{
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  System.out.println("������2��������");
  int a = s.nextInt();
  int b = s.nextInt();
  if(a > b){
   System.out.println(a + "����" + b);
  }else if(a < b){
   System.out.println(a + "С��" + b);
  }else{
   System.out.println(a + "����" + b);
  }
 }
}