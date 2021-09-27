package com.sicoli;
import java.io.*;
import java.net.*;

public class ClientStr {
    String nomeServer ="nomeServer";
    int portaServer = 6789;
    Socket mioSocket;
    BufferedReader tastiera;
    String stringaUtente;
    String stringaRicevutaDalServer;
    DataOutputStream outVersoServer;
    BufferedReader inDalServer;

    public Socket connetti(){

        System.out.println("2 CLIENT partito in esecuzione ...");
        try
        {

            tastiera = new BufferedReader(new InputStreamReader(System.in));
            mioSocket = new Socket (nomeServer, portaServer);
            
            outVersoServer = new DataOutputStream(mioSocket.getOutputStream());
            inDalServer = new BufferedReader (new InputStreamReader (mioSocket.getInputStream());

        }
        catch (UnknownHostException a){
        System.err.println("Host sconosciuto");
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Errore durante la connessione");
            System.exit(1);
            
        }
        return mioSocket;
    }

    public void comunica(){
        try{
            
        }
    }
}
