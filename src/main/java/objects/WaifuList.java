package objects;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="WaifuList")
public class WaifuList {

    @XmlElement(name="Waifu", type=Waifu.class)
    private List<Waifu> Waifus;

    public WaifuList() { }


    public WaifuList(List<Waifu> Waifus) {
        super();
        this.Waifus = Waifus;
    }



    public List<Waifu> getWaifus() {
        return Waifus;
    }

    public void setWaifus(List<Waifu> Waifus) {
        this.Waifus = Waifus;
    }

}
