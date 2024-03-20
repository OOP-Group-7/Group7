import java.util.Scanner;

public class CropInventory1 {
    private static String[] crops = new String[100];
    private static int[] quantities = new int[100];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCrop Inventory Management System");
            System.out.println("1. Add new crop");
            System.out.println("2. Update crop quantity");
            System.out.println("3. View current inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewCrop(scanner);
                    break;
                case 2:
                    updateCropQuantity(scanner);
                    break;
                case 3:
                    viewInventory();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addNewCrop(Scanner scanner) {
        System.out.print("Enter crop name: ");
        String cropName = scanner.next();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        crops[count] = cropName;
        quantities[count] = quantity;
        count++;

        System.out.println("Crop added successfully.");
    }
}