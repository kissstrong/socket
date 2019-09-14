import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("192.168.1.103",9999);
        //下面是普通字符串传输
        /*   InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[100];
        inputStream.read(bytes);
        System.out.println(new String(bytes));
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好，服务端".getBytes());*/
        //下面是文件传输操作
     InputStream in = socket.getInputStream();
        OutputStream outputStream = new FileOutputStream("E:\\a.zip");
        byte[] bytes =new byte[100];
        int len;
        while ((len=in.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        outputStream.close();
        in.close();
        socket.close();
    }
}
