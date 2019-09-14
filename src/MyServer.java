import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket accept = serverSocket.accept();
        System.out.println("服务器连接成功");
       //下面是字符串传输
        /*OutputStream outputStream = accept.getOutputStream();
        outputStream.write("你好啊,客户端".getBytes());
        InputStream inputStream = accept.getInputStream();
        byte[] bytes = new byte[100];
        inputStream.read(bytes);
        System.out.println(new String(bytes));*/
        //下面是文件传输
        /*OutputStream out = accept.getOutputStream();
        File file = new File("D:\\ChromeSetup.zip");
        InputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[100];
        int len;
        while ((len=inputStream.read(bytes))!=-1){
            out.write(bytes,0,len);
        }
        inputStream.close();
        out.close();
        accept.close();
        serverSocket.close();*/

    }
}
