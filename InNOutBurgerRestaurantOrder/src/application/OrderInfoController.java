package application;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OrderInfoController {
	@FXML Label orderNumberLabel;
	@FXML Label secondLabelSubtotal;
	private static int orderNumber;
	
	
	public int orderNumberGenerator() {
		orderNumber = ThreadLocalRandom.current().nextInt();
		return orderNumber;
	}
	
	
	public void displayOrderTotalandOrderNumber() throws IOException {
		orderNumberLabel.setText("#" + Math.abs(orderNumberGenerator()));
		secondLabelSubtotal.setText(FoodItemSelectionController.getTotal());
		main(null);
	}
	
	public static void main(String[] args) throws IOException {
		DataBaseWriter writer = new DataBaseWriter();
		writer.writeOrderNum(Integer.toString(orderNumber));
	}
}
