package uniandes.cupi2.cupiPokemonGo.interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelControles extends JPanel {
	
	//---------------------------------------------------------------------------------------
	// Constantes
	//---------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;
	
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------
	
	public PanelControles()
	{
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension (80,150));
		TitledBorder border = BorderFactory.createTitledBorder("Controles");
		setBorder(border);
	}

}
