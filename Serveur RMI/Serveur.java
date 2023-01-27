// TP2 PAR LAFONTAINE ROBIN, ONEGLIA AXEL ET OZER SABRI - GROUPE TP2

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main(String[] args){
        try{
            LocateRegistry.createRegistry(1099);
            System.out.println("Annuaire cree...");
            ImplemServicesDistants obj = new ImplemServicesDistants();
            Naming.bind("ImplemServicesDistants",obj);
            System.out.println("Services enregistrees...");
        } catch (RemoteException e){
            e.printStackTrace();
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (AlreadyBoundException e){
            e.printStackTrace();
        }

    }
}