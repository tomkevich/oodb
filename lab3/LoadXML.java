package lab3;

import Classes.Menu;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class LoadXML {
    public static Menu loadData(){
        try {
            JAXBContext context = JAXBContext.newInstance(Menu.class);
            Unmarshaller un = context.createUnmarshaller();
            return (Menu)un.unmarshal(new File("Menu.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
