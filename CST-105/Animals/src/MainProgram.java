
public class MainProgram
{
	public static void main(String[] args)
	{
        var bowser = new Dog();
        bowser.Talk();
        bowser.Greet();
        bowser.Sing();
        bowser.Fetch("stick");
        bowser.FeedMe();
        bowser.TouchMe();
        System.out.println();
        System.out.println();

        var red = new Robin();
        red.Talk();
        red.Greet();
        red.Sing();
	}

}
