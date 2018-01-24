package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class ChannelExample {
    public static void main(String[] args) throws Exception {
        transferToChannel();
    }
        public static void demoChannel() throws Exception {
        FileInputStream in = new FileInputStream("E:\\Book.xlsx");
        FileOutputStream out = new FileOutputStream("E:\\Book2.xlsx");
        FileChannel inChannel = in.getChannel();
        FileChannel outChannel = out.getChannel();
        ByteBuffer inBb = ByteBuffer.allocate(1024 * 4);
        ByteBuffer outBb = ByteBuffer.allocate(1024 * 4);

        int read = inChannel.read(inBb);
        while (read != -1){
            inBb.flip();
            while (inBb.hasRemaining()){
                byte get = inBb.get();
                outBb.put(get);
            }
            outBb.flip();
            outChannel.write(outBb);
            inBb.clear();
            outBb.clear();
            read = inChannel.read(inBb);
        }
        in.close();
        out.close();
        }
        public static void transferToChannel()throws Exception{
            FileInputStream in = new FileInputStream("C:\\Anton.avi");
            FileOutputStream out = new FileOutputStream("C:\\Anton2.avi");
            FileChannel inChannel = in.getChannel();
            FileChannel outChannel = out.getChannel();
            inChannel.transferTo(0, inChannel.size(), outChannel);
           // outChannel.transferFrom(inChannel, 0, outChannel.size());
        }

}
