import java.util.Random;

public class Constants {
    public static int width = 0, height = 0, amoebaAmount = 0, geneAmount = 0;
    public static byte innerNeuronAmount = 0;
    public static Random random = new Random();
    public static float mutationChance = Constants.random.nextFloat();
}
