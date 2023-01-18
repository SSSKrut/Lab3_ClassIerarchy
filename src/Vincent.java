import java.util.*;

public class Vincent extends Actor implements Contest,Shout,Speaking {
    public ArrayList<String> memories;
    Vincent(String name, typeGender sex){
        super(name,sex);
        memories = new ArrayList<String>();
    }
    public Vincent makeMemory(String memory){
        memories.add(memory);
        return this;
    }
    public String getHear(Summon summ, Place where){
        return this.name + " услышал "+summ.name+" со "+where.getDescription();
    }
    public String grabSummon(Summon from, Summon what){
        if(from.items.contains(what)){from.items.remove(what);this.items.add(what);}
        else{}
        return this.name+" выхватил "+ what.name + " с "+from.name+".";
    }
    public String grabSummon(Actor from, Summon what){
        if(from.items.contains(what)){from.items.remove(what);this.items.add(what);}
        else{}
        return this.name+" выхватил "+ what.name + " у "+from.name+".";
    }
    public String getMemories(){
        String memoriesAll = new String();
        memoriesAll += "Винсент вспомнинает..\n";
        for(String memory: this.memories){
            memoriesAll+=memory+"\n";
        }
        return memoriesAll;
    }
    public String getRemember(){
        return this.name+" помнит ";
    }
    public String toArgue(Actor act) {
        return this.name+" спорит с "+act.name+".";
    }
    public String toScream(Actor act) {
        return this.name + " кричит на "+act.name+".";
    }
    public String toCry(Actor act) {
        return this.name + " хныкает и бьет на жалость "+act.name+".";
    }
    public String runTo(Place place){
        return this.name + " убежал в "+place.getDescription()+".";
    }
    //public String say(String what, Summon toWho){
    //    return this.name + " сказал " + toWho.name+": "+what;
    //}
    public boolean findItem(Entity ent){
        for(Summon sum:this.items){
            if(ent.equals(sum)){return true;}
        }
        return false;
    }
    public String say(String what, Summon toWho){
        Random rand = new Random();
        if(rand.nextInt(2)%2==0 & this.findItem(new Entity("низкий бас"))){
            return this.name + " взревел басом на " + toWho.name+": "+what;
        }
        else {return this.name + " сказал " + toWho.name+": "+what;}
    }
    public String toFilch(Entity from, Item item){
        if(from.remove(item)){
            this.add(item);
            return this.name + " стащил "+item.name+" из "+from.name+".";
        }
        return this.name + " ничего не нашёл на "+from.name+".";
    }
}
