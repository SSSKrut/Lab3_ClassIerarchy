public class Actor extends Entity{
    public String location;
    public typeGender sex;
    public typeEmotions emotion;
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
    public String giveSummon(Summon who, Summon what){
        who.items.add(what);
        this.remove(what);
        return what.name;
    }
    public String giveItem(Summon who,Item item, int count){
        who.items.add(new Item(item.name,count));
        this.remove(new Item(item.name,count));
        return item.name + " "+count;
    }
    public boolean lookAt(Entity object){
        return true;
    }
}
