//package application;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class DataBaseWriter {
//	
//	public int getOrderNumber() throws IOException
//	{
//		int orderNumber;
//		FileReader file = new FileReader("OrderNumberTracker.txt");
//		Scanner scanOrderNum = new Scanner(file);
//		
//		if (!scanOrderNum.hasNext())
//		{
//			orderNumber = 0;
//			updateOrderNumber(orderNumber);
//			return orderNumber;
//		}
//		orderNumber = scanOrderNum.nextInt();
//		scanOrderNum.close();
//		updateOrderNumber(orderNumber);
//		
//		return orderNumber;
//	}
//	
//	public void updateOrderNumber(int orderNumber) throws IOException
//	{
//		orderNumber++;
//		FileWriter fileWriter = new FileWriter("OrderNumberTracker.txt");
//		fileWriter.write(orderNumber);
//		fileWriter.close();
//	}
//	
//	public static void main(String[] args) throws IOException {
//	 
//		
//	/**	
//	 * FileWriter fileWriter = new FileWriter("OrderInfo.txt");
//		fileWriter.write("--Order #" + new DataBaseWriter().getOrderNumber() + "--\n" );
//		fileWriter.close();
//		
//		DataBaseWriter foo = new DataBaseWriter();
//		foo.getOrderNumberCounter()
//		**/
//		
//		
//		DataBaseWriter orderNumber = new DataBaseWriter();
//		int order = orderNumber.getOrderNumber();
//		
//		FileWriter fileWriter = new FileWriter("OrderInfo.txt");
//		fileWriter.write("--Order #" + order + "--\n" );
//		fileWriter.close();
//	}
//	
//}
