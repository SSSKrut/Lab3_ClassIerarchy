import java.util.*;
public abstract class Summon {
    public String name;
    public Vector<Summon> items = new Vector<Summon>();
    @Override
    public boolean equals(Object obj){
        Summon sum = (Summon) obj;
        if(sum.hashCode() == this.hashCode()) {return true;}
        else {return false;}
    }
    public boolean remove(Summon obj) {
        if(obj instanceof Item) {
            for(Summon it: items) {
                if(obj.equals(it)) {
                    ((Item)it).count-=((Item) obj).count;
                    return true;
                }
                else if(it.getItemsCount()>0) {
                    if(it.remove(obj)){return true;}
                }
            }
        } else {
            for(Summon it: items) {

                if(obj.equals(it)) {
                    items.remove(it);
                    return true;
                }
                else if(it.getItemsCount()>0) {
                    if(it.remove(obj)){return true;}
                }
            }
        }
        return false;
    }

    @Override
    public String toString(){
        String placestr = name+", где находится:";
        for(Summon sum: this.items){
            placestr +=" "+sum.name;
        }
        placestr+=".";
        return placestr;
    }
    @Override
    public int hashCode(){
        int hash = 15;
        for(char ch:this.name.toCharArray()){
            hash=hash*7+ch;
        }
        return hash;
    }
    public void clearContent(){
        items.clear();
    }
    public void add(Summon summon){
        this.items.add(summon);
    }
    public float getItemsCount(){
        float count = 0;
        for(Summon i : this.items){
            if(i instanceof Item){count += ((Item)i).count;}
            else{count += 1;}
        }
        return count;
    }
}
