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
    public boolean remove(Object obj) {
        if(obj instanceof Item) {
            for(Summon it: items) {
                if(obj.equals(it)) {
                    Item itm = (Item)it;
                    itm.count-=((Item) obj).count;
                    return true;
                }
            }
        } else {
            for(Summon it: items) {

                if(obj.equals(it)) {
                    items.remove(it);
                    return true;
                }
            }
        }
        return false;
    }
    public void moveTo(Place from, Place to){
        to.addActor((Actor) this);
        from.remove(this);
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
}
