package uniandes.cupi2.cupiPokemonGo.mundo;

public class Casilla {

	// ---------------------------------------------------------------------------------------
	// Atributos
	// ---------------------------------------------------------------------------------------

	private boolean vacia;

	private int numeroVisitas;

	// ---------------------------------------------------------------------------------------
	// Constructores
	// ---------------------------------------------------------------------------------------

	public Casilla()
	{
		vacia = true;
		numeroVisitas = 0;
	}

	// ---------------------------------------------------------------------------------------
	// Metodos
	// ---------------------------------------------------------------------------------------

	public boolean getVacia() 
	{
		return vacia;
	}

	public void setVacia(boolean pVacia) 
	{
		vacia = pVacia;
	}

	public int getNumeroVisitas() 
	{
		return numeroVisitas;
	}

	public void setNumeroVisitas(int pNumeroVisitas) {
		numeroVisitas = pNumeroVisitas;
	}
	
	public void aumentarNumeroVisitas()
	{
		numeroVisitas++;
	}

}
