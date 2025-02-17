package generics;

public class Driver {
    public static void main(String[] args) {
        GenericClassExample<Integer> e1 = new GenericClassExample<>();
        e1.setContainer(555);

        GenericClassExample<String> e2 = new GenericClassExample<>("JACK");


        GenericClassExample<Character> e3 = new GenericClassExample<>('F');


        GenericClassExample<Float> e4 = new GenericClassExample<>(55.90f);


        GenericClassExample<Long> e5 = new GenericClassExample<>(88888888888888888l);

//        System.out.println(e1.getContainer());
//        System.out.println(e2.getContainer());
//        System.out.println(e3.getContainer());
//        System.out.println(e4.getContainer());
//        System.out.println(e5.getContainer());

        Integer b [] = {5,6,0,6,9,2,8,2,3,8};
        String str [] ={"Hello","Everyone ","Good","Morning"};
        Float ft [] = {859f,7842f,6.023f,80.36f};


        GenericMethodExample.printArray(b);
        System.out.println();
        GenericMethodExample.printArray(str);
        System.out.println();
        GenericMethodExample.printArray(ft);






    }
}
