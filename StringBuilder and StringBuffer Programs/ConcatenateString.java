import java.util.Scanner;

public class ConcatenateString{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String []originalString = new String[size];
        for(int i = 0;i < size;i++){
            originalString[i] = input.next();
        }

        System.out.println("Original String Before Concatenation: ");
        for(int i = 0;i < size;i++){
            System.out.print(originalString[i] + ", ");
        }

        String str = concatenate(originalString);
        System.out.println("\nOriginal String After Concatenation: " + str);

    }

    public static String concatenate(String []originalString){
        StringBuffer str = new StringBuffer();
        for(int i = 0;i < originalString.length;i++){
            str.append(originalString[i]);
        }
        return str.toString();
    }
}