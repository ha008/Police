package com.pAdmin.utilities;

/**
 * Created by neeraj on 11/25/2016.
 */
public class Site {
    // Blueprint class for every Site keeps track of IP and Port
    public String IP;
    public static final int PORT = 6543;

    public Site(String IP){
        this.IP = IP;
    }
}
