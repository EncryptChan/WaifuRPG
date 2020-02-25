package games;

import objects.Waifu;
import objects.WaifuList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;
import java.util.Random;

public class WaifuRPG {

    //Complete List
    List<Waifu> waifu4;

    //List of same rarities
   // WaifuList list1 = new WaifuList();
   // WaifuList list2 = new WaifuList();
   // WaifuList list3 = new WaifuList();




    public WaifuRPG() throws JAXBException {
        setWaifus();
    }



    public void setWaifus() throws JAXBException {

        //Read rank 4s
        File file = new File("src\\Resources\\WaifuList.XML");
        JAXBContext jaxbContext = JAXBContext.newInstance(WaifuList.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        WaifuList waifulist = (WaifuList) jaxbUnmarshaller.unmarshal(file);
        waifu4 = waifulist.getWaifus();

    }



    public Waifu giveWaifu(){
        return waifu4.get(new Random().nextInt(waifu4.size()));

    }



}
