import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {
    private final int maxLength;
    private final List<String> items;

    public RecentlyUsedList(int maxLength){
        this.maxLength = maxLength;
        this.items = new ArrayList<>();
    }
   
    public void add(String newItem) {
        items.remove(newItem);

        items.add(0, newItem);

        if (items.size() > maxLength) {
            items.remove(items.size() - 1);
        }
    }

    public List<String> getList() {
        return new ArrayList<>(items);
    }

}

