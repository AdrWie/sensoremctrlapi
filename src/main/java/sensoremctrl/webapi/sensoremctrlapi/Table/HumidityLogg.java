package sensoremctrl.webapi.sensoremctrlapi.Table;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "humiditylogg")
public class HumidityLogg implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "humidityid")
    private long humidityID;

    @Column(name = "humidity")
    private int humidity;

    protected HumidityLogg(){

    }

    public HumidityLogg(int humidity) {
        this.humidity = humidity;
    }

    public long getHumidityID() {
        return humidityID;
    }

    public void setHumidityID(long humidityID) {
        this.humidityID = humidityID;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
