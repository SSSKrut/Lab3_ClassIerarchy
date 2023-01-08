import java.util.*;

public class Vincent extends Actor implements Contest,Shout,Speaking {
    public ArrayList<String> memories;
    Vincent(String name, typeGender sex){
        super(name,sex);
        memories = new ArrayList<String>();
    }
    public Vincent makeMemory(String memory){
        memories.add(memory+". ");
        return this;
    }
    public String getHear(Summon summ, Place where){
        return this.name + " услышал "+summ.name+" со "+where.getDescription();
    }
    public String grabSummon(Summon from, Summon what){
        if(from.items.contains(what)){from.items.remove(what);this.items.add(what);}
        else{}
        return what.name;
    }
    public String getMemories(){
        String memoriesAll = new String();
        for(String memory: this.memories){
            memoriesAll+=memory;
        }
        return memoriesAll;
    }
    public String toArgue(Actor act) {
        return "Спорит с "+act.name+".";
    }
    public String toScream(Actor act) {
        return this.name + " кричит на "+act.name+".";
    }
    public String runTo(Place place){
        return this.name + " убежал в"+place.getDescription();
    }
    public String say(String what, Summon toWho){
        return this.name + " сказал " + toWho.name+": "+what;
    }
}
