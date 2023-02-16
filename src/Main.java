import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Choose IIN or LOGIN:register enter 1 IIN enter 2 LOGIN ");
        int c = sc.nextInt();
        String login ;
        int attempt = 0;

        if (c == 1) {
            login = sc.nextLine();
            while (attempt < 5) {
                login = sc.nextLine();
                Iin login2 = new Iin(login);
                boolean isLOGINED = login2.checkIIN();
                if (isLOGINED) {
                    break;
                }
                attempt++;
            }
        }
        if (c == 2) {
            login = sc.nextLine();
            while (attempt < 5) {
                login = sc.nextLine();
                Loginreal login3 = new Loginreal(login);
                if (login3.makeLogin()) {
                    break;
                }
                attempt++;

            }
        }
        if (attempt == 5) {
            System.out.println("Please try later");
        }
        String password = sc.nextLine();
        Login login1 = new Login(password);
        boolean isAutorized = login1.checkAuthorize();

    }

}