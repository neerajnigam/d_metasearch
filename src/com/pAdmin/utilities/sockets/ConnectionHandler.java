package com.pAdmin.utilities.sockets;

import java.io.*;
import java.net.Socket;

/**
 * Created by neeraj on 13-Dec-16.
 */
public class ConnectionHandler extends Thread {

    //socket for every new connection
    Socket socket;

    public ConnectionHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run()
    {
        InputStream inp = null;
        BufferedReader brinp = null;
        // data output stream allow us to send data in platform independent way
        DataOutputStream out = null;
        try{
            inp = socket.getInputStream();
            brinp = new BufferedReader(new InputStreamReader(inp));
            out = new DataOutputStream(socket.getOutputStream());
        }catch(IOException e){
            System.err.println("Connection handler error in run method");
        }
        String query;
        String output;
        try {
            query = brinp.readLine();
            if ((query == null) || query.equalsIgnoreCase("QUIT")) {
                System.out.println("QUIT or empty line ancountered!");
                socket.close();
                return;
            }
            output = doQuery(query);
            out.writeBytes(output);
            out.flush();
            socket.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String doQuery(String rawQuery){


        // do query and output in form of String for now later we use crimial object and use serialisation
        return "test: hello from server";
    }
}
