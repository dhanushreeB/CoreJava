import java.util.ArrayList;

public class Collections2 {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> al = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            al.add(i);
            // method used from collection interface
        }
        System.out.println(al);
        // method used from list interface
        al.remove(2);
        System.out.println(al);
        al.add(2, 27);
        System.out.println(al);
        al.set(2, 5);
        System.out.println(al);
        al.indexOf(4);
        System.out.println(al);

        System.out.println(al.lastIndexOf(4));

        System.out.println(al.get(2));
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.contains(10));
    }
}
