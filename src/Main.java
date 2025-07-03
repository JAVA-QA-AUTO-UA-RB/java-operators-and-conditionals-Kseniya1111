import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            int health = 100;
            int luck = 50;


            System.out.println("Hello my friend!Ти потрапив у чарівний ліс, де тебе чекає багато пригод!");
            System.out.println("Ти маєш 100 пунктів здоров'я та 50 пунктів удачі");
            System.out.println("Ти йшов чарівною стежкою, і натрапив на роздоріжжя.Обери подальший шлях: 1 - піти наліво, 2 - піти направо:");
            Scanner sc = new Scanner(System.in);
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                health = health - 20;
                System.out.println("Ти обрав піти наліво.Ти пройшов старою стежкою і втратив 20  здоров’я. :(");

            } else if (choice1 == 2) {
                luck = luck + 30;
                System.out.println("Ти обрав піти направо.Ти знайшов скарб і отримуєш 30 пунктів удачі.");

            } else {
                health = health - 10;
                System.out.println("Ти заплутався та загубив 10 пунктів здоров'я");
            }

            System.out.println("Йдемо далі!Ти натрапив на загадковий колодязь. Обери свої дії:пити воду(1) або йти далі(2):");
            int choice2 = sc.nextInt();
            if (choice2 == 1) {
                health = health + 50;
                System.out.println("Ти п’єш магічну воду і отримуєш 50 пунктів здоров’я.");
            } else if (choice2 == 2) {
                System.out.println("Єх, ти ігноруєш колодязь та скоро втомлюєшся  і втрачаєш 90 пунктів удачі.");
                luck = luck - 90;

            } else {
                System.out.println("Ти заплутався");

            }
            boolean valid = false;
            // int choice3 = 0;
            while (!valid) {
                System.out.println("Оце так новина!Ти зустрів чарівну істоту, натисни 1,2 або 3- щоб дізнатися хто ця істота:");
                if (sc.hasNextInt()) {
                    int choice3 = sc.nextInt();

                    switch (choice3) {
                        case 1:
                            health = health + 20;
                            System.out.println("Істота дружня і ділиться їжею.Ти отримаєш  20 пунктів здоров'я!");
                            valid = true;
                            break;
                        case 2:
                            health = health - 30;
                            System.out.println("Істота ворожа і атакує! Ти отримав -30 пунктів здоров’я.");
                            valid = true;
                            break;
                        case 3:
                            System.out.println("Істота байдужа, нічого не змінюється.");
                            valid = true;
                            break;
                        default:
                            System.out.println("Невірне число, спробуй наново.");
                    }

                }
                else {
                    System.out.println("Це не число! Введи 1, 2 або 3.");
                    sc.next();
                }
            }
            if (health <= 0 || luck <= 0) {
                System.out.println("Ви не змогли пройти ліс... Спробуйте ще раз!");
            } else System.out.println("Вітаю друже!Ти пройшов магічний ліс!:)");



        System.out.println("Поточний результат здоров’я: " + health);
        System.out.println("Поточний результат удачі: " + luck);
        System.out.println("Бажаєш зіграти ще раз? Введи '1' для повтору або будь-яке інше число для виходу:");
        int again = sc.nextInt();
        playAgain = (again == 1);

}
    }
}

