package com.pAdmin.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by neeraj on 28-Dec-16.
 */
public class ScreenLauncher {
    private Welcome welcome;
    private SearchCriminal mainScreen;
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu file;
    private JMenuItem searchScreenItem , addUserScreenItem, addCriminalScreenItem;

    public ScreenLauncher(){

        welcome = new Welcome();
        frame = new JFrame("Welcome");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600 , 600);
        iniMenuItems();
        frame.setJMenuBar(menuBar);
        mainScreen = new SearchCriminal();
    }

    public void iniMenuItems(){
        menuBar = new JMenuBar();
        file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_A);
        file.getAccessibleContext().setAccessibleDescription("File menu which contains further features!");
        menuBar.add(file);
        searchScreenItem = new JMenuItem("go to Search criminal" , KeyEvent.VK_S);
        searchScreenItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        searchScreenItem.getAccessibleContext().setAccessibleDescription(
                "Take you to search criminal window");
        addUserScreenItem = new JMenuItem("add new user", KeyEvent.VK_U);
        addUserScreenItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        addUserScreenItem.getAccessibleContext().setAccessibleDescription(
                "Take you to add user form");
        addCriminalScreenItem = new JMenuItem("add new criminal", KeyEvent.VK_Y);
        addCriminalScreenItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_3, ActionEvent.ALT_MASK));
        addCriminalScreenItem.getAccessibleContext().setAccessibleDescription(
                "Take you to add criminal form");
        searchScreenItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                launchSearchScreen();
            }
        });
        addUserScreenItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                launchAddUser();
            }
        });

        addCriminalScreenItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                launchAddCriminal();
            }
        });
        file.add(searchScreenItem);
        file.add(addCriminalScreenItem);
        file.add(addUserScreenItem);

    }

    public void launchAddUser(){
        frame.setTitle("Add new user");
        frame.setContentPane(new AddUser().getParentPanel());
        frame.setVisible(true);
    }

    public void launchAddCriminal(){
        frame.setTitle("Add criminal record");
        frame.setContentPane(new AddCriminal().getParentPanal());
        frame.setVisible(true);
    }


    public void launchWelcome() {
        frame.setContentPane(welcome.getParentPanel());
        frame.setVisible(true);
    }

    public void launchSearchScreen(){
        frame.setTitle("Search criminal");
        frame.setContentPane(mainScreen.getParentPanal());
        frame.setVisible(true);
    }
}
