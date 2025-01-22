import java.util.*;
public class UserInputCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float number1=input.nextFloat();
        float number2=input.nextFloat();
        float addition=number1+number2;
        float subtraction,division;
        if(number1>number2)
        subtraction=number1-number2;
        else
        subtraction=number2-number1;
        float multiplication=number1*number2;
        if(number1>number2)
        division=number1/number2;
        else
        division=number2/number1;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+" is "+addition+","+subtraction+","+multiplication+" and "+division);
    }
}
