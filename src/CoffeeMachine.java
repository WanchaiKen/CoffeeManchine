public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int dispoableCup;
    private int money;

    public CoffeeMachine(int water, int milk, int coffeeBeans, int dispoableCup, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.dispoableCup = dispoableCup;
        this.money = money;
    }

    public String buyCoffee(String menu) {
        String str = "\n";
        if (menu.equals("1")) {
            if (water >= 250 && coffeeBeans >= 16 && dispoableCup >=1) {
                this.useResources(250, 0, 16, 1, 4);
                str = "I have enough resources, making you a coffee!\n";
            } else {
                str = "can't make a cup of coffee\n";
            }
        }
        if (menu.equals("2")) {
            if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && dispoableCup >=1) {
                this.useResources(350, 75, 20, 1, 7);
                str = "I have enough resources, making you a coffee!\n";
            } else {
                str = "can't make a cup of coffee\n";
            }
        }
        if (menu.equals("3")) {
            if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && dispoableCup >=1) {
                this.useResources(200, 100, 12, 1, 6);
                str = "I have enough resources, making you a coffee!\n";
            } else {
                str = "can't make a cup of coffee\n";
            }
        }
        return str;
    }

        public void addResources ( int water, int milk, int coffeeBeans, int dispoableCup){
            this.water += water;
            this.milk += milk;
            this.coffeeBeans += coffeeBeans;
            this.dispoableCup += dispoableCup;

        }

        public void useResources ( int water, int milk, int coffeeBeans, int dispoableCup, int money){
            this.water -= water;
            this.milk -= milk;
            this.coffeeBeans -= coffeeBeans;
            this.dispoableCup -= dispoableCup;
            this.money += money;
        }


        public String getMoney () {
            String str = "I gave you $" + money +"\n";
            return str;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        @Override
        public String toString() {
            return "\nThe coffee machine has:" +
                "\n" + water + " of water\n" + milk + " of milk\n" +
                coffeeBeans + " of coffee beans\n" + dispoableCup + " of dispoable cups\n" +
                money + " of money\n";
        }
    }

