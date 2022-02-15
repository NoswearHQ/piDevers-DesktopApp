package Services;

import Entities.Evenement;
import Entities.Participation;
import Tools.MaConnexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.util.List;
import java.util.Random;

public class ParticipationService implements IService<Participation> {
    Connection cnx = MaConnexion.getInstance().getCnx();
    @Override
    public void ajouter(Participation participation) {
        String query = "INSERT INTO PARTICIPATION(nom_participation,id_event,id_own,titre_participation," +
                "type_participation,nombre_participation)" + "VALUES(?,?,?,?,?,?)";
        try{
            PreparedStatement ste = cnx.prepareStatement(query);
            ste.setString(1,participation.getNomParticipation());
            ste.setInt(2,participation.getIdEvent());
            ste.setInt(3,participation.getIdOwner());
            ste.setString(4,participation.getTitreParticipation());
            ste.setString(5,participation.getTypeParticipation());
            ste.setInt(6,participation.getNombreParticipation());
            ste.executeUpdate();
            System.out.println("Participation Added Successfully");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ObservableList<Participation> afficher() {
        ObservableList<Participation> listParticipations = FXCollections.observableArrayList();
        String query = "SELECT * FROM PARTICIPATION";
        try{
            Statement ste = cnx.createStatement();
            ResultSet rs = ste.executeQuery(query);
            while (rs.next()){
                Participation participation = new Participation();
                participation.setIdParticipation(rs.getInt("id_participation"));
                participation.setIdEvent(rs.getInt("id_event"));
                participation.setIdOwner(rs.getInt("id_own"));
                participation.setNomParticipation(rs.getString("nom_participation"));
                participation.setTitreParticipation(rs.getString("titre_participation"));
                participation.setTypeParticipation(rs.getString("type_participation"));
                participation.setNombreParticipation(rs.getInt("nombre_participation"));
                listParticipations.add(participation);
            }
        }
        catch (SQLException e){
            e.getMessage();
        }
        return listParticipations;
    }

    @Override
    public void modifier(Participation participation) {
        String query = "UPDATE PARTICIPATION SET nom_participation = '" + participation.getNomParticipation() +
                "', titre_participation = '" + participation.getTitreParticipation() +
                "', type_participation = '" + participation.getTypeParticipation() +
        "', nombre_participation = " + participation.getNombreParticipation() +
                " WHERE id_participation = " + participation.getIdParticipation() + "";
        try{
            Statement ste = cnx.createStatement();
            ste.executeUpdate(query);
            System.out.println("Participation Updated Successfully ");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void supprimer(Participation participation) {
        String query = "DELETE FROM PARTICIPATION WHERE id_participation = " + participation.getIdParticipation() + "";
        try{
            Statement ste = cnx.createStatement();
            ste.executeUpdate(query);
            System.out.println("Participation Deleted Successfully");
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
