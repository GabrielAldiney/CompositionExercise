# 🛒 Order Management System in Java


This small project was an exercise to reinforce the Java course of the great professor Nélio Alves.
This is a simple order management system developed in Java using object-oriented programming principles. It allows client and product registration, as well as the creation of orders with multiple items.

## 🎯 objective
![image](https://github.com/user-attachments/assets/013ff145-c4a3-40c5-bc08-4ab51ce97da7)
![image](https://github.com/user-attachments/assets/1beaddb7-e1d7-4d3d-8f34-03378169555d)

## 📦 Features

- Client registration (name, email, birth date)
- Product registration
- Adding items to an order
- Automatic calculation of total price
- Formatted display of the order summary

## 🎯 Expected result
![image](https://github.com/user-attachments/assets/50ca7a5f-c0ea-4e4e-bfc8-753b15112795)

## 🎯 Result obtained
![image](https://github.com/user-attachments/assets/b442ffeb-531d-40f0-ac06-d4df58e13b24)


## 🧱 Project Structure

- `Main.java`: entry point of the application  
- `Order.java`: represents the order, including client, date, status, and items  
- `OrderItem.java`: represents an item in the order (product, quantity, and price)  
- `Product.java`: represents the product  
- `Client.java`: represents the client  
- `OrderStatus.java`: enum for the order status (`PENDING`, `PROCESSING`, `SHIPPED`, `DELIVERED`)

## 🛠️ Technologies

- Java 17+
- Eclipse IDE (or any compatible IDE)
- Date formatting with `SimpleDateFormat`

## ▶️ How to Run

1. Clone the repository  
2. Compile the `.java` files  
3. Run `Main.java`  
4. Enter the required data in the terminal when prompted

---



💡 *This project is great for practicing encapsulation, object composition, and enum usage in Java.*

