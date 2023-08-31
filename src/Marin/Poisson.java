package Marin;

public class Poisson extends Marin implements Ovipare{
    public Poisson(int nbNageoire) {
        super(nbNageoire);
    }

    @Override
    public void pondre() {
        System.out.println("je ponds");
    }
}