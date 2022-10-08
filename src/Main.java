public class Main {
    public static void main(String[] args) {
        MagicBox<String> MagicBox = new MagicBox<>(5);
        System.out.println(MagicBox.add("один"));
        System.out.println(MagicBox.add("два"));
        System.out.println(MagicBox.add("три"));
        System.out.println(MagicBox.add("четыре"));
        System.out.println(MagicBox.add("пять"));
        System.out.println(MagicBox.add("шесть"));
        System.out.println(MagicBox.pick());
        MagicBox.getBoxItems();

        MagicBox<Integer> MagicBox2 = new MagicBox<>(5);
        System.out.println(MagicBox2.add(1));
        System.out.println(MagicBox2.add(2));
        System.out.println(MagicBox2.add(3));
        System.out.println(MagicBox2.add(4));
        System.out.println(MagicBox2.add(5));
        System.out.println(MagicBox2.add(6));
        System.out.println(MagicBox2.pick());
        MagicBox2.getBoxItems();

        MagicBox<Integer> MagicBox3 = new MagicBox<>(3);
        System.out.println(MagicBox3.add(1));
        MagicBox3.getBoxItems();

        System.out.println(MagicBox3.pick());
        MagicBox<String> MagicBox4 = new MagicBox<>(3);
        System.out.println(MagicBox4.add("один"));
        System.out.println(MagicBox4.add("два"));
        MagicBox4.getBoxItems();
        System.out.println(MagicBox4.pick());
    }
}