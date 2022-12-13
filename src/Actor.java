public class Actor extends Entity{
    public String location;
    public typeGender sex;
    Actor(String name){
        super(name);
    }
    public String getSex(){
        switch (sex){
            case male:
                return "мальчик";
            case female:
                return "девочка";
            default:
                return "не понятно";
        }
    }
    public String takeSummon(Summon from,Summon what){
        if(from == null) {
            items.add(what);
            return what.name;
        }
        else {
            if(from.remove(what)) {
                items.add(what);
                return what.name;
            } else {
                return what.name;
            }
        }
    }
}
