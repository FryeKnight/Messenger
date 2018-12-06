package com.FryeKnight.Messenger.Client;
import java.util.Scanner;

 class MainMenu {

    public static int getMainMenu() {
            System.out.println("///////////MESSENGER///////////");
            System.out.println("Enter number 1 for: Login.");
            System.out.println("Enter number 2 for: Create New Account.");
            System.out.println("///////////MESSENGER///////////");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            return choice;
    }

    public static void getLoginMenu() {
            System.out.println("///////////MESSENGER///////////");
            System.out.println("Enter your login: ");
            System.out.println("Enter your password: ");
            System.out.println("///////////MESSENGER///////////");
    }

    public static void getNewAccountMenu() {
            Scanner in = new Scanner(System.in);
            System.out.println("///////////MESSENGER///////////");
            System.out.print("Create your login: ");
            String newLogin = in.nextLine();
            System.out.print("Create  your password: ");
            String newPassword = in.nextLine();
            System.out.print("Confirm your password: ");
            String confirmPassword = in.nextLine();
            System.out.println("///////////MESSENGER///////////");
    }
}

