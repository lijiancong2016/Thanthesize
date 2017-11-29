package size;

import java.util.Scanner;
public class ho{
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  System.out.println("请输入2个整数：");
  int a = s.nextInt();
  int b = s.nextInt();
  if(a > b){
   System.out.println(a + "大于" + b);
  }else if(a < b){
   System.out.println(a + "小于" + b);
  }else{
   System.out.println(a + "等于" + b);
  }
 }
}