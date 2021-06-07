
package main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author wandagranados
 */
public class MainFXML extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXMLCourse.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sistema de Matrícula");
        stage.setResizable(false);
        stage.show();

    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        
        
        
    }


    
    
}

//////////////////////////////////////////////////////////////////////////
//
//    
//    
//        @Override
//    public void start(Stage primaryStage) {
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("FXMLCourse.fxml"));
//            Scene scene = new Scene(root);
//            primaryStage.setTitle("PRUEBA");
//            primaryStage.setScene(scene);
//            primaryStage.setResizable(false);
//            primaryStage.show();
//        } catch (IOException ex) {
//            Logger.getLogger(MainFXML.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        launch(args);
//    }
//    
//}
//