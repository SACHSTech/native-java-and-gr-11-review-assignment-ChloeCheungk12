package gr11review.part1;

import java.io.*;

public class Review2{
    public static void main(String[] args) throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        int intChoice;

        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes ");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");

        intChoice = Integer.parseInt(key.readLine());

        if (intChoice == 0) {
            System.out.print("Who has the most magical hair? Hair-y Potter.");
        }
        else if (intChoice == 1) {
            System.out.print("My boyfriend told me to stop acting like a flamingo. So I had to put my foot down.");
        }
        else if (intChoice == 2) {
            System.out.print("What is DNA’s favourite piece of clothing ? Jeans (genes)");
        }
        else if (intChoice == 3){
            System.out.print("The teacher's eyes were crossed because she could not control her pupils.");
        }
        else{
            System.out.println("Invalid menu option");
        }



        }
}



