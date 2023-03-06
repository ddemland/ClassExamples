#include "TacoAndDrink.h"

int TacoAndDrink::CalculateCost(int numDrinks, int numTacos)
{
	int totalTacos, totalDrinks;
	totalDrinks = numDrinks * 2;
	totalTacos = numTacos * 3;
	return totalDrinks + totalTacos;
}
