package com.pAdmin.utilities.sockets;

import java.io.IOException;
import java.net.*;
import java.net.Socket;

/**
 * Created by neeraj on 11/25/2016.
 */
public class Server implements Runnable{
    // used with a thread to run server in background
    ServerSocket server;
    Socket socket;
    private boolean serverOn = true;


    public void stopServer(){
        System.out.println("Killing server..");
        serverOn = false;
    }
    @Override
    public void run() {
        try {
            server = new ServerSocket(6666);
        } catch (IOException e) {
            System.err.println("can not initialize server");
        }
        while(serverOn){
            try{
                socket = server.accept();
            } catch (IOException e) {
                System.err.println("error in accepting connection! class: server");
            }

            // Connection handler is a Thread class itself
            // we can either create a new thread and use runnable implementation
            // over ConnectionHandler too. I like this way more.
            new ConnectionHandler(socket).start();
        }
    }
    // class to initialize server for current site


}
