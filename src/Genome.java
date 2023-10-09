public class Genome {
    private Gene[] genes;

    public Genome() {
        this.genes = new Gene[Constants.geneAmount];
    }

    public Genome(Genome g1, Genome g2) {
        this.genes = new Gene[Constants.geneAmount];
        for (int i = 0; i < Constants.geneAmount; i++) {

        }
    }
}
