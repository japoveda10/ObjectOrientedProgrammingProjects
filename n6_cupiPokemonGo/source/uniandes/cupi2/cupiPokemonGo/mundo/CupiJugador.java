package uniandes.cupi2.cupiPokemonGo.mundo;

public class CupiJugador {
	
	//---------------------------------------------------------------------------------------
	// Atributos
	//---------------------------------------------------------------------------------------
	
	private int posicionX;
	
	private int posicionY;
	
	private int numeroMovimientos;
	
	private int numeroPokemonesCapturados;
	
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------
	
	public CupiJugador(int pPosicionX, int pPosicionY, int pNumeroMovimientos)
	{
		posicionX = pPosicionX;
		posicionY = pPosicionY;
		numeroMovimientos = pNumeroMovimientos;
		numeroPokemonesCapturados = 0;
	}
	
	//---------------------------------------------------------------------------------------
	// Metodos
	//---------------------------------------------------------------------------------------
	
	public int getPosicionX()
	{
		return posicionX;
	}
	
	public void setPosicionX(int pPosicionX)
	{
		posicionX = pPosicionX;
	}
	
	public int getPosicionY()
	{
		return posicionY;
	}
	
	public void setPosicionY(int pPosicionY)
	{
		posicionY = pPosicionY;
	}
	
	public int getNumeroMovimientos()
	{
		return numeroMovimientos;
	}
	
	public void setNumeroMovimientos(int pNumeroMovimientos)
	{
		numeroMovimientos = pNumeroMovimientos;
	}
	
	public int getNumeroPokemonesCapturados()
	{
		return numeroPokemonesCapturados;
	}
	
	public void setNumeroPokemonesCapturados(int pNumeroPokemonesCapturados)
	{
		numeroPokemonesCapturados = pNumeroPokemonesCapturados;
	}
	
	public void aumentarNumeroPokemonesCapturados()
	{
		numeroPokemonesCapturados++;
	}
	
	public void aumentarNumeroMovimientos(int pNumeroMovimientos)
	{
		numeroMovimientos += pNumeroMovimientos;
	}
	
	public void disminuirNumeroMovimientos()
	{
		numeroMovimientos--;
	}
	
	public void reiniciar(int pPosicionX, int pPosicionY, int pNumeroMovimientos)
	{
		posicionX = pPosicionX;
		posicionY = pPosicionY;
		numeroMovimientos = pNumeroMovimientos;
		numeroPokemonesCapturados = 0;
	}
	
	public void moverCupiJugador(int pPosicionX, int pPosicionY)
	{
		posicionX += pPosicionX;
		posicionY += pPosicionY;
		numeroMovimientos--;
	}

}
