import java.util.Scanner;
class SimpleStore {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // ===== SIMPLE STORE =====

        // menu 

        int mausePrice = 20;
        int keyboardPrice = 40;
        int headphonesPrice = 50;
        int laptopStandPrice = 30;
        int subTotal = 0;
        int totalItem = 0;
        int choose = 0;
        double discount = 0;

        System.out.println("===== SIMPLE STORE =====");
        System.out.println("");  // air
        System.out.println("1: Mause  -" + mausePrice + "$");
        System.out.println("2: Keyboard  -" + keyboardPrice + "$");
        System.out.println("3: Headphones  -" + headphonesPrice + "$");
        System.out.println("4: Laptop Stand  -" + laptopStandPrice + "$");
        System.out.println("5: Checkout  ");
        System.out.println("");  // air
        System.out.print("Choose a product:  ");  

        
        while (choose != 5){
            choose = scanner.nextInt();

            if(choose == 1){
                System.out.println("You selected: Mouse");
                System.out.println("Price: " + mausePrice + "$");
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                if (quantity <= 0){
                    System.out.println("Invalid quantity");
                } else {
                    subTotal = subTotal + (mausePrice * quantity);
                    totalItem = totalItem + quantity;
                    System.out.println("Current total: $" + subTotal);
                }
            }
             else if (choose == 2){
                System.out.println("You selected: Keyboard");
                System.out.println("Price: " + keyboardPrice + "$");
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                if (quantity <= 0){
                    System.out.println("Invalid quantity");
                } else {
                    subTotal = subTotal + (keyboardPrice * quantity);
                    totalItem = totalItem + quantity;
                    System.out.println("Current total: $" + subTotal);
                }
            } 
             else if (choose == 3){
                System.out.println("You selected: Headphones");
                System.out.println("Price: " + headphonesPrice + "$");
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                if (quantity <= 0){
                    System.out.println("Invalid quantity");
                } else {
                    subTotal = subTotal + (headphonesPrice * quantity);
                    totalItem = totalItem + quantity;
                    System.out.println("Current total: $" + subTotal);
                }
            } 
             else if (choose == 4){
                System.out.println("You selected: LaptopStand");
                System.out.println("Price: " + laptopStandPrice + "$");
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                if (quantity <= 0){
                    System.out.println("Invalid quantity");
                } else {
                    subTotal = subTotal + (laptopStandPrice * quantity);
                    totalItem = totalItem + quantity;
                    System.out.println("Current total: $" + subTotal);
                }
            } 
             else if (choose == 5){
                System.out.println("===== CHECKOUT ====="); // потом доделаю
                break;
            
            } 
             else {
                System.out.println("Invalid option. Please choose 1 to 5");
            }
            System.out.println("===== SIMPLE STORE =====");
            System.out.println("");  // air
            System.out.println("1: Mause  -" + mausePrice + "$");
            System.out.println("2: Keyboard  -" + keyboardPrice + "$");
            System.out.println("3: Headphones  -" + headphonesPrice + "$");
            System.out.println("4: Laptop Stand  -" + laptopStandPrice + "$");
            System.out.println("5: Checkout  ");
            System.out.println("");  // air
            System.out.print("Choose a product:  ");  
        }



        scanner.close();
    }
}