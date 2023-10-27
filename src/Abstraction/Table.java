import java.util.ArrayList;

public class Table implements Billable {

    private Integer width = 20;
    private Integer length = 10;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer numLegs) {
         for(int i = 0; i < numLegs; i++) {
             legs.add(new Leg(25));
        }
    }
    public Float getPrice()
    {
        return (float)(width* length);
    }
    public static void main(String [] args)
    {
        var myTable = new Table(4);
        System.out.println(myTable.getPrice());
    }
}