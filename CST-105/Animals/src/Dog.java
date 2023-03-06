
public class Dog extends Animal
{
    public Dog()
    {
    	System.out.println("Dog Constructor");
    }

    @Override
    public void Talk()
    {
    	System.out.println("Bark Bark Bark");
    }

    public void Fetch(String thing)
    {
    	System.out.printf("Oh boy, Here is your %s. Let's do it again.\n", thing);
    }

    @Override
    public  void Sing()
    {
    	System.out.println("Hooooooooo");
    }

    public void TouchMe()
    {
    	System.out.println("Please scratch behind my ears.");
    }

    public void FeedMe()
    {
    	System.out.println("It's suppertime. The very best time of the day!!!");
    }
}
