package se2203b.fsayednoipayrollassignment2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class iPAYROLLController {

     @FXML
     private MenuItem closeMenuItem;

     public void clickonClose() {
          Stage stage = (Stage) closeMenuItem.getParentPopup().getOwnerWindow();
          stage.close();
     }


     @FXML
     private MenuItem aboutusItem;
     @FXML
     private Label lb1;

     @FXML
     private Label lb2;

     @FXML
     private Button okButton;

     public void aboutusonclick() {
          try {
               FXMLLoader fxmlLoader = new FXMLLoader(iPAYROLLApplication.class.getResource("popupwindow-view.fxml"));
               Parent root1 = (Parent) fxmlLoader.load();
               Stage stage = new Stage();

               // Get reference to the OK button from the loaded FXML
               Button okButton = (Button) root1.lookup("#okButton");

               // Set action handler for the OK button
               okButton.setOnAction(event -> {
                    stage.close(); // Close the stage when OK button is clicked
               });

               Image imageIcon = new Image(getClass().getResourceAsStream("WesternLogo.png"));
               stage.getIcons().add(imageIcon);
               stage.setTitle("About us");
               stage.setScene(new Scene(root1));
               stage.show();
          } catch (Exception e) {
               System.out.println("OK");
          }
     }
}















