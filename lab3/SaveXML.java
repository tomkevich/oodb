package lab3;

import Classes.Menu;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class SaveXML {
    public static void saveData(Menu menu) {
        try {
            JAXBContext context = JAXBContext.newInstance(Menu.class);
            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(menu, new File("Menu.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
