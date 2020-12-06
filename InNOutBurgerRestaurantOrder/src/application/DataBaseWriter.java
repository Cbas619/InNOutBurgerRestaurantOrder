package application;
import java.io.FileWriter; 
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataBaseWriter {
	
	public void writeOrderNum(String orderNum) throws IOException
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		FileWriter fileWriter = new FileWriter("OrderInfo.txt");
		fileWriter.write("Order Number: " + orderNum + " Received on: " + dtf.format(now) + "\n");
		fileWriter.close();
	}	
}
