
package javaapplication7.pkg1;


public class JavaApplication71 {

   
    public static void main(String[] args) {
      
       System.out.println("Sucesion de Fibonacci :");
       int num1 =0;
       int num2 =1;
       int temp;
       int limite = 100;
       
       System.out.println(num1);
       System.out.println(num2);
       
       while(num2 + num1 <=limite){
           temp = num1;//temp=0;
           num1 = num2;//num=1;
           num2 = temp +num1;
           System.out.println(num2);
       }
    }
}
