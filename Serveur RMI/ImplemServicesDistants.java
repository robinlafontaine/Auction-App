// TP2 PAR LAFONTAINE ROBIN, ONEGLIA AXEL ET OZER SABRI - GROUPE TP2

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;

public class ImplemServicesDistants extends UnicastRemoteObject implements ServicesDistants {
    // ATTRIBUTS 
    private Article article;
    
    // CONSTRUCTEURS
    public ImplemServicesDistants() throws RemoteException{
        this.article = new Article("Cybertruck : Le Pickup du Futur !", new ImageIcon("image.jpg"), 1000,
         LocalDateTime.of(2023, Month.JANUARY, 6, 0, 35, 0)
         , "Isaac Newton", "Elon Musk", "0606060606");
    }
    

    // METHODES
    @Override
    public void encherir(double prix, String nomAcheteur) throws RemoteException {
        if (prix > article.getPrix()) {
            this.article.setPrix(prix);
            this.article.setNomAcheteur(nomAcheteur);
        }
    }
    @Override
    public String getNomVendeur() {return this.article.getNomVendeur();}
    @Override
    public String getTelVendeur() {return this.article.getTelVendeur();}
    @Override
    public String getNomAcheteur() {return this.article.getNomAcheteur();}
    @Override
    public double getPrix() {return this.article.getPrix();}
    @Override
    public LocalDateTime getDateDeCloture(){return this.article.getDateDeCloture();}
    @Override
    public String getDateDeClotureString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dateTimeString = getDateDeCloture().format(formatter);
        return dateTimeString;
    
    }
    @Override
    public boolean estEnCours(){
        if(getDateDeCloture().isAfter(LocalDateTime.now())){return true;}
        else{return false;}
    }
    @Override
    public ImageIcon getPhoto() {return this.article.getPhoto();}
    @Override 
    public String getDescriptif() {return this.article.getDescriptif();}

    public static boolean estNumerique(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
          return false;
        }
    }
}
