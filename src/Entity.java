import exceptions.NameException;
public class Entity extends Summon {
    Entity(String name) throws NameException{
        super.name = name;
        if(name.length()==0){throw new NameException("Non declared lenght of str");}
    }
    public String lookPoint(){
        return super.name;
    }

}
