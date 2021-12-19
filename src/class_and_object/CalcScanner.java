package class_and_object;

import java.util.Scanner;

public class CalcScanner {

    public void addition(int a, int b){

        int result =a+b;
        System.out.println("Addition is "+result);
    }
    public void subtraction(int a, int b){

        int result =a-b;
        System.out.println("subtraction is "+result);
    }


    public static void main(String[] args) {

        CalcScanner obj= new CalcScanner();

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to Calculator App , please enter your choice :1 for add, 2 for sub,3 for divide and 4 for multi ");
        int choice=scanner.nextInt();
        System.out.println("Please enter value of a: ");
        int a=scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b=scanner.nextInt();

        if(choice==1) {
            obj.addition(a, b);
        }
        else if(choice==2){
            obj.subtraction(a,b);
        }
    }
}
