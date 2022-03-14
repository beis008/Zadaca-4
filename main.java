package OOP;
import java.util.Scanner;

public class OOP_Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String enterNumber1 = "Insert first number: ";
        String enterNumber2 = "Insert second number: ";

        Calculator myCalculator=new Calculator(0,0,3.14,0);

        System.out.println("Please select the operation:\n1 - Addition two numbers\n2 - Subtract two numbers\n3 - Multiply two numbers\n4 - Divide two numbers\n5 - Addition several numbers\n6 - Multiply several numbers\n7 - Calculate the area of a circle\nPlease enter your answer:");
        char option=reader.nextLine().charAt(0);

        if (option=='1'){
            System.out.print(enterNumber1);
            myCalculator.setNumbA(reader.nextInt());
            System.out.print(enterNumber2);
            myCalculator.setNumbB(reader.nextInt());
            int addition= myCalculator.addition();
            System.out.println(addition);
        }

        else if (option=='2'){
            System.out.print(enterNumber1);
            myCalculator.setNumbA(reader.nextInt());
            System.out.print(enterNumber2);
            myCalculator.setNumbB(reader.nextInt());
            int subtraction= myCalculator.subtraction();
            System.out.println(subtraction);
        }
        else if (option=='3'){
            System.out.print(enterNumber1);
            myCalculator.setNumbA(reader.nextInt());
            System.out.print(enterNumber2);
            myCalculator.setNumbB(reader.nextInt());
            int multiplication= myCalculator.multiplication();
            System.out.println(multiplication);
        }
        else if (option=='4'){
            System.out.print(enterNumber1);
            myCalculator.setNumbA(reader.nextInt());
            System.out.print(enterNumber2);
            myCalculator.setNumbB(reader.nextInt());
            int division= myCalculator.division();
            System.out.println(division);
        }
        else if (option=='5'){
            System.out.println("Do you want to use more numbers?");
            int n=reader.nextInt();
            int sum=0;
            System.out.println("Enter the numbers you want to add: ");
            int numberArray[]=new int[n];
            for (int i=0; i<n; i++){
                numberArray[i]=reader.nextInt();
            }
            for(int i=0;i<n;i++) {
                sum += numberArray[i];
            }
            System.out.println("The sum of numbers is " + sum);
        }
        else if (option=='6'){
            System.out.println("Do you want to use more numbers?");
            int n=reader.nextInt();
            System.out.println("Enter the numbers you want to multiply: ");
            int numberArray[]=new int[n];
            for (int i=0; i<n; i++){
                numberArray[i]=reader.nextInt();
            }
            int result=1;
            for(int i=0;i<n;i++) {
                result *= numberArray[i];
            }
            System.out.println("The sum of numbers is " + result);
        }
        else if (option=='7') {
            System.out.print("Enter the radius: ");
            myCalculator.setRadius(reader.nextDouble());
            double circleSurface = myCalculator.circleSurface();
            System.out.println("The surface of the circle is " + circleSurface);
        }
    }
}