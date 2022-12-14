public class Mother extends Actor implements Contest{
    Mother(String name){
        super(name);
    }
    public String bendOver(Summon what){
        return "Нагнулась над "+what.name+"."
    }
    public String mix(Summon what){
        return "Помешала в "+what.name();
    }
    public String say(String what, Summon toWho=){

    }
}
