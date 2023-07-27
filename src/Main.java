
public class Main {
    public static void main(String[] args) {

        CustomList<Integer> numbers = new CustomArrayList<>();

        for (int i=0; i<=46; i++) {
            numbers.add(i);
        }

        for (int i=0; i<numbers.getSize(); i++) {
            System.out.println(numbers.get(i));
        }

//        System.out.println(numbers.get(100));
    }
}