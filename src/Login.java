import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.*;

public class Login {

    private String password;
    private Scanner sc;

    Login(String password) {
        this.password = password;
        sc = new Scanner(System.in);

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkAuthorize() throws IOException {
        java.util.logging.Logger Log = java.util.logging.Logger.getLogger(Main.class.getName());
        Handler filehandler = new FileHandler("%h/yJava.log");
        Log.setLevel(Level.INFO);
        Log.setUseParentHandlers(false);
        Log.addHandler(filehandler);
        String swer = "pipiPUPU040205";
        System.out.print("Enter password: ");
        this.password = sc.nextLine();
        Log.info("enter pasword");
        if (this.password.equals(swer)) {
            System.out.println("Correct pasword");
            Log.info("user correct pasword");
        } else {
            while (true) {
                System.out.println("Incorrect password. Please use 6 symbols or more with numbers .");
                password = sc.nextLine();
                Log.info("user enter");
                if (password.equals(swer)) {
                    System.out.println("Correctt pasword");
                    Log.info("correct paswword");
                    return true;
                } else if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$") || password.length() < 6) {
                    System.out.println("Incorrect password. Please use 6 symbols or more with numbers .");
                    Log.info("not correct pasword");
                } else {
                    setPassword(password);
                    System.out.println("Incorrect password. Please try again.");
                    Log.info("not correct password  ");
                }
            }
        }
        sc.close();
        return true;
    }

}
