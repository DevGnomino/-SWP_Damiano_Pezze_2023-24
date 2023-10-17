import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short action = 0;
        float balance = 0;
        float tempBalance = 0;
        String withdrawSure = "n";
        boolean isFinished = false;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Willkommen zu diesem einfachen Bankomaten!");
        System.out.println("Bitte wählen Sie ihre Aktion:");
        System.out.println("\t1. Einzahlen\n\t2. Abheben\n\t3. Kontostand\n\t4. Ende\n");

        while(isFinished == false){
            action = scanner.nextShort();
            switch (action){
                case 1:
                    System.out.println("Geben Sie den Betrag ein, den Sie einzahlen möchten:");
                    tempBalance = scanner.nextFloat();
                    balance += tempBalance;
                    System.out.println("Sie haben "+tempBalance+" € eingezahlt!");
                    break;
                case 2:
                    if(balance<=0){
                        System.out.println("Achtung! Ihr Kontostand ist im Minus, wollen Sie wirklich abheben? (j)");
                        withdrawSure = scanner2.nextLine();
                        if (!withdrawSure.equals("j")){
                            System.out.println("Das Abheben wird abgebrochen!");
                            break;
                        }
                    }
                    System.out.println("Geben Sie den Betrag ein, den Sie abheben möchten:");
                    tempBalance = scanner.nextFloat();
                    balance -= tempBalance;
                    System.out.println("Sie haben "+tempBalance+" € abgehoben!");
                    break;
                case 3:
                    System.out.println("Der Kontostand beträgt:\t"+balance);
                    break;
                case 4:
                    isFinished = true;
                    System.out.println("Machine is stopping");
                    break;
                default:
                    System.out.println("Error! Bitte geben Sie eine gültige Zahl ein!");
                    break;
            }
        }
    }
}