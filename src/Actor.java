public class Actor extends Entity{
    protected String location;
    protected typeGender sex;
    protected typeEmotions emotion;
    Actor(String name,typeGender sex){
        super(name);this.sex=sex;
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
    public String giveItem(Summon who, Item item, int count){
        who.items.add(new Item(item.name,count));
        this.remove(new Item(item.name,count));
        return item.name + " "+count;
    }
    public boolean lookAt(Entity object){
        return true;
    }
    public void moveTo(Place from, Place to){
        to.addActor((Actor) this);
        from.remove(this);
    }
    public void setEmotion(typeEmotions emo){
        this.emotion = emo;
    }
    public typeEmotions getEmotion(){
        return this.emotion;
    }
}
