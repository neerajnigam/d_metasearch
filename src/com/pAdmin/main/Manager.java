package com.pAdmin.main;

/**
 * Created by neeraj on 28-Dec-16.
 */
public class Manager {

    public static ScreenLauncher launcher;

    public static  void main(String[] args){
        System.out.println("Manager class..");
        launcher = new ScreenLauncher();
        launcher.launchWelcome();
    }
}
