import java.io.IOException;

public class CharToNum {

    public static void main(String[] args) {
        int inChar;
        System.out.println("Enter a Character:");
        try {
            inChar = System.in.read();
            System.out.print(Character.isDigit(inChar) + "\n");
            System.out.print("The result is: " + inChar);
        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }
    }
}

//char ch = 'h';
//int pos = ch - 'a' + 1;

