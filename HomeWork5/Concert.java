package HomeWork5;

/**
 * Created by USER on 5/25/2017.
 */
public class Concert {
    //TODO : 1.fields. 2.getters/setters. 3.three constructors.

    //fields : location(Venue - create enum for that),date-(use Demodate), band (use the Band we created, warmup (bool).
    Venue _location;
    DemoDate _date;
    Band _band;
    Boolean _warmUp;


    // getters and setters


    public Venue get_location() {
        return _location;
    }

    public void set_location(Venue _location) {
        this._location = _location;
    }

    public DemoDate get_date() {
        return _date;
    }

    public void set_date(DemoDate _date) {
        this._date = _date;
    }

    public Band get_band() {
        return _band;
    }

    public void set_band(Band _band) {
        this._band = _band;
    }

    public Boolean get_warmUp() {
        return _warmUp;
    }

    public void set_warmUp(Boolean _warmUp) {
        this._warmUp = _warmUp;
    }

    // constructors


    public Concert(Venue _location, DemoDate _date, Band _band, Boolean _warmUp) {
        this._location = _location;
        this._date = _date;
        this._band = _band;
        this._warmUp = _warmUp;
    }

    public Concert() {
        this(Venue.HayarkonPark,new DemoDate(1990,01,01),new Band(),false);
    }


    public Concert(Concert anotherConcert) {
        this(anotherConcert.get_location(),anotherConcert.get_date(),anotherConcert.get_band(),anotherConcert.get_warmUp());
    }

}
