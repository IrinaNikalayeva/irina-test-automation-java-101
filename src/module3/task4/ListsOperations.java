package module3.task4;

import java.util.List;
import java.util.Random;


public class ListsOperations {
    Random random = new Random();

    public Long getTimeForAdd(List<Integer> list, int size)
    {
        Long addStart = System.currentTimeMillis();
        for (int i = 0; i <= size; i++){
            list.add(random.nextInt());
        }
        Long addFinish = System.currentTimeMillis();
        Long addResult = addFinish - addStart;
        return addResult;
    }

    public Long getTimeForDelete(List<Integer> list, int size){
        Long deleteStart = System.currentTimeMillis();
        for (int i = 0; i <= size; i++){
            list.removeAll(list);
        }
        Long deleteFinish = System.currentTimeMillis();
        Long deleteResult = deleteFinish - deleteStart;
        return deleteResult;

    }
    public Long getTimeForSearch(List<Integer> list, int size, int searchValue){
        Long searchStart = System.currentTimeMillis();
        for (int i = 0; i <= size; i++){
            list.contains(searchValue);
        }
        Long searchFinish = System.currentTimeMillis();
        Long searchResult = searchFinish - searchStart;
        return searchResult;

    }
}