public class Place extends Summon implements GetDescription{
    public String description;
    Place(String description){
        this.description = description;
    }
    public Place addItem(Item item){
        this.items.add(item);
        return this;
    }
    public Place addActor(Actor actor){
        this.items.add(actor);
        return this;
    }
    public Place addSummon(Summon summon){
        this.items.add(summon);
        return this;
    }
    public String getDescription(){
        return description;
    }
}
