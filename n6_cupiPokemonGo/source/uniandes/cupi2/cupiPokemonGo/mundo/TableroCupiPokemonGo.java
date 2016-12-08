package uniandes.cupi2.cupiPokemonGo.mundo;

import java.util.Properties;

public class TableroCupiPokemonGo {
	
	//---------------------------------------------------------------------------------------
	// Constantes
	//---------------------------------------------------------------------------------------
	
	private final static int CASILLA_LIBRE = 0;
	
	private final static int CASILLA_OBSTACULO = 1;
		
	private final static int POKEBOLA = 2;
	
	private final static int POKEMON_1 = 3;
	
	private final static int POKEMON_2 = 4;
	
	private final static int POKEMON_3 = 5;
	
	private final static int CUPI_JUGADOR = 6;

	
	//---------------------------------------------------------------------------------------
	// Atributos
	//---------------------------------------------------------------------------------------
	
	private boolean juegoCargado;
	
	private int numeroFilas;
	
	private int numeroColumnas;
	
	private Casilla[][] tableroCupiPokemonGo;
	
	private Casilla[][] original;
	
	private CupiJugador cupiJugador;
	
	private int numeroMovimientos;
	
	private int posicionInicialX;
	
	private int posicionInicialY;
		
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------
	
	public TableroCupiPokemonGo()
	{
		juegoCargado = false;
		numeroFilas = 0;
		numeroColumnas = 0;
		numeroMovimientos = 0;
		posicionInicialX = 0;
		posicionInicialY = 0;
	}
	
	//---------------------------------------------------------------------------------------
	// Metodos
	//---------------------------------------------------------------------------------------
	
	public void cargarTableroCupiPokemonGo(Properties pPropiedades) throws Exception
	{
		try 
		{ 
			String numFilas = pPropiedades.getProperty("mapa.tamanho");
			numeroFilas = Integer.parseInt(numFilas);


			String numColumnas = pPropiedades.getProperty("mapa.tamanho");
			numeroColumnas = Integer.parseInt(numColumnas);     

			tableroCupiPokemonGo = new Casilla[numeroFilas][numeroColumnas];
			original = new Casilla[numeroFilas][numeroColumnas];
			
			String numMovimientos = pPropiedades.getProperty("mapa.movimientos");
			numeroMovimientos = Integer.parseInt(numMovimientos); 
			
			for(int i=0; i<numeroFilas; i++)
			{
				String variable = pPropiedades.getProperty("mapa.fila"+i);
				
				for(int j=0; j<numeroColumnas; j++)
				{
					String variablen = "" + variable.charAt(j);
					
					int actual = Integer.parseInt(variablen);
					
					if(actual == CUPI_JUGADOR)
					{
						posicionInicialX = i;
						posicionInicialY = j;
						tableroCupiPokemonGo[i][j] = new Casilla(actual);
						original[i][j] = new Casilla(actual);
						original[i][j].aumentarNumeroVisitas();
						tableroCupiPokemonGo[i][j].aumentarNumeroVisitas();
					}
					else
					{
						tableroCupiPokemonGo[i][j] = new Casilla(actual);
						original[i][j] = new Casilla(actual);
					}
					

					cupiJugador = new CupiJugador(posicionInicialX, posicionInicialY, numeroMovimientos);
				}
			}
			
			juegoCargado = true;

		} 
		catch(Exception e) 
		{ 
			//Lanzamiento de posibles excepciones producidas al cargar el archivo properties. 
			e.printStackTrace();
			throw new Exception("Error, las propiedades tienen un formato inválido." );  
		} 
	}
	
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
	
	public Casilla[][] getTableroCupiPokemonGo()
	{
		return tableroCupiPokemonGo;
	}
	
	public CupiJugador getCupiJugador()
	{
		return cupiJugador;
	}
	
	public void setCupiJugador(CupiJugador pCupiJugador)
	{
		cupiJugador = pCupiJugador;
	}
	
	public int getNumeroMovimientos()
	{
		return numeroMovimientos;
	}
	
	public void setNumeroMovimientos(int pNumeroMovimientos)
	{
		numeroMovimientos = pNumeroMovimientos;
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
