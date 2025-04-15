package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date date, OrderStatus status, Client client) {

		this.moment = date;
		this.status = status;
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
		
	public Double total() {
		double sum = 0.0;
		for(OrderItem o : items) {
			sum += o.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order Moment: " + sdf.format(moment) + "\n");
		String dmy = sdf.format(client.getBirthDate());
		sb.append("Order Status: " + status + "\n");
		sb.append("Cliente: " + client.getName() + " (" + dmy.substring(0, 10) + ") " + "- " + client.getEmail() + "\n");
		sb.append("Order items: " + "\n");
		for(OrderItem oi : items){
			sb.append(oi);
		}
		sb.append("Total Price: $" + total() + "\n");
		return sb.toString();
		
		
	}
	
}
