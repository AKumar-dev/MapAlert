package com.app.hophacks.map;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.*;

@IgnoreExtraProperties
public class Request {
    Date creation;
    int priority;
    String ID;
    int type;
    boolean retreived;
    boolean status;
    String info;
    //LatLong location;
    public Request(){
        creation = new Date(System.currentTimeMillis());
        priority = 1;
        ID = "0";
        type = -1;
        retreived = false;
        status = false;
        info = "New Request Created.";
    }

     public Request(int p, String id, int t, boolean ret, boolean stat/*, LatLong loc*/, String concern){
        priority = p;
        ID = id;
        type = t;
        retreived = ret;
         //location = loc;
         status = stat;
         creation = new Date(System.currentTimeMillis());
         info = "Request #" + id + " created on " +  creation.toString() + System.lineSeparator();
         info += "--Location: " + System.lineSeparator(); //STILL NEED TO FIX THIS TO ADD LOCATION!!!!!!!!!!!!!!!!!!!!!!
         info += "--DESCRIPTION: " + concern;
     }



    public void updateRequest(String ID, String update, boolean stat){
        //  Request one;
        //  for(int i = 0; i < requests.size(); i++){
        //      if(requests.peek
        //  }
    }
    public void removeRequest(){

    }
}