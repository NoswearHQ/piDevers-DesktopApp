package Controllers;

import Entities.Utilisateur;
import Services.UtilisateurService;
import Tools.MaConnexion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, SQLException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Views/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        MaConnexion mc = MaConnexion.getInstance();
        Utilisateur u = new Utilisateur("Amin","hlel","amin.hlel@gmail.com","amin.hlel","12345","xxxxx//",1,"12345678","azertyuiop");
        Utilisateur u2 = new Utilisateur("Aminn","hlell","amin.hlel@gmail.com","amin.hlel","12345","xxxxx//",1,"12345678","azertyuiop");
        Utilisateur u3 = new Utilisateur("Hamza","Ben mahmoud","amin.hlel@gmail.com","amin.hlel","12345","xxxxx//",1,"12345678","azertyuiop");

        UtilisateurService us = new UtilisateurService();
        /*ADD*/
        us.ajouter(u);
      /*  us.ajouter(u);
        us.ajouter(u2);
        us.ajouter(u3);*/
      //  us.Dejaexiste(u);
        /*Display*/
       // System.out.println(u1.afficher());
     //  u1.modifier(u2);
//us.supprimer(u3);
       // System.out.println(us.afficher());

       // stage.setTitle("Hello Pidevers !");
       // stage.setScene(scene);
       // stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}