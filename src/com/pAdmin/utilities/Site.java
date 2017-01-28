package com.pAdmin.utilities;

/**
 * Created by neeraj on 11/25/2016.
 */
public class Site {
    // Blueprint class for every Site keeps track of IP and Port
    public String IP;
    public int PORT;

    public Site(String IP, int port){
        this.IP = IP;
        this.PORT = port;
    }
}
