package com.pAdmin.utilities;

/**
 * Created by neeraj on 11/25/2016.
 */
public class Socket {
    // create sockets here
    private Site localSite;

    public Socket(String IP){
        localSite = new Site(IP);
    }

    public boolean open(){
        //open connection to site

        return false;
    }
}
