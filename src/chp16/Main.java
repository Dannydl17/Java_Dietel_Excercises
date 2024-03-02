package chp16;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add("John");
        list.add(new ArrayList());
        Object element = list.get(2);
        int number = (int)element;
        System.out.println(number);
    }
}
