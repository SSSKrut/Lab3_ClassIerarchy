public class Item extends Entity implements GetDescription {
    public int count;
    protected String description;
    Item(String name, int count){
        super(name); this.count = count;
    }
    @Override
    public String getDescription() {
        return description;
    }

}
