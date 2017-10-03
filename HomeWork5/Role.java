package HomeWork5;

/**
 * Created by USER on 5/25/2017.
 */
public class Role {
    //fields

    private RoleType _type;
    private Gender _sex;
    private String _nickName;
    private boolean _lead;


    //getters and setters
    public RoleType get_type() {
        return _type;
    }

    public void set_type(RoleType type) {
        this._type = _type;
    }
    public Gender get_sex() {
        return _sex;
    }

    public void set_sex(Gender sex) {
        this._sex = _sex;
    }

    public String get_nickName() {
        return _nickName;
    }

    public void set_nickName(String nickName) {
        this._nickName = nickName;
    }

    public boolean is_lead() {
        return _lead;
    }

    public void set_lead(boolean lead) {
        this._lead = lead;
    }

    //constructors

    //full constructor
    public Role(RoleType type, Gender sex, String nickName, boolean lead) {
        this._type = type;
        this._sex = sex;
        this._nickName = nickName;
        this._lead = lead;
    }

    //default constructor
    public Role() {
        this(RoleType.Bass,Gender.F,"N/A",false);
    }

    //copy constructor
    public Role(Role copy)
    {
        this(copy.get_type(),copy.get_sex(),copy.get_nickName(),copy.is_lead());
    }

    //methods
    public String Play()
    {
        return _nickName + " is playing the " + _type;
    }

    public String Sing()
    {
        if(_type == RoleType.Vocals)
        {
            return _nickName + " sings";
        }
        else
        {
            return _nickName + " can't sing";
        }
    }
}
