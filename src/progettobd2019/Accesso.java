/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettobd2019;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * @author Gerardo
 */
public class Accesso {
    String username;
    String psw;
    String hostname;
    String database;
    int port;
    

    public Accesso(String username, String psw, String hostname, String database) {
        this.username = username;
        this.psw = psw;
        this.hostname = hostname;
        this.database = database;
        this.port=port;
    }
    public Accesso(){
        username=null;
        psw=null;
        hostname=null;
        database=null;
        port=0;
    }

    public String getUsername() {
        return username;
    }

    public String getPsw() {
        return psw;
    }

    public String getHostname() {
        return hostname;
    }

    public String getDatabase() {
        return database;
    }

    public int getPort() {
        return port;
    }
    

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void setPort(int port) {
        this.port = port;
    }
      
    
    
     public Accesso Accesso_utente() throws IOException {

        InputStream file = new FileInputStream("login.txt");
        DataInputStream dis = new DataInputStream(file);
        Accesso a=new Accesso(); 
        while (dis.available() > 0) {
            String x = dis.readUTF();
            if (x == "username") {
                a.username = dis.readUTF();}
             else if (x == "password") {
                a.psw = dis.readUTF();}
             else if (x == "hostname"){ 
              a.hostname = dis.readUTF();}
             else if (x == "database") {
                a.database = dis.readUTF();}
             else if (x=="port") { a.port=dis.readInt();
                
            }  
        }
        return a;
    }

    @Override
    public String toString() {
        return "Accesso{" + "username=" + username + ", psw=" + psw + ", hostname=" + hostname + ", database=" + database + '}';
    }
    
    
}
