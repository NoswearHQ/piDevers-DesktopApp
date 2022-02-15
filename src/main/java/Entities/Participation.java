package Entities;

public class Participation {
    private int idParticipation;
    private int idEvent;
    private int idOwner;
    private String nomParticipation;
    private String titreParticipation;
    private String typeParticipation;
    private int nombreParticipation;

    public Participation() {
    }

    public Participation(String nomParticipation, String titreParticipation, String typeParticipation, int nombreParticipation) {
        this.nomParticipation = nomParticipation;
        this.titreParticipation = titreParticipation;
        this.typeParticipation = typeParticipation;
        this.nombreParticipation = nombreParticipation;
    }

    public Participation(int idParticipation, int idEvent, int idOwner, String nomParticipation, String titreParticipation, String typeParticipation, int nombreParticipation) {
        this.idParticipation = idParticipation;
        this.idEvent = idEvent;
        this.idOwner = idOwner;
        this.nomParticipation = nomParticipation;
        this.titreParticipation = titreParticipation;
        this.typeParticipation = typeParticipation;
        this.nombreParticipation = nombreParticipation;
    }

    public int getIdParticipation() {
        return idParticipation;
    }

    public void setIdParticipation(int idParticipation) {
        this.idParticipation = idParticipation;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getNomParticipation() {
        return nomParticipation;
    }

    public void setNomParticipation(String nomParticipation) {
        this.nomParticipation = nomParticipation;
    }

    public String getTitreParticipation() {
        return titreParticipation;
    }

    public void setTitreParticipation(String titreParticipation) {
        this.titreParticipation = titreParticipation;
    }

    public String getTypeParticipation() {
        return typeParticipation;
    }

    public void setTypeParticipation(String typeParticipation) {
        this.typeParticipation = typeParticipation;
    }

    public int getNombreParticipation() {
        return nombreParticipation;
    }

    public void setNombreParticipation(int nombreParticipation) {
        this.nombreParticipation = nombreParticipation;
    }

    @Override
    public String toString() {
        return "Participation{" +
                "idParticipation=" + idParticipation +
                ", idEvent=" + idEvent +
                ", idOwner=" + idOwner +
                ", nomParticipation='" + nomParticipation + '\'' +
                ", titreParticipation='" + titreParticipation + '\'' +
                ", typeParticipation='" + typeParticipation + '\'' +
                ", nombreParticipation=" + nombreParticipation +
                '}';
    }
}
