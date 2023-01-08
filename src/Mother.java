import java.util.Collections;

public class Mother extends Actor implements Contest, Speaking{
    Mother(String name, typeGender sex){
        super(name,sex);
    }
    public String bendOver(Summon what){
        return this.name + " наклонилась над "+what.name;
    }
    public String mix(Summon what){
        Collections.shuffle(what.items);
        return this.name +" помешала в "+what.name;
    }
    public String say(String what, Summon toWho){
        return this.name + " сказала " + toWho.name+": "+what;
    }
    public String toArgue(Actor act) {
        return this.name + " начинает спор с "+act.name;
    }
}
