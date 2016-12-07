package uniandes.cupi2.cupiPokemonGo.interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelImagen extends JPanel {
	
	//---------------------------------------------------------------------------------------
	// Constantes
	//---------------------------------------------------------------------------------------
	
	private static final long serialVersionUID = 1L;
	
	//---------------------------------------------------------------------------------------
	// Atributos
	//---------------------------------------------------------------------------------------
	
	private JLabel etiquetaImagen;
	
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------
	
	public PanelImagen()
	{
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension (0,158));

		// Se inicializan los atributos del panel
		etiquetaImagen = new JLabel();
		ImageIcon icono = new ImageIcon("./data/imagenes/titulo.png");
		etiquetaImagen.setIcon(icono);

		// Se agrega la etiqueta al panel
		add(etiquetaImagen);
	}

}
