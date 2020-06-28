package Codiiiin.nighttask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MyFriends {
    public static void main(String[] args) {

            /*
        String[] myfriends = {"Kuzzat", "Asiya", "Saim", "Akbar", "guljannat"};


        String name = myfriends[2];
        System.out.println(name);
        System.out.println(myfriends[2]);

        for (int i=0;i<=6;i++){
           String name= myfriends[i];
            System.out.println(name);
        }
       */
        String[]emails={"cybertek@yahoo.com","Cybertek@gmail.com","cybertek@hotmail.com","Cybertek@outlook.com"};
        //max:4
        for (int i=0;i<=3;i++){
           String email= emails[i];
           if (email.endsWith("@gmail.com"))
            System.out.println(email);
        }
    }

}
