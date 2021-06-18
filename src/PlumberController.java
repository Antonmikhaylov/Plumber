import java.util.Scanner;

public class PlumberController {

    private String question = "yes";
    private Scanner scanner = new Scanner(System.in);
    private Scanner scannerInt = new Scanner(System.in);
    Plumber plumber = new Plumber();

    void callPlumber() {
        System.out.println(plumber.speak("Hello"));
    }
    void finish() {
        if (plumber.getSum()>0) {
            System.out.println(plumber.speak("Final")+plumber.getSum()+"$ !!!");
        } else {
            System.out.println(plumber.speak("Declined"));
        }
    }
    void start() {
        while (question.equals("yes")) {
            System.out.println(plumber.speak("Question"));
            String command = scanner.nextLine();
            String sureQuestion;
            if (command.contains("fix")) {
                if (command.contains("pipe")) {
                    System.out.println(plumber.getCost("pipe"));
                    System.out.println(plumber.speak("AreYouSure"));
                    sureQuestion = scanner.nextLine();
                    if (sureQuestion.equals("yes")) {
                        plumber.sumPrice(plumber.getPrice("pipe"));
                        System.out.println(plumber.fix("pipe"));
                    }
                }
                else if (command.contains("toilet")) {
                    System.out.println(plumber.getCost("toilet"));
                    System.out.println(plumber.speak("AreYouSure"));
                    sureQuestion = scanner.nextLine();
                    if (sureQuestion.equals("yes")) {
                        plumber.sumPrice(plumber.getPrice("toilet"));
                        System.out.println(plumber.fix("toilet"));
                    }
                }
                else {
                    System.out.println(plumber.fix("else"));
                }
            }
            else if (command.contains("I am your master")) {
                System.out.println(plumber.speak("HelloBoss"));
                String bossCommand = scanner.nextLine();
                if (bossCommand.contains("set")) {
                    if (bossCommand.contains("price")) {
                        if (bossCommand.contains("pipe")) {
                            System.out.println(plumber.speak("NewPrice"));
                            int newPrice = scannerInt.nextInt();
                            plumber.setPrice("pipe",newPrice);
                        } else if (bossCommand.contains("toilet")) {
                            System.out.println(plumber.speak("NewPrice"));
                            int newPrice = scannerInt.nextInt();
                            plumber.setPrice("toilet",newPrice);
                        }
                    }
                } else {
                    System.out.println(plumber.speak("DontUnderstand"));
                }
            }
            else {
                System.out.println(plumber.speak("DontUnderstand"));
            }
            System.out.println(plumber.speak("More"));
            question = scanner.nextLine();
            while (!(question.equals("yes")||question.equals("no"))) {
                System.out.println(plumber.speak("YesOrNoOnly"));
                question = scanner.nextLine();
            }
        }
    }
}
