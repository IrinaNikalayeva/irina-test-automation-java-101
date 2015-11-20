package module3.task4;

        import java.util.ArrayList;
        import java.util.LinkedList;
        import java.util.List;

        public class ListsRunner {
    public static void main(String args[]){
               List<Integer> arrayList = new ArrayList<Integer>();
                LinkedList<Integer> linkedList = new LinkedList<Integer>();
                int listSize = 10000;
                int searchValue = 9999;

                ListsOperations listsOperations = new ListsOperations();

                       System.out.println("ArrayList: Time for add, ms: " + listsOperations.getTimeForAdd(arrayList, listSize));
               System.out.println("LinkedList: Time for add, ms: " + listsOperations.getTimeForAdd(linkedList, listSize));

               System.out.println("ArrayList: Time for detele, ms: " + listsOperations.getTimeForDelete(arrayList, listSize));
               System.out.println("LinkedList: Time for delete, ms: " + listsOperations.getTimeForDelete(linkedList, listSize));

               System.out.println("ArrayList: Time for search, ms: " + listsOperations.getTimeForSearch(arrayList, listSize, searchValue));
               System.out.println("LinkedList: Time for search, ms: " + listsOperations.getTimeForSearch(arrayList, listSize, searchValue));
           }
    }