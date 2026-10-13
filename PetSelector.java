//Reid Childs
//10-13-26
//Selects the perfect pet for a person basd on inputs for favorite color, favorite season, and name

import java.util.Scanner;

public class PetSelector {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Get the user inputs

        //Color must be either red, green, or blue
        System.out.println("What is your favorite color?");
        String color = input.nextLine().toLowerCase();

        //I know infinite loops are bad but this was kinda just a really easy way since it will break upon the goal, and it won't time out because the printer pauses the program
        while (true) {

            if (color.equals("red") || color.equals("green") || color.equals("blue")) {
                //If valid then break out of loop
                break;
            }

            System.out.println("Please input a valid color (red, green, blue)");
            color = input.nextLine().toLowerCase();

        }

        //Season must be spring, fall, summer, or winter
        System.out.println("What is your favorite season?");
        String season = input.nextLine().toLowerCase();

        while (true) {

            if (season.equals("winter") || season.equals("spring") || season.equals("fall")|| season.equals("summer")) {
                //If valid then break out of loop
                break;
            }

            System.out.println("Please input a valid season (spring, summer, fall, winter)");
            season = input.nextLine().toLowerCase();

        }

        //Name must start with a letter (non case-sensetive)
        System.out.println("What is your name?");
        String name = input.nextLine().toLowerCase();
        boolean isVowel;

        while (true) {

            if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1)) >= 0) {
                //If valid then break out of loop
                break;
            }

            System.out.println("Invalid name (must start with a letter)");
            name = input.nextLine().toLowerCase();
        }

        //Store if vowel for later
        if ("aeiou".indexOf(name.substring(0, 1)) >= 0) {
            isVowel = true;
        } else {
            isVowel = false;
        }

        String pet = "";

        //Logic checks

        if (color.equals("blue") && season.equals("fall")){
            pet = "alligator";
        } else if (color.equals("blue") && season.equals("spring")) {
            pet = "ostritch";
        } else if (!isVowel && color.equals("blue") && (!season.equals("summer") || !season.equals("fall"))) {
            pet = "axolotl";
        } else if (!isVowel && color.equals("green") && season.equals("winter")) {
            pet = "giraffe";
        } else if (color.equals("green") && !season.equals("fall")) {
            pet = "dog";
        } else if (isVowel && color.equals("red")) {
            pet = "porcupine";
        } else if (!isVowel && color.equals("red")) {
            pet = "panda";
        } else if (season.equals("summer")) {
            pet = "pony";
        } else {
            pet = "rock";
        }

        System.out.println(pet);

     }
}