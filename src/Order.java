import java.util.HashMap;
import java.util.Map;

public class Order {
    //餐桌号码
    private int diningTable;
    //餐品
    private Map<String,Integer> foodDir = new HashMap<String,Integer>();
    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public void setFood(String name,int num) {
        foodDir.put(name,num);
    }



    public int getDiningTable() {
        return diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }
}
