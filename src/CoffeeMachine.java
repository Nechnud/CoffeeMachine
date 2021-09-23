import java.util.Scanner;


public class CoffeeMachine {


    private int CoffeCount = 0;
    private double water = 0;
    private double milk = 0;
    private double CoffePowder = 0;
    private double Cacao = 0;
    Scanner minScanner = new Scanner(System.in);


    public CoffeeMachine() {
        this.water = 8;
        this.milk = 8;
        this.CoffePowder = 4;
        this.Cacao = 2;

    }

    public void start() {
        System.out.println("Welcome! Would you like to start the coffee Machine? Y or N?");
        if (minScanner.next().equalsIgnoreCase("y")) {
            System.out.println("Welcome!");


            try {
                Thread.sleep(2000);
                System.out.println("Navigate with menu options");
                coffeeMachine();


            } catch (InterruptedException e) {

                System.out.println(" ");
            }
        } else {
            System.exit(0);
        }


    }

    public void coffeeMachine() {
        //money = 0;
        System.out.println("----------------------------------------------");
        System.out.println("||1.          Make black coffee             ||");
        System.out.println("||2.          Make coffee with milk         ||");
        System.out.println("||3.          Make chocolate milk           ||");
        System.out.println("||4.               Make latte               ||");
        System.out.println("||5.   Show how many coffee we have made    ||");
        System.out.println("||6.         Show ingredient status         ||");
        System.out.println("||7.                 Refill                 ||");
        System.out.println("||8.              Clean machine             ||");
        System.out.println("||7.                  EXIT                  ||");
        System.out.println("----------------------------------------------");
        switch (minScanner.nextInt()) {
            case 1:
                BlackCoffee();
                break;
            case 2:
                MilkCoffee();
                break;
            case 3:
                Coco();
                break;
            case 4:
                latte();
                break;
            case 5:
                System.out.println("Today we have made " + (CoffeCount) + " drinks!");
                coffeeMachine();
                break;
            case 6:  GetIngredient();
                break;
            case 7: SetIngredient();
                break;
            case 8: CleanMachine();
                break;
            case 9:
                if (milk == 0 && water == 0) {
                    System.out.println("Shutting down...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("You interrupted the Coffee machine");
                        coffeeMachine();
                    }
                    System.out.println("Shut down completed!\nBye!");
                    System.exit(0);
                } else {
                    System.out.println("Please clean the machine from milk and water before turning off!!!");
                    System.out.println("We don't want mold!!");
                    coffeeMachine();
                }
                break;


        }
    }

    private void MilkCoffee() {
        this.water -= 0.2;
        this.CoffePowder -= 50;
        this.milk -= 0.1;
        CoffeCount++;
        System.out.println("Your drink is ready");
        coffeeMachine();
    }

    private void BlackCoffee() {
        this.water -= 0.2;
        this.CoffePowder -= 50;
        CoffeCount++;
        System.out.println("Your drink is ready");
        coffeeMachine();
    }

    private void Coco() {
        this.milk -= 1.0;
        this.Cacao -= 0.2;
        CoffeCount++;
        System.out.println("Your drink is ready");
        coffeeMachine();
    }

    private void latte() {
        CoffePowder -= 0.1;
        milk -= 0.1;
        CoffeCount++;
        System.out.println("Your drink is ready");
        coffeeMachine();
    }

    private void MakeCoffee() {
        if (water == 0) {
            System.out.println("Please refill water ");
        }
        if (milk == 0 || milk < 0.2) {
            System.out.println("Please Refill milk");
        }
        if (CoffePowder == 0) {
            System.out.println("Please refill Coffer powder");
        }
        coffeeMachine();

    }

    private void CleanMachine() {
        CoffePowder = 0;
        milk = 0;
        water = 0;
        System.out.println("Cleaning machine ");
        coffeeMachine();

    }

    private void GetIngredient() {
        System.out.println("Ingredients status");
        System.out.println(CoffePowder + " Grams coffee powder ");
        System.out.println(water + "Liter Water");
        System.out.println(milk + "Liter Milk");
        System.out.println(Cacao + "Gram Cacao");
        coffeeMachine();
    }

    private void SetIngredient() {
        CoffePowder = 1000;
        water = 20;
        milk = 10;
        Cacao = 500;
        coffeeMachine();


    }


}
