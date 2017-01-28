package com.pAdmin.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by neeraj on 11/18/2016.
 */
public class Welcome {
    private JTextField uNameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel logo;
    private JPanel panel1;
    private JPanel parentPanel;

    public Welcome() {

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                authenticate(uNameField.getText(), passwordField.getPassword());
            }
        });
    }

    private void authenticate(String username, char[] password) {
        if (isValidUser(username, password)) {
            //launch main screen here
            Manager.launcher.launchSearchScreen();
            return;
        }
        wrongPasswordShowDialog();

    }

    public void wrongPasswordShowDialog() {
        PasswordErrorDialog dialog = new PasswordErrorDialog();
        dialog.pack();
        dialog.setVisible(true);
        uNameField.setText("");
        passwordField.setText("");
    }



    public JPanel getPanel1() {
        return panel1;
    }

    private boolean isValidUser(String username, char[] password) {
        // check username and password in database
        System.out.println("isValidCalled...");
        System.out.println("admin: "+username);
        if(username.equals("admin")&& checkPassword(password)){
            System.out.println("returned true");
            return true;
        }

        return false;
    }

    public boolean checkPassword(char[] password) {
        char[] correctPass = {'t', 'e', 's', 't'};
        System.out.println("checkPassword called");
        if (password.length != correctPass.length) {
            return false;
        }else{
            return Arrays.equals(password , correctPass);
        }
    }

    public JPanel getParentPanel() {
        return parentPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
