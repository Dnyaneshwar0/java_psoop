class EsselWorld extends AmusementPark
{
	int num_games=5;
	double cost_adl=1050;
	double cost_chl=660;
	
	double getCost(int adl, int chl)
	{
		return adl*cost_adl+chl*cost_chl;
	}
}
