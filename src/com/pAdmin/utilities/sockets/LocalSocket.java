package com.pAdmin.utilities.sockets;

import com.pAdmin.utilities.Site;

/**
 * Created by neeraj on 11/25/2016.
 */
public class LocalSocket {
    // create sockets here
    private Site localSite;

    public LocalSocket(String name, String IP, int port){
        localSite = new Site(IP, port);
    }

    public boolean open(){
        //open connection to site
        return false;
    }
}
