public class Sister extends Actor {
    public typeHealth health;
    Sister(String name, typeGender sex){
        super(name,sex);
    }
    public String clingTo(Summon what){
        return "Вцепилась в "+what.name+".";
    }
    public void setEmotion(typeEmotions emo){
        this.emotion = emo;
    }
    public typeEmotions getEmotion(){
        return this.emotion;
    }
}
