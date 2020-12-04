package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CheckoutController {
	
	

	public void submitOrderButton(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("OrderInfoScene.fxml"));
		Scene FoodItemSelectionScene = new Scene(parent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(FoodItemSelectionScene);
		window.show();
		
		//showTextInput();
	}

	//for some reason my most recent push did not have checkout controller class or fxml scene
	//only this version 77c088e so will push this 
	@FXML TextField nameTextBox;
	public void showTextInput() {
		System.out.println(nameTextBox.getText());
	}

//	@FXML TextField nameTextBox;
//	public String showTextInput() {
//		return nameTextBox.getText();
//	}
}