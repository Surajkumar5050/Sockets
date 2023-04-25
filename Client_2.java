import java.io.PrintWriter;
import java.net.Socket;

public class Client_2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 4999);
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("hey...");
        pr.flush();
    }
}
