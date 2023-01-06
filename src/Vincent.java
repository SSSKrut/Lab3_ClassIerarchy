import java.util.*;

public class Vincent extends Actor implements Contest,Shout {
    public ArrayList<String> memories;
    Vincent(String name){
        super(name);
        memories = new ArrayList<String>();
    }
    public Vincent makeMemory(String memory){
        memories.add(memory);
        return this;
    }
    public String getHear(Summon summ, Place where){
        return "услышал "+summ.name+" со "+where.getDescription();
    }
    public String grabSummon(Summon from, Summon what){
        if(from.items.contains(what)){from.items.remove(what);this.items.add(what);}
        else{}
        return what.name;
    }
    public String getMemories(){
        String memoriesAll = new String();
        for(Summon key: this.memories.keySet()){
            memoriesAll += this.memories.get(key);
        }
        return memoriesAll;
    }
    public String toArgue(Actor act) {
        return "Спорит с "+act.name+".";
    }
    public String toScream(Actor act) {
        return "Кричит на "+act.name+".";
    }
    public  String runTo(Place place){
        return "Убежал "+place.getDescription();
    }

}
