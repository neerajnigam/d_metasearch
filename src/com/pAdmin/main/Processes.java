package com.pAdmin.main;

import com.pAdmin.db.QueryBuilder;
import com.pAdmin.utilities.*;
import com.pAdmin.utilities.sockets.Server;
import com.pAdmin.utilities.sockets.LocalSocket;

import java.util.ArrayList;

/**
 * Created by neeraj on 11/25/2016.
 */
public class Processes {
    // helper class for Mian screen

    private static Server server;
    private static QueryBuilder query;
    private static Encryption crypt;
    private ArrayList<Site> sites ;
    private ArrayList<LocalSocket> sockets;

    public void serverUp(){
        // initialize server and notify all sites
    }



}
