import java.util.ArrayList;

public class alcore {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,24);
        list.add(1,13);
        list.add(2,24);
        System.out.println(list);
        System.out.println(list.set(2,15));
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}
