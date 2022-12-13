import java.util.*;

public class Vincent extends Actor implements Contest {
    public Map<Summon,String> memories;
    Vincent(String name){
        super(name);
        memories = new HashMap<Summon,String>();
    }
    public Vincent setMemory(Summon summ, String memory){
        memories.put(summ,memory);
        return this;
    }
    public String getMemory(Summon summ){
        return this.memories.get(summ);
    }
    public String getHear(Summon summ){
        return "Услышал "+summ.name+" со стороны.";
    }
    public String grabSummon(Summon from, Summon what){
        if(from.items.contains(what)){from.items.remove(what);this.items.add(what);}
        else{}
        return "Выхватил "+what.name+" у "+from.name+".";
    }

    @Override
    public String toArgue(Actor act) {
        return "Спорит с "+act.name+".";
    }
    @Override
    public String toScream(Actor act) {
        return "Кричит на "+act.name+".";
    }
}
