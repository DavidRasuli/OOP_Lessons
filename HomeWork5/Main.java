package HomeWork5;

public class Main {

    public static void main(String[] args) {
        Role _a;
        _a = new Role();
        _a.set_nickName("TheA");
        _a.set_lead(true);
        _a.set_sex(Gender.M);
        _a.set_type(RoleType.Vocals);

        Role _b = new Role(RoleType.Guitar,Gender.M,"TheB",false);

        Role _c = new Role(RoleType.Guitar,Gender.M,"TheC",false);

        Role _d = new Role(RoleType.Guitar,Gender.M,"TheD",false);

        Role _e = new Role(RoleType.Guitar,Gender.M,"TheE",false);

        Role _f = new Role(RoleType.Bass,Gender.M,"TheF",false);

        Role _g = new Role(RoleType.Drums,Gender.M,"TheG",false);

        Role _h = new Role(RoleType.Vocals,Gender.M,"TheH",false);

        Role _i = new Role(RoleType.Bass,Gender.M,"TheI",false);

        Role _j = new Role(RoleType.Guitar,Gender.M,"TheJ",false);

        Role _k = new Role(RoleType.Drums,Gender.M,"TheK",false);

        Role _l = new Role(RoleType.Vocals,Gender.M,"TheL",false);



        //

        Band bandA = new Band("TheABand",true);

        bandA.AddRole(_a);
        bandA.AddRole(_b);
        bandA.AddRole(_c);
        bandA.AddRole(_d);
//        bandA.AddRole(_f);
//        bandA.AddRole(_h);
//        bandA.AddRole(_i);
//        bandA.AddRole(_j);
//        bandA.AddRole(_g);
//        bandA.AddRole(_k);
//        bandA.AddRole(_l);

        //

        bandA.RemoveRole(_b);
        bandA.RemoveRole(_e);

        bandA.Data();








    }
}
