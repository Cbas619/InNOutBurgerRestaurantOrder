package application;

import java.util.concurrent.ThreadLocalRandom;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OrderInfoController {
	
	public int orderNumberGenerator() {
		int orderNumber = ThreadLocalRandom.current().nextInt();
		return orderNumber;
	}
	
	
//	public void displayOrderNumber() {
//		orderNumberLabel.setText("#" + Math.abs(orderNumberGenerator()));
//	}

	
//	public void displayTotal2() {
//		secondLabelSubtotal.setText(FoodItemSelectionController.getTotal());
//	}
	
	@FXML Label orderNumberLabel;
	@FXML Label secondLabelSubtotal;
	public void displayOrderTotalandOrderNumber() {
		orderNumberLabel.setText("#" + Math.abs(orderNumberGenerator()));
		secondLabelSubtotal.setText(FoodItemSelectionController.getTotal());
	}
	

}
