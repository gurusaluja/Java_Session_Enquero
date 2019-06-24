package own.practice;

import java.util.*;

public class CollectionExample {
    static void hashsetExample(){
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Example");
        set.add("of");
        set.add("Hello");
        set.add("Example");
        set.add("HashSet");
        System.out.println(set);
        /*System.out.println(set.iterator());
        for(String s:set)
        System.out.println(s);*/
    }
    static void linkedsetExample(){
        Set<String> set=new LinkedHashSet<>();
        set.add("Hello");
        set.add("Example");
        set.add("of");
        set.add("Hello");
        set.add("Example");
        set.add("LinkedHashSet");
        System.out.println(set);
        /*System.out.println(set.iterator());
        for(String s:set)
            System.out.println(s);*/
    }

    static void treesetExample(){
        Set<String> set=new TreeSet<>();
        set.add("Hello");
        set.add("Example");
        set.add("of");
        set.add("Hello");
        set.add("Example");
        set.add("TreeSet");
        System.out.println(set);
        /*System.out.println(set.iterator());
        for(String s:set)
            System.out.println(s);*/
    }
    static void arraylistExample(){
        List<String> set=new ArrayList<>();
        set.add("Hello");
        set.add("Example");
        set.add("of");
        set.add("Hello");
        set.add("Example");
        set.add("ArrayList");
        System.out.println(set);
        /*System.out.println(set.iterator());
        for(String s:set)
            System.out.println(s);*/
    }
    static void linkedlistExample(){
        List<String> set=new LinkedList<>();
        set.add("Hello");
        set.add("Example");
        set.add("of");
        set.add("Hello");
        set.add("Example");
        set.add("LinkedList");
        System.out.println(set);
        /*System.out.println(set.iterator());
        for(String s:set)
            System.out.println(s);*/
    }
    static void stackExample(){
        List<String> set=new Stack<>();
        set.add("Hello");
        set.add("Example");
        set.add("of");
        set.add("Hello");
        set.add("Example");
        set.add("Stack");
        System.out.println(set);
        System.out.println(set.get(3));
        /*System.out.println(set.iterator());
        for(String s:set)
            System.out.println(s);*/
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("Set\n1: Hashset 2: LinkedHashset 3: Treeset");
        System.out.println("List\n4: ArrayList 5: LinkedList 6: Stack");
        while (true) {
            int option = s.nextInt();
            if (option == 1)
                hashsetExample();
            else if (option == 2)
                linkedsetExample();
            else if (option == 3)
                treesetExample();
            else if (option==4)
                arraylistExample();
            else if(option==5)
                linkedlistExample();
            else if(option==6)
                stackExample();
            else if (option==909)
                break;
        }
    }
}
