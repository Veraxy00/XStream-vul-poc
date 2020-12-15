import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        XStream xstream = new XStream(new DomDriver());
        xstream.fromXML(new FileInputStream("CVE-2020-26217.xml"));
    }


}
