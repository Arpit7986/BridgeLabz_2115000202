import java.util.*;
public class UserInputConvertKmToMiles {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double km=input.nextDouble();
        double conversionToMiles=(km*1.6);
        System.out.println("The total miles is "+conversionToMiles+" mile for the given "+km+" km");
    }
}
