package com.os.china.util;

import org.xerial.snappy.Snappy;

import java.io.IOException;
import java.util.Date;

/**
 * auth zhoupeng
 */
public class SnappyUtil {

    private  static final int  ONE_M = 1024 * 1024;

    public static byte[] compress(byte srcBytes[]) throws IOException {
        return Snappy.compress(srcBytes);
    }

    public static byte[] uncompress(byte[] bytes) throws IOException {
        return Snappy.uncompress(bytes);
    }

    public  static  void main(String[] args){
        byte[] data = new byte[ONE_M * 1];
        System.out.println("Before compress:" + data.length);
        int i = 0;
        while(i <= 10000){
            i++;
            try {
                long begin = new Date().getTime();
                byte[] buf = compress(data);
                long after = new Date().getTime();
                System.out.println("After compress:" + buf.length + ",cost:" + (after - begin));

                begin = new Date().getTime();
                byte[] result = uncompress(buf);
                after = new Date().getTime();
                System.out.println("After uncompress:" + result.length);
                System.out.println("After compress:" + buf.length + ",cost:" + (after - begin));

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
