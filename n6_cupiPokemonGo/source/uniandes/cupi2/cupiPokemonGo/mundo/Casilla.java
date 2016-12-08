package uniandes.cupi2.cupiPokemonGo.mundo;

public class Casilla {

	// ---------------------------------------------------------------------------------------
	// Atributos
	// ---------------------------------------------------------------------------------------

	private int tipoCasilla;

	private int numeroVisitas;
	
	private String pokemon;

	// ---------------------------------------------------------------------------------------
	// Constructores
	// ---------------------------------------------------------------------------------------

	public Casilla(int pTipoCasilla)
	{
		tipoCasilla = pTipoCasilla;
		numeroVisitas = 0;
		pokemon = "";
	}

	// ---------------------------------------------------------------------------------------
	// Metodos
	// ---------------------------------------------------------------------------------------

	public int getTipoCasilla()
	{
		return tipoCasilla;
	}

	public void setTipoCasilla(int pTipoCasilla)
	{
		tipoCasilla = pTipoCasilla;
	}

	public int getNumeroVisitas() 
	{
		return numeroVisitas;
	}

	public void setNumeroVisitas(int pNumeroVisitas) 
	{
		numeroVisitas = pNumeroVisitas;
	}
	
	public void aumentarNumeroVisitas()
	{
		numeroVisitas++;
	}
	
	public String getPokemon()
	{
		return pokemon;
	}
	
	public void setPokemon(String pPokemon)
	{
		pokemon = pPokemon;
	}

}
