package objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Waifu")
public class Waifu {

    public Waifu() { }

    public Waifu(String name, String series, String filename, String rarity, String id) {
        super();
        Name = name;
        Series = series;
        Filename = filename;
        Rarity = rarity;
        Id = id;
    }

    private String Name;
    private String Series;
    private String Filename;
    private String Rarity;
    private String Id;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getSeries() {
        return Series;
    }

    public void setSeries(String series) {
        this.Series = series;
    }

    public String getFilename() {
        return Filename;
    }

    public void setFilename(String filename) {
        this.Filename = filename;
    }

    public String getRarity() {
        return Rarity;
    }

    public void setRarity(String rarity) {
        this.Rarity = rarity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public String toString(){
        return this.getName() + " from " + this.getSeries();
    }


}
