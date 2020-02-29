package JavaCollections;



public class CWagonFreight extends CWagon{
    public int id, capacity, weight;
    public String owner;
    public int numberOfBaggage = 0;


    public CWagonFreight (int id, int capacity, int weight, String owner){
        super(id,capacity, weight, owner);
    }
}
