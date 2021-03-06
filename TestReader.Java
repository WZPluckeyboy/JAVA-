﻿package IO流.字节流与字符流.字符流;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TestReader {
    public static void main(String[] args) {
        File file=new File ( "D:"+File.separator+"Test"
                +File.separator+"test2.txt" );
        if(!file.exists ()){
            throw new IllegalArgumentException ( "文件不存在无法读取！" );
        }
        try(FileReader reader=new FileReader ( file )){
            char[] buff=new char[1024];
            int len=-1;
            while((len=reader.read (buff))!=-1){
                System.out.println (new String(buff,0,len) );
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}