package uniandes.cupi2.cupiPokemonGo.mundo;

public class TableroCupiPokemonGo {
	
	//---------------------------------------------------------------------------------------
	// Atributos
	//---------------------------------------------------------------------------------------
	
	private boolean juegoCargado;
	
	private int numeroFilas;
	
	private int numeroColumnas;
	
	private Casilla[][] casillas;
	
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------
	
	public TableroCupiPokemonGo()
	{
		juegoCargado = false;
		numeroFilas = 0;
		numeroColumnas = 0;
		casillas = new Casilla [numeroFilas][numeroColumnas];
	}
	
	//---------------------------------------------------------------------------------------
	// Metodos
	//---------------------------------------------------------------------------------------
	
	public boolean getJuegoCargado()
	{
		return juegoCargado;
	}
	
	public void setJuegoCargado(boolean pJuegoCargado)
	{
		juegoCargado = pJuegoCargado;
	}
	
	public int getNumeroFilas()
	{
		return numeroFilas;
	}
	
	public void setNumeroFilas(int pNumeroFilas)
	{
		numeroFilas = pNumeroFilas;
	}
	
	public int getNumeroColumnas()
	{
		return numeroColumnas;
	}
	
	public void setNumeroColumnas(int pNumeroColumnas)
	{
		numeroColumnas = pNumeroColumnas;
	}
	
	//---------------------------------------------------------------------------------------
	// Puntos de extension
	//---------------------------------------------------------------------------------------
	
	public String metodo1( )
	{
		return "Respuesta 1";
	}

	public String metodo2( )
	{
		return "Respuesta 2";
	}

}
