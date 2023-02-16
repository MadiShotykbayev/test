import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loginreal {
    private String login;

    Loginreal(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean makeLogin() throws IOException {
        Logger Log = Logger.getLogger(Main.class.getName());
        Handler filehandler = new FileHandler("%h/yJava.log");
        Log.setLevel(Level.INFO);
        Log.setUseParentHandlers(false);
        Log.addHandler(filehandler);
        while (true) {
            if (this.login.equals("Begarys1")) {
                System.out.printf("Correct");
                Log.info("Correct login");
                return true;
            }
            System.out.println("Not autorised");
            Log.info("User use incorrect login");
            return false;
        }
    }
}
