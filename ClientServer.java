
import java.net.InetAddress;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author n0793256
 */
import java.net.*;
import java.io.*;
//import java.util.*;

public class ClientServer {
    public static void main(String[] args) throws IOException {
        // server setup
        Socket server = new Socket("localhost",9090);
        System.out.println("connected to"+ server.getInetAddress());
        
        
        //create io streams
        DataInputStream inFromServer = new DataInputStream(server.getInputStream());
        DataOutputStream outToServer = new DataOutputStream(server.getOutputStream());
        
        //send to server
        outToServer.writeUTF("time");
        
        //read from server
        String data = inFromServer.readUTF();
        System.out.println("Server said:"+data);
        
        //always close
        server.close();

        //error hadling
        try{
            Socket server = new
            socket("loaclhost",9090);
        //
        }
        catch(IOException e){
            // errror hadle
        }    
}
}
