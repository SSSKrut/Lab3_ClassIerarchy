import exceptions.NameException;
public class Sister extends Actor {
    public typeHealth health;
    Sister(String name, typeGender sex)throws NameException{
        super(name,sex);if(name.length()==0){throw new NameException("Non declared lenght of name-str-Sister");}
    }
    public String clingTo(Summon what){
        return this.name+" вцепилась в "+what.name+".";
    }
    public void setEmotion(typeEmotions emo){
        this.emotion = emo;
    }
    public typeEmotions getEmotion(){
        return this.emotion;
    }
}
