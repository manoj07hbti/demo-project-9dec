package class_and_object;

public class MethodWithInput {

    // Syntax : access_specifier return_type  method_name (parameter) {}

    public String method1(String name){

        String output=name + " Welcome to java ";
        ///System.out.println(output);

        return output;
    }

    public void checkEligibilty(int age,String name){

        if(age>18){
            System.out.println(name + " is Eligible for Voting ");
        }
        else {
            System.out.println(name +"  is NOT Eligible for Voting ");
        }
    }

    public static void main(String[] args) {
        MethodWithInput obj = new MethodWithInput();
       System.out.println(obj.method1("Raj"));

       obj.checkEligibilty(12,"Rahul");
    }
}
