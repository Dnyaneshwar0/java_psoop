class Imagica extends AmusementPark
{
	int num_games=7;
	double cost_adl=1500;
	double cost_chl=1100;
	
	double getCost(int adl, int chl)
	{
		return adl*cost_adl+chl*cost_chl;
	}
}
