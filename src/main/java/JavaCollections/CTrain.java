package JavaCollections;
import java.awt.List;
import java.util.*;

public class CTrain {


    public CTrain (CLocomotive locomotive, LinkedList wagonsPass, LinkedList wagonsFreight) {

        locomotive = addLocomotive(0, 0);
        wagonsPass = addWagonPass(int size, String "file");
    }


    public LinkedList createWagonPassSet(int id, int capacity, int weight, String owner, int comfortLevel, int passengers){
        LinkedList<CWagon> list = new LinkedList();

        list.add(addWagonPass(id, capacity, weight, owner,  comfortLevel,  passengers));
        return list;
    }


    public CWagonPass addWagonPass(int id, int capacity, int weight, String owner, int comfortLevel, int passengers) {
        CWagonPass wagon = new CWagonPass(id, capacity, weight, owner, comfortLevel,  passengers);

        return wagon;
    }

    public CLocomotive addLocomotive (int maxSpeed, int maxWagonMass){
        CLocomotive locomotive = new CLocomotive(maxSpeed, maxWagonMass);
        return locomotive;
    }



}
