import exceptions.NameException;

import java.util.Collections;

public class Mother extends Actor implements Contest, Speaking{
    Mother(String name, typeGender sex) throws NameException{
        super(name,sex);
        if(name.length()==0){throw new NameException("Non declared lenght of name-str-Mother");}
    }
    public String bendOver(Summon what){
        return this.name + " наклонилась над "+what.name+".";
    }
    public String mix(Summon what){
        Collections.shuffle(what.items);
        return this.name +" помешала в "+what.name+".";
    }
    public String say(String what, Summon toWho){
        return this.name + " сказала " + toWho.name+": "+what;
    }
    public String toArgue(Actor act) {
        return this.name + " начинает спор с "+act.name+".";
    }
    public String toTakeFood(Item talon,Item what){
        if(this.remove(talon)){
            this.add(what);
            return this.name+" получила "+what.name+".";
        }
        else{return this.name+" не получила ничего.";}
    }
    public String takeChocolate(Item takeWhat, Item giveWhat){
        class Trade{
            Trade(Summon give, Summon take, Actor toWho){
                toWho.remove(give);
                toWho.add(take);
            }
        }
        Trade chlt = new Trade(giveWhat, takeWhat, this);
        return this.name+" получила "+takeWhat.name;
    }
}
