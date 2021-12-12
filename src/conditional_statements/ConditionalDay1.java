package conditional_statements;

public class ConditionalDay1 {

    public static void main(String[] args) {

        // SYNTAX : if(condition){COOE}
        //          else{  }

        int age=20;

        if(age>18){
            System.out.println("Elligible for Voting ....");
        }
        else
        {
            System.out.println("NOT Elligible for Voting ....");
        }

        String city="AGRA";

        if(city=="AGRA"){
            System.out.println("Person Belongs to AGRA");
        }
        else
        {
            System.out.println("Person Does not  Belongs to AGRA");
        }

        // AND Operator
        if (age>18 && city=="AGRA"){

            System.out.println("Person is eligible for Voting in AGRA ");
        }
        else
        {
            System.out.println("Person is NOT eligible for Voting in AGRA ");
        }

        // OR Operator
        age=17;
        if (age>18 || city=="AGRA"){
            System.out.println("Person is eligible for Voting in AGRA ");
        }
        else {
            System.out.println("Person is eligible for Voting in AGRA ");
        }
    }
}
