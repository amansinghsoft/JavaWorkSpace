import java.util.ArrayList;
import java.util.Scanner;

class SalesRecord {
    private String itemName;
    private int quantitySold;
    private double price;
    private double totalSale;
    
    // Constructor
    public SalesRecord(String itemName, int quantitySold, double price) {
        this.itemName = itemName;
        this.quantitySold = quantitySold;
        this.price = price;
        this.totalSale = quantitySold * price;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalSale() {
        return totalSale;
    }

    @Override
    public String toString() {
        return itemName + " | Quantity Sold: " + quantitySold + " | Total Sale: $" + totalSale;
    }
}

class InventoryItem {
    private String itemName;
    private int quantity;
    private double costPrice;
    
    // Constructor
    public InventoryItem(String itemName, int quantity, double costPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.costPrice = costPrice;
    }

    // Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getProfit(double salePrice) {
        return salePrice - costPrice;
    }

    @Override
    public String toString() {
        return itemName + " | Stock: " + quantity + " | Cost Price: $" + costPrice;
    }
}

class SalesManagementSystem {
    private ArrayList<SalesRecord> salesRecords = new ArrayList<>();
    private ArrayList<InventoryItem> inventoryItems = new ArrayList<>();
    
    // Add new sale record
    public void addSaleRecord(String itemName, int quantitySold, double price) {
        SalesRecord record = new SalesRecord(itemName, quantitySold, price);
        salesRecords.add(record);
        
        // Update inventory
        InventoryItem item = getInventoryItem(itemName);
        if (item != null) {
            item.setQuantity(item.getQuantity() - quantitySold);
        }
    }
    
    // View current inventory levels
    public void viewInventory() {
        for (InventoryItem item : inventoryItems) {
            System.out.println(item);
        }
    }

    // Add new inventory item
    public void addInventoryItem(String itemName, int quantity, double costPrice) {
        InventoryItem item = new InventoryItem(itemName, quantity, costPrice);
        inventoryItems.add(item);
    }

    // Calculate total sales and profit
    public void generateReport() {
        double totalSales = 0;
        double totalProfit = 0;
        for (SalesRecord record : salesRecords) {
            totalSales += record.getTotalSale();
            InventoryItem item = getInventoryItem(record.getItemName());
            if (item != null) {
                totalProfit += item.getProfit(record.getPrice()) * record.getQuantitySold();
            }
        }
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Profit: $" + totalProfit);
    }

    // Helper function to find inventory item
    private InventoryItem getInventoryItem(String itemName) {
        for (InventoryItem item : inventoryItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    // Update an existing sales record
    public void updateSaleRecord(int index, int newQuantitySold, double newPrice) {
        if (index >= 0 && index < salesRecords.size()) {
            SalesRecord record = salesRecords.get(index);
            record = new SalesRecord(record.getItemName(), newQuantitySold, newPrice);
            salesRecords.set(index, record);
        } else {
            System.out.println("Record not found!");
        }
    }

    public ArrayList<SalesRecord> getSalesRecords() {
        return salesRecords;
    }
}

public class SalesManagementApp {
    private static Scanner scanner = new Scanner(System.in);
    private static SalesManagementSystem system = new SalesManagementSystem();
    
    public static void main(String[] args) {
        // Pre-fill some items for testing
        system.addInventoryItem("Laptop", 50, 500.00);
        system.addInventoryItem("Phone", 100, 200.00);
        
        while (true) {
            System.out.println("\nSales Management System");
            System.out.println("1. Add Sale Record");
            System.out.println("2. View Inventory");
            System.out.println("3. Generate Report");
            System.out.println("4. Update Sale Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addSaleRecord();
                    break;
                case 2:
                    system.viewInventory();
                    break;
                case 3:
                    system.generateReport();
                    break;
                case 4:
                    updateSaleRecord();
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addSaleRecord() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter quantity sold: ");
        int quantitySold = scanner.nextInt();
        System.out.print("Enter sale price per unit: ");
        double price = scanner.nextDouble();
        system.addSaleRecord(itemName, quantitySold, price);
        System.out.println("Sale record added successfully!");
    }

    private static void updateSaleRecord() {
        System.out.println("Enter the index of the sale record to update:");
        for (int i = 0; i < system.getSalesRecords().size(); i++) {
            System.out.println(i + ". " + system.getSalesRecords().get(i));
        }
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter new quantity sold: ");
        int newQuantitySold = scanner.nextInt();
        System.out.print("Enter new sale price: ");
        double newPrice = scanner.nextDouble();
        system.updateSaleRecord(index, newQuantitySold, newPrice);
        System.out.println("Sale record updated successfully!");
    }
}
