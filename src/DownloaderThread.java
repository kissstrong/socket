import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class DownloaderThread implements Runnable {
    private Socket accept;
    public DownloaderThread(Socket accept){
        this.accept=accept;
    }

    @Override
    public void run() {
        try {
            OutputStream out = accept.getOutputStream();
            File file = new File("D:\\ChromeSetup.zip");
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[100];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }
            inputStream.close();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
