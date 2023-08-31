package Marin;

class Marin extends EtreVivants {

    private int nbNageoire;

    public int getNbNageoire() {
        return nbNageoire;
    }

    protected Marin(int nbNageoire) {
        if(nbNageoire>=2)
            this.nbNageoire = nbNageoire;
    }

    public void nager(){
        System.out.println("Je nage");
    }
}