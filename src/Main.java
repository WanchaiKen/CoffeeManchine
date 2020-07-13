import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine(400,540,120,9,550);
        int water;
        int milk;
        int coffeeB;
        int disCup;
        String action;
        String choice;

        while (true) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();
            if (action.equals("exit")) {
                break;
            }
            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                choice = scanner.next();
                if (choice.equals("back")) {
                    System.out.println();
                    continue;
                }
                System.out.println(coffeeMachine.buyCoffee(choice));

            }
            if (action.equals("fill")) {
                System.out.println("");
                System.out.println("Write how many ml of water do you want to add: ");
                water = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add: ");
                milk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                coffeeB = scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                disCup = scanner.nextInt();
                coffeeMachine.addResources(water,milk,coffeeB,disCup);
            }

            if (action.equals("take")) {
                System.out.println(coffeeMachine.getMoney());
                coffeeMachine.setMoney(0);
            }
            if (action.equals("remaining")) {
                System.out.println(coffeeMachine.toString());
            }
        }
    }
}
