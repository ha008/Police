package com.pAdmin.main;

import javax.swing.*;

/**
 * Created by neeraj on 11/18/2016.
 */
public class Welcome {
    private JPanel panel1;
    private JTextField uNameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel logo;
    private boolean isLoggedIn;

    private boolean authenticate(){
        // get username, passweord from username and password box
        String username = null, password = null;
        if(isValidUser(username, password)){
            //launch main screen here
            return true;
        }
        showIncorrectCombinationBox();
        return false;
    }

    private void showIncorrectCombinationBox(){
        //show dialog here
    }

    private boolean isValidUser(String username, String password){
        // check username and password in database
        if(username == "admin" && password == "29test"){
            return true;
        }
        return false;
    }
}
