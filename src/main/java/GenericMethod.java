public class GenericMethod {

    public static <T> void print (T[] list){
        for (T element:list){
            System.out.println(element+ "");
        }
        System.out.println("");
    }

    public void display(){
        Integer [] integers = {12,324,6,7900};
        String[] strings = {"Dog","Cat","Lion","Rat","Elephant"};
        System.out.println("Print an Integers array");
        print(integers);
        System.out.println("Print an String array");
        print(strings);
    }
}
