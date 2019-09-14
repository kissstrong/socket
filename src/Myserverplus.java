import java.net.ServerSocket;
import java.net.Socket;

public class Myserverplus {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        System.out.println("服务器连接成功");
        DownloaderThread downloaderThread = new DownloaderThread(accept);
        Thread thread = new Thread(downloaderThread);
        thread.start();
    }
}
