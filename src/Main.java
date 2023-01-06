import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Place DarkStuffyRoom=new Place("Комната","Наша комната, тёмная душная комната.");
        Place entryway = new Place("Лестничная площадка","Лестничная площадка");
        Place productDistributor = new Place("Выдача продуктов","Место, в котором, вероятно, выдавали продукты.");
        Place out = new Place("Образное 'никуда'","вон.");
        Place side = new Place("Образное 'со стороны'","стороны.");

        Item pot = new Item("кастрюля",1);
        Item bed = new Item("кровать",1);
        Item quiltWhiteBlanket = new Item("белое стеганное одеяло",1);
        Item brownCeramicSink = new Item("коричневая керамическая раковина",1);
        Item ticket = new Item("талон",1);
        Item ladle = new Item("половник",1);
        Item burner = new Item("камин с газовой конфоркой",1);
        Item plateV = new Item("тарелка Винсента",1);
        Item plateS = new Item("тарелка сестры",1);
        Item shelf = new Item("полка для продуктов",1);
        Item food = new Item("добавка",1);
        Item foodnaggets = new Item("куски",1);
        Item chocolate = new Item("шоколад",4);
        Entity supplies = new Item("припасы",1);

        Vincent actVincent = new Vincent("Винсент");
        Sister actSister = new Sister("сестра");
        Mother actMother = new Mother("мать");

        DarkStuffyRoom.addActor(actVincent);
        DarkStuffyRoom.addActor(actSister);
        DarkStuffyRoom.addActor(actMother);

        bed.items.add(quiltWhiteBlanket);
        shelf.items.add(supplies);
        burner.items.add(pot);

        DarkStuffyRoom.addItem(shelf).addItem(bed).addItem(burner);
        entryway.addItem(brownCeramicSink);
        productDistributor.addSummon(chocolate);
        actMother.items.add(ladle); actMother.items.add(ticket);
        actVincent.items.add(plateV);
        plateS.items.add(foodnaggets);
        actSister.items.add(plateS);

        actVincent.makeMemory()

        actVincent.makeMemory(DarkStuffyRoom, DarkStuffyRoom.getDescription()+" Половину занимала "+bed.name+" под "+quiltWhiteBlanket.name+", ");
        actVincent.makeMemory(burner, burner.name+", ");
        actVincent.makeMemory(shelf, shelf.name+".");
        actVincent.makeMemory(entryway, " На "+entryway.getDescription()+" была ");
        actVincent.makeMemory(brownCeramicSink, brownCeramicSink.name+", одна на несколько семей.");

        actVincent.clearContent();
        System.out.println(actVincent.getMemories());
//        System.out.println("Он помнил их комнату.");
//        System.out.print(vincent.getMemory(DarkStuffyRoom));
//        System.out.print(vincent.getMemory(burner));
//        System.out.println(vincent.getMemory(shelf));
//        System.out.print(vincent.getMemory(entryway));
//        System.out.println(vincent.getMemory(brownCeramicSink));
//
//        System.out.println("Он помнил как "+mother.name+" "+mother.bendOver(burner)+", чтобы "+mother.mix(pot)+".");
//        System.out.println("Но лучше всего он помнил непрерывный голод.");
//        mother.takeSummon(burner,pot);
//        System.out.println(vincent.toArgue(mother)+" "+vincent.toScream(mother)+" Чтобы получить добавку.");
//        System.out.println(mother.name+" с готовностью давала ему "+mother.giveSummon(vincent,food)+".");
//        System.out.print("Если она переставала накладывать, "+vincent.name+" "+vincent.toScream(mother)+", выхватывал "+vincent.grabSummon(mother,ladle)+" и "+vincent.grabSummon(mother,pot)+".");
//        System.out.println(" Воровал "+vincent.grabSummon(plateS,foodnaggets)+" с "+plateS.name+".");
//        if(mother.lookAt(bed)){
//            vincent.takeSummon(supplies,food);
//            System.out.println("Стоило только "+mother.name+" отвернуться, тащил из "+supplies.name+".");
//        }
//        mother.moveTo(DarkStuffyRoom,productDistributor);
//        vincent.moveTo(DarkStuffyRoom,productDistributor);
//        sister.moveTo(DarkStuffyRoom,productDistributor);
//        System.out.println("\nОднажды им выдали по "+ticket.name+" "+chocolate.name+".");
//        mother.giveSummon(productDistributor,ticket);
//        mother.takeSummon(productDistributor,chocolate);
//        System.out.println("Впервые за несколько месяцев.");
//        System.out.println("Винсент "+vincent.getHear(vincent,side));
//        System.out.println("Он требовал все.");
//        System.out.println(vincent.toArgue(mother)+" "+vincent.toScream(mother));
//        sister.lookAt(vincent);sister.emotion=typeEmotions.sadEyes;
//        System.out.println("Сестра "+sister.clingTo(mother)+" Смотрела на него печальными глазами.");
//        System.out.println(mother.name+" дала "+vincent.name+" "+mother.giveItem(vincent,chocolate,3)+" и "+sister.name+" "+mother.giveItem(sister,chocolate,1)+".");
//        sister.lookAt(chocolate); sister.emotion=typeEmotions.noEmotion;
//        System.out.println(sister.name+" тупо смотрела на него.");
//        vincent.lookAt(sister);
//        System.out.println(vincent.name+" наблюдал за ней.");
//        System.out.println("Затем подскочил, выхватил у нее"+vincent.grabSummon(sister,chocolate)+" и "+vincent.runTo(out)+"..");
    }
}
