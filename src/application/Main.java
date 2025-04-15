package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/YYYY");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: \n"); 
		String name = sc.nextLine();
		System.out.println("Email:  \n");
		String email = sc.nextLine();
		System.out.println("Birth date(DD/MM/YYYY)"); 
		Date birthDate = null;
		try {
		    birthDate = sdf.parse(sc.next());
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		Client c1 = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: \n");
		System.out.println("Status: \n"); 
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, c1);
		
	
		System.out.println("How many items to this order? \n"); 
		int items = sc.nextInt();
		for (int i = 0; i < items; i++) {
			System.out.println("Enter " + (i + 1)  + " item data: ");
			System.out.println("Product name: \n"); 
			String productName = sc.next();
			System.out.println("Product price: \n"); 
			Double productPrice = sc.nextDouble();
			System.out.println("Quantity: \n"); 
			int quantity = sc.nextInt();
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			order.addItem(orderItem);
		}
		
		sc.close();
		
		System.out.println("ORDER SUMARY: ");
		System.out.println(order.toString());
		
	
		
		
		
	}

}
