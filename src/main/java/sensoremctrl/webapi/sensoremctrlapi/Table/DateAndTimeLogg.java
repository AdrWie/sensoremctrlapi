package sensoremctrl.webapi.sensoremctrlapi.Table;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "dateandtimelogg")
public class DateAndTimeLogg implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "timestampid")
    private long timeStampID;

    @Column(name = "timestamp")
    private Date timeStamp;

    protected DateAndTimeLogg(){

    }

    public DateAndTimeLogg(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public long getTimeStampID() {
        return timeStampID;
    }

    public void setTimeStampID(long timeStampID) {
        this.timeStampID = timeStampID;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
