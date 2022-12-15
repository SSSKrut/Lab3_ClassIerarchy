public class Mother extends Actor implements Contest{
    Mother(String name){
        super(name);
    }
    public String bendOver(Summon what){
        return "перегибалась над "+what.name;
    }
    public String mix(Summon what){
        return "помешать в "+what.name;
    }
    public String say(String what, Summon toWho){
        return this.name + " сказала " + toWho.name+": "+what;
    }
    public String toArgue(Actor act) {
        return "Спорит с "+act.name+".";
    }
}
