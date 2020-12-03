package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FoodItemSelectionController {


	static double orderTotal = 0.00;
	public static final double Burger1Price 	= 3.45;
	public static final double Burger2Price 	= 2.40;
	public static final double Burger3Price 	= 2.10;
	
	public static final double friesPrice 		= 1.60;
	
	public static final double shake1Price 		= 2.00;
	public static final double soda2Price 		= 1.50;
	public static final double lemonade3Price 	= 1.50;
	
	
	/**
	 * This method is called via the order now button on the startup scene
	 * When the button is clicked, we start our order and we are
	 * taken to the next scene where we can select food items
	 * SOURCE: https://youtu.be/XCgcQTQCfJQ 
	 * @param event
	 * @throws IOException
	 */
	public void cancelButton(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("InNOutBurgerUI.fxml"));
		Scene FoodItemSelectionScene = new Scene(parent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(FoodItemSelectionScene);
		window.show();
	}
	
	public void continueButton(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("CartScene3.fxml"));
		Scene FoodItemSelectionScene = new Scene(parent);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(FoodItemSelectionScene);
		window.show();
		
		
	}
	
	public double burger1() {
		return orderTotal += Burger1Price;
	}
	
	public double burger2() {
		return orderTotal += Burger2Price;
	}
	
	public double burger3() {
		return orderTotal += Burger3Price;
	}
	
	public double fries() {
		return orderTotal += friesPrice;
	}
	
	public double drink1() {
		return orderTotal += shake1Price;
	}
	
	public double drink2() {
		return orderTotal += soda2Price;
	}
	
	public double drink3() {
	return orderTotal += lemonade3Price;
}
	
	public static String getTotal() {
		double roundToTwoPlaces = Math.round(orderTotal * 100.0) / 100.0;
		return "$" + roundToTwoPlaces;
	}

}
