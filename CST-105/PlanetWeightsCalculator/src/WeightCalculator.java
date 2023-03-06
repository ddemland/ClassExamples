
public class WeightCalculator
{
	final double SunGravFactor = 27.9F;
	final double MercuryGravFactor = 0.38F;
	final double VenusGravFactor = 0.91F;
	final double EarthGravFactor = 1.0F;
	final double MoonGravFactor = 0.17F;
	final double MarsGravFactor = 0.38F;
	final double JupiterGravFactor = 2.54F;
	final double SaturnGravFactor = 1.08F;
	final double UranusGravFactor = 0.91F;
	final double NeptuneGravFactor = 1.19F;
	final double PlutoGravFactor = 0.06F;
	
	private double Weight;
	
	public WeightCalculator(double weight)
	{
		Weight = weight;
	}
	
	public double OnSun()
	{
		return Weight * SunGravFactor;
	}

	public double OnMercury()
	{
		return Weight * MercuryGravFactor;
	}

	public double OnVenus()
	{
		return Weight * VenusGravFactor;
	}

	public double OnEarth()
	{
		return Weight * EarthGravFactor;
	}

	public double OnMoon()
	{
		return Weight * MoonGravFactor;
	}

	public double OnMars()
	{
		return Weight * MarsGravFactor;
	}

	public double OnJupiter()
	{
		return Weight * JupiterGravFactor;
	}

	public double OnSaturn()
	{
		return Weight * SaturnGravFactor;
	}

	public double OnUranus()
	{
		return Weight * UranusGravFactor;
	}

	public double OnNeptune()
	{
		return Weight * NeptuneGravFactor;
	}

	public double OnPluto()
	{
		return Weight * PlutoGravFactor;
	}

}
