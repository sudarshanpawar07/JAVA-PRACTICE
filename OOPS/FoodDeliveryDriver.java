class Restaurant {
    String name;
    String type;
    String openingHours;
    String contact;
    String location;

    Restaurant(String name, String type, String openingHours,
               String contact, String location) {
        this.name = name;
        this.type = type;
        this.openingHours = openingHours;
        this.contact = contact;
        this.location = location;
    }

    public void displayRestaurant() {
        System.out.println("Restaurant: " + name);
        System.out.println("Cuisine: " + type);
        System.out.println("Open Hours: " + openingHours);
        System.out.println("Contact: " + contact);
        System.out.println("Location: " + location);
    }
}

class MenuItem {

    String itemName;
    String category;
    double price;
    boolean isAvailable;
    int calories;

    MenuItem(String itemName, String category, double price,
             boolean isAvailable, int calories) {
        this.itemName = itemName;
        this.category = category;
        this.price = price;
        this.isAvailable = isAvailable;
        this.calories = calories;
    }

    public void displayItem() {
        System.out.println(itemName + " (" + category + ") - Rs." + price +
                           " | Available: " + isAvailable +
                           " | Calories: " + calories);
    }
}

class Order {
    int orderId;
    String customerName;
    String deliveryAddress;
    MenuItem[] items;          // composition
    Restaurant restaurant;     // composition

    Order(int orderId, String customerName, String deliveryAddress,
          MenuItem[] items, Restaurant restaurant) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.items = items;
        this.restaurant = restaurant;
    }

    public void displayOrder() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Delivery Address: " + deliveryAddress);
        restaurant.displayRestaurant();
        System.out.println("Ordered Items:");
        for (MenuItem item : items) {
            item.displayItem();
        }
    }
}

class FoodDeliveryDriver {
    public static void main(String[] args) {
        Restaurant r = new Restaurant("Spice Villa", "Indian", "10am - 11pm",
                                      "9876543210", "Pune, JM Road");

        MenuItem m1 = new MenuItem("Paneer Tikka", "Starter", 250.0, true, 300);
        MenuItem m2 = new MenuItem("Butter Naan", "Main Course", 50.0, true, 150);
        MenuItem m3 = new MenuItem("Gulab Jamun", "Dessert", 80.0, true, 200);

        Order order = new Order(101, "Ramesh Kumar", "Deccan, Pune",
                                new MenuItem[]{m1, m2, m3}, r);

        order.displayOrder();
    }
}

























