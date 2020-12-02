package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CartController {
	
	@FXML Label labelSubtotal;

	/**
	 * This method is called via the order now button on the startup scene
	 * When the button is clicked, we start our order and we are
	 * taken to the next scene where we can select food items
	 * SOURCE: https://youtu.be/XCgcQTQCfJQ 
	 * @param event
	 * @throws IOException
	 */
	public void backButton(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("FoodItemSelectionScene.fxml"));
		Scene FoodItemSelectionScene = new Scene(parent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(FoodItemSelectionScene);
		window.show();
	}
	
	public void continueButton(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("CheckoutScene.fxml"));
		Scene FoodItemSelectionScene = new Scene(parent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(FoodItemSelectionScene);
		window.show();
	}
	
	public void displayTotal() {
		labelSubtotal.setText(FoodItemSelectionController.getTotal());
	}

}
