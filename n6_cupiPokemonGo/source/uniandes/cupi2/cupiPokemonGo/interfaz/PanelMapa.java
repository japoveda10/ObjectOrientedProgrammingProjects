package uniandes.cupi2.cupiPokemonGo.interfaz;

import java.awt.Dimension;

import javax.swing.JPanel;

public class PanelMapa extends JPanel {
	
	//---------------------------------------------------------------------------------------
	// Constantes
	//---------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;
	
	//---------------------------------------------------------------------------------------
	// Atributos
	//---------------------------------------------------------------------------------------
	
	private int numeroFilas;
	
	private int numeroColumnas;
	
	private int[][] tableroCupiPokemonGo;
	
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------
		
	public PanelMapa()
	{
		setPreferredSize(new Dimension (300,300));
		tableroCupiPokemonGo = new int[numeroFilas][numeroColumnas];
	}

}
