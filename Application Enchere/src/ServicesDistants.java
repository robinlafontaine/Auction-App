// TP2 PAR LAFONTAINE ROBIN, ONEGLIA AXEL ET OZER SABRI - GROUPE TP2

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;

public interface ServicesDistants extends Remote {
    public void encherir(double prix, String nomAcheteur) throws RemoteException;
    public String getNomAcheteur() throws RemoteException;
    public String getNomVendeur() throws RemoteException;
    public String getTelVendeur() throws RemoteException;
    public double getPrix() throws RemoteException;
    public LocalDateTime getDateDeCloture() throws RemoteException;
    public boolean estEnCours() throws RemoteException; // retourne si la session de vente est encore en cours ou non
    public ImageIcon getPhoto() throws RemoteException;
    public String getDescriptif() throws RemoteException;
    public String getDateDeClotureString() throws RemoteException;
}
