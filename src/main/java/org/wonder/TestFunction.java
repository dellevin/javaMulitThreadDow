package org.wonder;

import org.junit.Test;
import org.wonder.util.getUrlMessage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class TestFunction {
    @Test
    public void getFileSize() throws IOException {
        //获取文件大小 请求的Content-Length:32767766字段
        String path="https://b.zhutix.com/old_theme/Maverick_UP3_TW10_7496.zip";
        System.out.println(getUrlMessage.fileSize(path)+" B");
    }
    @Test
    public  void availableProcessors() {
        //获取cpu内核数目
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("CPU核数："+availableProcessors);//本机cpu核数 ：12
    }
    @Test
    public  void demo01() throws IOException {
        String path="https://b.zhutix.com/old_theme/Maverick_UP3_TW10_7496.zip";
        URL url=new URL(path);
        HttpURLConnection connection=(HttpURLConnection)url.openConnection();
        //System.out.println(connection.getPermission());//("java.net.SocketPermission" "b.zhutix.com:80" "connect,resolve")
        //System.out.println(connection.getRequestMethod());//GET
        System.out.println(connection);
    }

}