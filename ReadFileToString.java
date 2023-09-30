import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileToString {
    public static void main(String[] args) {
        System.out.println("enter \n1.to give a file as input\n2.to give a sentence as input");
        Scanner scann = new Scanner(System.in);

        String userInput;

        int num = scann.nextInt();
        if (num == 1) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the path to the file: ");
            String filePath = scanner.nextLine();

            try {
                userInput = readFileToString(filePath);
                System.out.println("File content:\n" + userInput);

                int count = 0;
                if (userInput.length() == 0) {
                    count = 0;
                } else {
                    count++;
                    for (int i = 0; i < userInput.length(); i++) {
                        if (userInput.charAt(i) == ' ' && userInput.charAt(i + 1) != ' ') {
                            count++;
                        }
                    }
                }
                System.out.println("word count= " + count);

            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            } finally {
                scanner.close();
            }
        } else if (num == 2) {
            Scanner scan = new Scanner(System.in);
            userInput = scan.nextLine();
            scan.close();
            userInput = userInput.trim();
            int count = 0;
            if (userInput.length() == 0) {
                count = 0;
            } else {
                count++;
                for (int i = 0; i < userInput.length(); i++) {
                    if (userInput.charAt(i) == ' ' && userInput.charAt(i + 1) != ' ') {
                        count++;
                    }
                }
            }
            System.out.println("word count= " + count);

        } else {
            System.out.println("you need to enter 1 or 2");
        }
    }


    public static String readFileToString(String filePath) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        }
        return stringBuilder.toString();
    }
}