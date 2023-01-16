public class Actor extends Entity{
    protected String location;
    protected typeGender sex;
    protected typeEmotions emotion;
    protected typeHealth health;
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
    public String getHealth(){
        switch (health){
            case healthy:
                return "чувствует себя хорошо";
            case sick:
                return "болеет";
            default:
                return "не подает признаков жизни";
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
        return this.name+" даёт "+ what.name + " "+who.name;
    }
    public String giveItem(Summon who, Item item, int count){
        who.items.add(new Item(item.name,count));
        this.remove(new Item(item.name,count));
        return this.name + " кладёт " + item.name + "("+count+") на "+who.name;
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
    public void setHealth(typeHealth heal){
        this.health = heal;
    }
}
