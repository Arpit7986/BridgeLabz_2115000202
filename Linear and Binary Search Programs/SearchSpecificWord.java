import java.util.Scanner;

public class SearchSpecificWord {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String []originalString = new String[size];
        input.nextLine();
        for(int i = 0;i < size;i++){
            originalString[i] = input.nextLine();
        }

        System.out.println("Enter the word to search: ");
        String word = input.next();
        int index = searchWord(originalString, word);
        if(index == -1){
            System.out.println("Not found");
            return;
        }
        System.out.println("Sentence Containing Word is: " + originalString[index]);
    }

    public static int searchWord(String []originalString, String word){
        for(int i = 0;i < originalString.length;i++){
            if(originalString[i].indexOf(word) != -1){
                return i;
            }
        }
        return -1;
    }
}