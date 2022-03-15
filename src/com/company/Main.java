package com.company;
import java.util.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
//          JOptionPane.showMessageDialog(null, "Enter username", "Login", JOptionPane.PLAIN_MESSAGE);
//          JOptionPane.showMessageDialog(null, "Enter username", "Login", JOptionPane.INFORMATION_MESSAGE);
//          JOptionPane.showMessageDialog(null, "Would you like to login or sign up", "Login or sign up", JOptionPane.QUESTION_MESSAGE);
//          JOptionPane.showMessageDialog(null, "Enter username", "Login", JOptionPane.WARNING_MESSAGE);
//          JOptionPane.showMessageDialog(null, "Incorrect username or password", "ERROR", JOptionPane.ERROR_MESSAGE);
//          JOptionPane.showConfirmDialog(null, "Are you sure you want to login?", "Login", JOptionPane.YES_NO_OPTION);
//            //options

        //JFrame
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Treasure Hunt");


        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
        ///////////////////////////////////

        //do you want to sign up
        int a = JOptionPane.showConfirmDialog(null, "Do you want to make an account?", "Sign up", JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
            makeAccount();
        }else if(a==JOptionPane.NO_OPTION){
            //do you want to sign in
            int b = JOptionPane.showConfirmDialog(null, "Do you want to sign in to an account?", "Sign in", JOptionPane.YES_NO_OPTION);
            if(b==JOptionPane.YES_OPTION){
                logIn();
            }else if(b==JOptionPane.NO_OPTION){
                JOptionPane.showConfirmDialog(null, "You are playing as guest your progress won't be saved. Are you sure you don't want to sign up?", "Playing as guest", JOptionPane.YES_NO_OPTION);
                if(b==JOptionPane.YES_OPTION){
                    //play game
                }else if(b==JOptionPane.NO_OPTION){
                    makeAccount();
                }
            }
        }else if (a==JOptionPane.CLOSED_OPTION){
            System.out.println("Hello");
        }



    }

    static void makeAccount() {
        String username = JOptionPane.showInputDialog("Enter username:");
        //input username
        boolean check = false;
        while(check == false) {
            String password = JOptionPane.showInputDialog("Enter password:");
            //input password again
            String passwordTwo = JOptionPane.showInputDialog("Re-enter password:");
            //check passwords are the same
            if (password.equals(passwordTwo)) {
                JOptionPane.showMessageDialog(null, "Username: " + username + "\nPassword: " + password, "Account details", JOptionPane.PLAIN_MESSAGE);
                //store account in database
                check = true;
            } else {
                JOptionPane.showMessageDialog(null, "Passwords are not the same", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }



    }
    static void logIn(){
        //input username
        String loginUsername = JOptionPane.showInputDialog("Enter username:");
        //input password
        String loginPassword = JOptionPane.showInputDialog("Enter password:");
        //check details using database

    }
}
