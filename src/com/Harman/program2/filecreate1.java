package com.Harman.program2;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

    public class filecreate1 {
        public static void main(String[] args) {
            try {
                FileOutputStream file = new FileOutputStream("Data.txt");
                String data="HAPPY NEW YEAR";
                byte b[]=data.getBytes();
                file.write(b);
                file.close();
                System.out.println("file has successfully created");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


}
