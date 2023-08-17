import java.util.*;
public class Yum {
    public static void main(String[] args) {
        Set<Integer> s1 =  new TreeSet<>();
        s1.add(1);
        s1.add(4);
        s1.add(1);
        s1.add(-2);

        Set<Integer> s2 = method(s1);
        System.out.println(s1);
        System.out.println(s2);

        s2 = method(s1);
        System.out.println(s1);
        System.out.println(s2);
    }

    public static Set<Integer> method(Set<Integer> s) {
        Set<Integer> newSet = new TreeSet<>();
        for (int i = 0; i < s.size(); i++) {
            if (s.contains(i)) {
                s.add(i-1);
                newSet.add(i);
            }
        }
        s = new TreeSet<>();
        return newSet;
    }
}
