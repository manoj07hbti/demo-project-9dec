package class_and_object;

public class CalcInputParam {

    public void addition(int a, int b){

        int result =a+b;
        System.out.println("Addition is "+result);
    }


    public static void main(String[] args) {

        CalcInputParam obj= new CalcInputParam();

        obj.addition(18,7);
    }
}
