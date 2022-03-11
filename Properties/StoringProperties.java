package Properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class StoringProperties {

    public static void main(String[] args) {
        //Storing properties
        Properties props = new Properties();

        OutputStream os = null;
        try {
            os = new FileOutputStream("C:\\Users\\marti\\Documents\\Java\\DBProperties.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        props.setProperty("url","localhost/3456");
        props.setProperty("username","admin");
        props.setProperty("password","admin");

        try {
            props.store(os,null);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
