import java.util.List;

public class Main{
    
    public static void main(String[] args) {
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList(10);

        recentlyUsedList.add("file1.txt");
        assert recentlyUsedList.getList().equals(List.of("file1.txt")) : "Test Case 1 Failed";

        recentlyUsedList.add("file2.txt");
        assert recentlyUsedList.getList().equals(List.of("file2.txt", "file1.txt")) : "Test Case 1 Failed";

        recentlyUsedList.add("file3.txt");
        assert recentlyUsedList.getList().equals(List.of("file3.txt", "file2.txt", "file1.txt")) : "Test Case 1 Failed";

        recentlyUsedList.add("file2.txt");
        assert recentlyUsedList.getList().equals(List.of("file2.txt", "file3.txt", "file1.txt")) : "Test Case 2 Failed";

        recentlyUsedList.add("file4.txt");
        assert recentlyUsedList.getList().equals(List.of("file4.txt", "file2.txt", "file3.txt")) : "Test Case 3 Failed";

        recentlyUsedList.add("file3.txt");
        assert recentlyUsedList.getList().equals(List.of("file3.txt", "file4.txt", "file2.txt")) : "Test Case 4 Failed";

    }

}
