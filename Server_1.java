import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("waiting for clients...");
        ServerSocket ss = new ServerSocket(9806);
        Socket soc = ss.accept();
        System.out.println("connection established...");
    }
}
