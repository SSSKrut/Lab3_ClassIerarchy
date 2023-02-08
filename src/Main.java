import java.util.HashMap;
import java.util.Map;
import exceptions.*;
public class Main {
    public static void main(String[] args) throws NameException{
            Place DarkStuffyRoom = new Place("Комната", "Наша комната, тёмная душная комната.");
            Place entryway = new Place("Лестничная площадка", "Лестничная площадка");
            Place productDistributor = new Place("Выдача продуктов", "Место, в котором, вероятно, выдавали продукты.");
            Place out = new Place("Образное 'никуда'", "вон.");
            Place side = new Place("Образное 'со стороны'", "стороны.");

            Item pot = new Item("кастрюля", 1);
            Item bed = new Item("кровать", 1);
            Item quiltWhiteBlanket = new Item("белое стеганное одеяло", 1);
            Item brownCeramicSink = new Item("коричневая керамическая раковина", 1);
            Item ticket = new Item("талон", 1);
            Item ladle = new Item("половник", 1);
            Item burner = new Item("камин с газовой конфоркой", 1);
            Item plateV = new Item("тарелка Винсента", 1);
            Item plateS = new Item("тарелка сестры", 1);
            Item shelf = new Item("полка для продуктов", 1);
            Item chocolate = new Item("шоколад", 4);
            Item supplies = new Item("галеты", 2);
            Item potato = new Item("кусочки еды", 6);
            Entity voiсeVincent = new Entity("низкий бас");
            Entity feelRight = new Entity("ощущенье правоты");

            Vincent actVincent = new Vincent("", typeGender.male);
            Sister actSister = new Sister("Сестра", typeGender.female);
            Mother actMother = new Mother("Мать", typeGender.female);

            DarkStuffyRoom.addActor(actVincent);
            DarkStuffyRoom.addActor(actSister);
            DarkStuffyRoom.addActor(actMother);

            pot.add(potato);
            bed.add(quiltWhiteBlanket);
            shelf.add(supplies);
            burner.add(pot);

            DarkStuffyRoom.addItem(shelf).addItem(bed).addItem(burner);
            entryway.addItem(brownCeramicSink);
            productDistributor.addSummon(chocolate);
            actMother.add(ladle);
            actVincent.add(plateV);
            actSister.add(plateS);

            actVincent.makeMemory(DarkStuffyRoom.getDescription());
            actVincent.makeMemory(bed.toString());
            actVincent.makeMemory(shelf.toString());
            actVincent.makeMemory(entryway.getDescription());
            actVincent.makeMemory(entryway.toString());

            actVincent.makeMemory(actMother.bendOver(burner));
            actVincent.makeMemory(actMother.mix(pot));
            actMother.add(pot);
            actVincent.setEmotion(typeEmotions.hungry);
            actMother.setEmotion(typeEmotions.hungry);
            actSister.setEmotion(typeEmotions.hungry);
            actVincent.setHealth(typeHealth.healthy);
            actMother.setHealth(typeHealth.healthy);
            actSister.setHealth(typeHealth.sick);
            actVincent.makeMemory(actMother.giveItem(plateS, potato, potato.count / 3));
            actVincent.makeMemory(actMother.giveItem(plateV, potato, potato.count / 2));
            if(plateS.getItemsCount() >= plateV.getItemsCount()) {
                actVincent.setEmotion(typeEmotions.angry);
            }
            if(actVincent.getEmotion() == typeEmotions.angry) {
                actVincent.makeMemory(actVincent.toArgue(actMother));
                actVincent.makeMemory(actVincent.say("почему ты не даешь мне больше? Я же " + actVincent.getSex(), actMother));
                actVincent.makeMemory(actVincent.toScream(actMother));
            }
            if(actVincent.getSex() == "мальчик") {
                actVincent.add(voiсeVincent);
                actVincent.makeMemory(actVincent.getRemember() + "свой " + voiсeVincent.name + ". Голос стал ломаться рано");
            }

            if(pot.getItemsCount() > 1) {
                actVincent.makeMemory(actMother.giveItem(plateV, potato, 1));
                if(plateV.getItemsCount() > 24) {
                    actVincent.setEmotion(typeEmotions.noEmotion);
                }
                if(actVincent.getEmotion() == typeEmotions.angry) {
                    actVincent.makeMemory(actVincent.toArgue(actMother));
                    actVincent.makeMemory(actVincent.say("дай мне еще!", actMother));
                    actVincent.makeMemory(actVincent.toCry(actMother));
                }
            }
            actVincent.makeMemory(actMother.say("не будь эгоистом. " + actSister.name + " " + actSister.getHealth() + ", и она тоже должна есть", actVincent));
            if(actVincent.getEmotion() == typeEmotions.angry) {
                actVincent.makeMemory(actVincent.toScream(actMother));
                actVincent.makeMemory(actVincent.grabSummon(actMother, ladle));
                actVincent.makeMemory(actVincent.grabSummon(plateS, potato));
                actVincent.add(feelRight);
            }
            actVincent.makeMemory(actMother.lookAt(bed));
            if(actMother.getLookingat() != shelf) {
                actVincent.makeMemory(actVincent.toFilch(shelf, supplies));
                actVincent.setEmotion(typeEmotions.noEmotion);
            }

            actMother.remove(ladle);
            actMother.remove(pot);
            actVincent.remove(plateV);
            actVincent.remove(ladle);
            actSister.remove(plateS);
            actVincent.moveTo(DarkStuffyRoom, productDistributor);
            actSister.moveTo(DarkStuffyRoom, productDistributor);
            actMother.moveTo(DarkStuffyRoom, productDistributor);
            actVincent.makeMemory(actMother.toTakeFood(ticket, chocolate));
            //actVincent.lookAt(actVincent);
            actVincent.makeMemory(actVincent.getHear(voiсeVincent, side));
            actVincent.makeMemory(actVincent.say("дай мне все!", actMother));
            actVincent.makeMemory(actMother.say("не жадничай!", actVincent));
            actVincent.makeMemory(actVincent.toArgue(actMother));
            actVincent.makeMemory(actVincent.toScream(actMother));
            actVincent.makeMemory(actVincent.toCry(actMother));

            actSister.setEmotion(typeEmotions.sadEyes);
            actVincent.makeMemory(actSister.clingTo(actMother));
            actVincent.makeMemory(actSister.lookAt(actVincent));

            actVincent.makeMemory(actMother.giveItem(actVincent, chocolate, 3));
            actVincent.makeMemory(actMother.giveItem(actSister, chocolate, 1));

            actVincent.makeMemory(actSister.lookAt(chocolate));
            actVincent.makeMemory(actVincent.lookAt(actSister));
            actVincent.makeMemory(actVincent.grabSummon(actSister, chocolate));
            actVincent.makeMemory(actVincent.runTo(out));

            actVincent.clearContent();
            System.out.println(actVincent.getMemories());
    }
}
