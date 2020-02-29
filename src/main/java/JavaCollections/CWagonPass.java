package JavaCollections;

public class CWagonPass extends CWagon{

    public int id, capacity, weight;
    public String owner;
    public int maxNumberOfPassengers = 90;
    int comfortLevel, passengers;


    public CWagonPass (int id, int capacity, int weight, String owner, int comfortLevel, int passengers){
        super(id,capacity, weight, owner);
        comfortLevel = this.comfortLevel;
        passengers = this.passengers;
    }

}