package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ReadingProperties {
    public static void main(String[] args) {
        Set props;
        String str;
        InputStream input = null;
        try {
            input = new FileInputStream("C:\\Users\\marti\\Documents\\Java\\DBProperties.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        try {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        props = properties.keySet();
        Iterator itr = props.iterator();

        while(itr.hasNext()) {
            str = (String)itr.next();
            System.out.println(str + " : " +  properties.getProperty(str));
        }




    }
}
