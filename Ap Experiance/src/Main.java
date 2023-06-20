public class Main
{
    public static void main(String[] args)
    {
        Network.solvePosition("input.txt").forEach(Network.animateImage());
        new MyFrame();
    }
}
