package org.wonder.util;

import java.io.IOException;
import java.net.URL;

public class getUrlMessage {
    public static int fileSize(String path) throws IOException {
        // 获取目标文件的大小 Content-Length
        return new URL(path).openConnection().getContentLength();
    }

}
