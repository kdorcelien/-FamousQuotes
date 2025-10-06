package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reply = "yes";
        String randomQuote = "yes";
        while (reply.equalsIgnoreCase("yes"))
            try {
                String[] quotes = {
                        "Be yourself; everyone else is already taken.",
                        "The only way to do great work is to love what you do.",
                        "In the middle of difficulty lies opportunity.",
                        "Life is what happens when you're busy making other plans.",
                        "The journey of a thousand miles begins with one step.",
                        "You miss 100% of the shots you don't take.",
                        "Whether you think you can or you can't, you're right.",
                        "Stay hungry, stay foolish.",
                        "Do or do not. There is no try.",
                        "It always seems impossible until it's done.",
                };
                System.out.print("Please select a number \n between 1 and 10: ");
                int choice = input.nextInt();
                input.nextLine();
                System.out.println(quotes[choice - 1]);

                System.out.println("Would you like to see another quote: Yes or No");
                 reply = input.nextLine();

            int randomQuotes = (int) (Math.random() * 10) + 1;
                System.out.println("Would you like to see a ramdom Quote? Yes or No");
                randomQuote = input.nextLine();
                System.out.println(quotes[randomQuotes]);


            } catch (Exception e) {
                System.out.println("Selected number is out of reach, Please select between 1 and 10.");
                System.out.println(e.getMessage());

            }
        }

}
