public class MainProgram {
    public static void main(String[] args) {


        GenericMethod genericMethod = new GenericMethod();
        genericMethod.display();



        GenericsClass<Integer> q = new GenericsClass<>();
        q.setT(1000);
        q.getT();

        GenericsClass<String> integerInstance = new GenericsClass<>();
        integerInstance.setT("Umuzi");
        integerInstance.getT();

        System.out.println(q.getT()+"\n"+integerInstance.getT());
    }


}
