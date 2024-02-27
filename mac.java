import java.io.IOException;

public class mac {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("shutdown -h now");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
