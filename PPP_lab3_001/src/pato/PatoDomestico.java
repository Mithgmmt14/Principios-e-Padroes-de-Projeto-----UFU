package pato;

public class PatoDomestico implements Pato {

    @Override
    public void voar() {
        System.out.println("Pato voando...");
    }

    @Override
    public void grasnar() {
        System.out.println("Quack Quack");
    }
}
