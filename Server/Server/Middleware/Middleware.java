package Server.Middleware;

import Server.Common.ResourceManager;
import Server.Interface.IResourceManager;

import java.rmi.RemoteException;

public class Middleware implements IResourceManager{

    //rms
    private static ResourceManager flight_RM;
    private static ResourceManager car_RM;
    private static ResourceManager room_RM;

    // server info
    private static final String s_serverName = "Middleware";
    private static final String s_flightRMName = "Flight";
    private static final String s_carRMName = "Car";
    private static final String s_roomRMName = "Room";
    private static int s_rmiPort = 3021;

    // TODO: bind to the RMI registry

    public Middleware(){
        super();
    }
    public void main(String args[]){
        // list of RMS on startup, parse through and assign to the appropriate RM variable

        if (args.length < 3)
        {
            System.err.println("Usage: java Middleware <flightRM> <carRM> <roomRM>");
            System.exit(1);
        }

        String flighthost = args[0];
        String carhost = args[1];
        String roomhost = args[2];

        if (args.length >= 4)
        {
            //get port number, if not default to 3021
            try {
                s_rmiPort = Integer.parseInt(args[3]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid port number: " + args[3]);
                System.exit(1);
            }
        }






    }

    //TODO: parse commands and forward to the appropriate resource manager


}
