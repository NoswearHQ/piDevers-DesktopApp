package Controllers;

import Entities.Evenement;
import Entities.Participation;
import Services.EvenementService;
import Services.ParticipationService;
import Tools.MaConnexion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Views/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        /*Start Crud Evenement
        MaConnexion mc = MaConnexion.getInstance();
        Evenement e = new Evenement(1,"Valhala","Kattegat","Odin",
                "All ll be here !","2022-02-01","/imgs/richdad.jpg");
        EvenementService es = new EvenementService();
        //es.ajouter(e);
        System.out.println("***************");
        System.out.println(es.afficher());
        System.out.println("***************");
        es.modifier(e);
        System.out.println("***************");
        System.out.println(es.afficher());
        es.supprimer(e);
        System.out.println("***************");
        System.out.println(es.afficher());
        End Crud Evenement*/

        /*Start Crud Participation
        MaConnexion mc = MaConnexion.getInstance();
        Participation p = new Participation(1,1,1,"Amine","Valhala",
                "VIP",2);
        ParticipationService ps = new ParticipationService();
        ps.ajouter(p);
        System.out.println("***************");
        System.out.println(ps.afficher());
        //ps.modifier(p);
        System.out.println("***************");
        System.out.println(ps.afficher());
        ps.supprimer(p);
        System.out.println("***************");
        System.out.println(ps.afficher());
        End Crud Participation*/

        stage.setTitle("Hello Pidevers !");
        Image icon = new Image(getClass().getResourceAsStream("/imgs/elliot.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

