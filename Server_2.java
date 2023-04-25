import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_2 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(4999);
        System.out.println("waiting for client...");
        Socket s = ss.accept();
        System.out.println("client connected");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("Client : "+str);
    }
}
