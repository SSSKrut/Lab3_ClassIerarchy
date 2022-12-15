public class Sister extends Actor {
    public typeHealth health;
    Sister(String name){
        super(name);
    }
    public String clingTo(Summon what){
        return "Вцепилась в "+what.name+".";
    }
    public void setEmotion(typeEmotions emo){
        this.emotion = emo;
    }
    public String getEmotion(){
        return this.emotion.toString();
    }
}
