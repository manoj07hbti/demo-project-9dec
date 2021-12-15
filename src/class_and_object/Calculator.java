package class_and_object;

public class Calculator {

    // add, subtract a-b, multi a*b, divide a/b

    // Syntax : access_specifier return_type  method_name (parameter) {}

    public void addition(){

        int a=5;
        int b=3;
        int result= a+b;

        System.out.println("Addition of a and b is : "+result);
    }

    public static void main(String[] args) {

        //Step 1
        Calculator obj= new Calculator();
        obj.addition();

    }
}
