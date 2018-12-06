package com.FryeKnight.Messenger.Client;

import com.FryeKnight.Messenger.Client.MainMenu;

// АУЕ
public class ClientMain {
    public static void main(String[] args) {
        int choice;
        choice = MainMenu.getMainMenu();
        if(choice == 1) {
            MainMenu.getLoginMenu();
        }
        if(choice == 2) {
            MainMenu.getNewAccountMenu();
        }
    }
}
