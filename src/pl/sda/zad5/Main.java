package pl.sda.zad5;

public class Main {

    public static void main(String[] args) {

        SDAHashSet<String> myHashSet = new SDAHashSet<>();

        myHashSet.add("Element1");
        myHashSet.add("Element2");
        myHashSet.add("Element3");
        myHashSet.add("Element4");
        myHashSet.add("Element5");
        myHashSet.add("Element6");

        System.out.println(myHashSet.add("Element1"));
        System.out.println(myHashSet.remove("Element2"));
        System.out.println(myHashSet.contains("Element3"));
        System.out.println(myHashSet.contains("Element10"));
        System.out.println(myHashSet.add("Element2"));
        System.out.println(myHashSet.size());
        myHashSet.clear();
        System.out.println(myHashSet.size());
    }
}
