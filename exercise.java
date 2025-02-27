import java.util.*;
public class exercise{
    public static void main(String[]args){
        //Write a Java program to print 'Hello' on screen and your name on a separate line.
       Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello");
        System.out.println(name);

        //Write a Java program to print the sum of two numbers
        int numbe1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=numbe1 + num2;
        System.out.println("Sum" + sum);

        //Write a Java program to divide two numbers and print them on the screen.
        float num=sc.nextFloat();
        float numb=sc.nextFloat();
        float quotient=num/numb;
        System.out.println("answer is"+quotient);

      //  Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3 
        //a
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20 + -3*5 /8);
        System.out.println(5+15/3*2-8%3);

       // Write a Java program that takes two numbers as input and displays the product of two numbers.
        int num1 = sc.nextInt();
       int number1 = sc.nextInt();
       int product= num1*number1;
       System.out.println("Product:"+product);

       //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        int numb1=125;
        int numb2=24;
        System.out.println(numb1+numb2);
        System.out.println(numb1-numb2);
        System.out.println(numb1*numb2);
        System.out.println(numb1/numb2);
        System.out.println(numb1%numb2);
        
        //Write a Java program that takes a number as input and prints its multiplication table up to 10.
        int multiplicant=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+multiplicant+"="+multiplicant*i);

        }
        Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
        //Write a Java program to display the following pattern.

        System.out.println("    j   a v     v a");
        System.out.println("    j  a a v   v a a");
        System.out.println("j   j a a a v v a a a");
        System.out.println(" jjj a     a v a     a");

        //Write a Java program to print the area and perimeter of a circle.
        double radius=sc.nextDouble();
        double perimeter=2*Math.PI* radius;
        double area= Math.PI *radius * radius;
        System.out.println(perimeter);
        System.out.println(area);
        
        //Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        int avg1=sc.nextInt();
        int avg2=sc.nextInt();
        int avg3=sc.nextInt();
        double averagee=( avg1 + avg2 + avg3 )/3;
        System.out.println(averagee);

        //rectangle: area and perimeter
       double length=sc.nextDouble();
        double width=sc.nextDouble();
        double perimeterr= 2 * length + width;
        double areaa=length*width;
        System.out.println("Perimeter: "+ perimeterr);
        System.out.println("Area: "+ areaa);

        //Write a Java program to swap two variables.
        String a="ab";
        String b="ba";
        String temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

        //Decimal to binary conversion
    }
}
