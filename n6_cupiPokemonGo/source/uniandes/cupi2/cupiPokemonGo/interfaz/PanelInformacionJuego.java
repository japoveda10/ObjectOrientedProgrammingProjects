package uniandes.cupi2.cupiPokemonGo.interfaz;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelInformacionJuego extends JPanel {
	
	//---------------------------------------------------------------------------------------
	// Constantes
	//---------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;
	
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------

	public PanelInformacionJuego() 
	{
		setPreferredSize(new Dimension (80,150));
		TitledBorder border = BorderFactory.createTitledBorder("Informacion");
		setBorder(border);
	}
}
