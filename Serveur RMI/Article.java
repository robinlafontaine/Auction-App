// TP2 PAR LAFONTAINE ROBIN, ONEGLIA AXEL ET OZER SABRI - GROUPE TP2
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
    

public class Article implements Serializable {

    // ATTRIBUTS
    private String descriptif;
    private double prix;
    private LocalDateTime dateDeCloture;
    private String nomAcheteur;
    private String nomVendeur;
    private String telVendeur;
    private ImageIcon photo;



    // CONSTRUCTEURS
    public Article(String descriptif, ImageIcon photo, double prix, LocalDateTime dateDeCloture, String nomAcheteur, String nomVendeur, String telVendeur) {
        this.descriptif = descriptif;
        this.photo = photo;
        this.prix = prix;
        this.dateDeCloture = dateDeCloture;
        this.nomAcheteur = nomAcheteur;
        this.nomVendeur = nomVendeur;
        this.telVendeur = telVendeur;

    }

    public Article(String descriptif) {
        this.descriptif = descriptif;
    }
    
    // METHODES
    public String getDescriptif() {return descriptif;}
    public void setDescriptif(String Descriptif) {this.descriptif = Descriptif;}
    public ImageIcon getPhoto() {return photo;}
    public double getPrix() {return prix;}
    public void setPrix(double prix) {this.prix = prix;}
    public LocalDateTime getDateDeCloture() {return dateDeCloture;}
    public void setDateDeCloture(LocalDateTime dateDeCloture) {this.dateDeCloture = dateDeCloture;}
    public String getNomAcheteur() {return nomAcheteur;}
    public void setNomAcheteur(String nomAcheteur) {this.nomAcheteur = nomAcheteur;}
    public String getNomVendeur() {return nomVendeur;}
    public void setNomVendeur(String nomVendeur) {this.nomVendeur = nomVendeur;}
    public String getTelVendeur() {return telVendeur;}
    public void setTelVendeur(String telVendeur) {this.telVendeur = telVendeur;}

}