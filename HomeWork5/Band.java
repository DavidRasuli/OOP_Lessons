package HomeWork5;

/**
 * Created by USER on 5/25/2017.
 */
public class Band {

    //fields

    //I haven't specified these fields at the class diagram:
    private static int MaximumMembers = 10;  // static fields which determines how many members can we have in a band
    private int memberCount;// count of current members

    private Role[] _roles;
    private String _name;
    private boolean _active;


    //getters and setters - there is no getter and setters for the whole array of roles

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
        this._name = name;
    }

    public boolean isActive()
    {
        return _active;
    }

    public void setActive(boolean active)
    {
        this._active = active;
    }

        // full constructor
    public Band(String _name, boolean _active)
    {
        this._name = _name;
        this._active = _active;

        _roles = new Role[MaximumMembers]; // we allow 10 places in the array, which exists at the heap, but empty.
        memberCount = 0; //a band is being constructed with 0 members.
    }

        // default constructor
    public Band()
    {
        this("N/A",true);
    }

        // copy constructor
    public Band(Band anotherBand)
    {
        this(anotherBand.getName(),anotherBand.isActive());
    }

    public void Play()
    {
        System.out.println(_name + " is playing now");
    }

    public void AddRole(Role role)
    {
        if (memberCount >= Band.MaximumMembers)
        {
            System.out.println("The band have Maximum number of members");
        }
        else
        {
            this._roles[memberCount] = role;
            memberCount++;
        }
    }

    public void RemoveRole(Role role)
    {
        if (memberCount <= 0)
        {
            System.out.println("The band have no members in it, unable to remove action");
        }
        else
        {
            for (int i=0;i<memberCount;i++)
            {
                if (_roles[i].get_nickName()== role.get_nickName() && _roles[i].get_type() == role.get_type())
                {
//                    _roles[i] = _roles[memberCount-1];

//                    _roles[i].set_nickName(_roles[memberCount-1].get_nickName());
//                    _roles[i].set_type(_roles[memberCount-1].get_type());
//                    _roles[i].set_sex(_roles[memberCount-1].get_sex());
//                    _roles[i].set_lead(_roles[memberCount-1].is_lead());

//                    _roles[memberCount-1] = null;

                    for (int i2 = i; i2 < memberCount; i2++)
                    {
                        _roles[i2] = _roles[i2+1];
                    }
                    memberCount--;
                    i = memberCount;
                }
            }
        }

    }

    public void Data ()
    {
         for (int i = 0 ; i < Band.MaximumMembers ; i ++)
         {
             if (_roles[i]!= null)
             {
                 System.out.println("the role on the " + i + "position is " + _roles[i].get_nickName());
             }
         }
    }
}
