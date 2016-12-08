package uniandes.cupi2.cupiPokemonGo.interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelControles extends JPanel {
	
	//---------------------------------------------------------------------------------------
	// Constantes
	//---------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;
	
	private JLabel etiqueta1;
	
	private JLabel etiqueta2;
	
	private JLabel etiqueta3;
	
	private JLabel etiqueta4;
	
	private JLabel etiqueta5;
	
	private JLabel etiqueta6;
	
    private JLabel etiqueta7;
	
	private JLabel etiqueta8;
	
	private JLabel etiqueta9;
	
	private JPanel panel;
	
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------
	
	public PanelControles()
	{
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension (80,150));
		TitledBorder border = BorderFactory.createTitledBorder("Controles");
		setBorder(border);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		
		etiqueta1 = new JLabel();
		ImageIcon iconoEtiqueta1 = new ImageIcon("./data/imagenes/noroeste.png");
		etiqueta1.setIcon(iconoEtiqueta1);
		panel.add(etiqueta1);
		
		etiqueta2 = new JLabel();
		ImageIcon iconoEtiqueta2 = new ImageIcon("./data/imagenes/norte.png");
		etiqueta2.setIcon(iconoEtiqueta2);
		panel.add(etiqueta2);
		
		etiqueta3 = new JLabel();
		ImageIcon iconoEtiqueta3 = new ImageIcon("./data/imagenes/noreste.png");
		etiqueta3.setIcon(iconoEtiqueta3);
		panel.add(etiqueta3);
		
		etiqueta4 = new JLabel();
		ImageIcon iconoEtiqueta4 = new ImageIcon("./data/imagenes/oeste.png");
		etiqueta4.setIcon(iconoEtiqueta4);
		panel.add(etiqueta4);
		
		etiqueta5 = new JLabel();
		panel.add(etiqueta5);
		
		etiqueta6 = new JLabel();
		ImageIcon iconoEtiqueta6 = new ImageIcon("./data/imagenes/este.png");
		etiqueta1.setIcon(iconoEtiqueta6);
		panel.add(etiqueta6);
		
		etiqueta7 = new JLabel();
		ImageIcon iconoEtiqueta7 = new ImageIcon("./data/imagenes/suroeste.png");
		etiqueta7.setIcon(iconoEtiqueta7);
		panel.add(etiqueta7);
		
		etiqueta8 = new JLabel();
		ImageIcon iconoEtiqueta8 = new ImageIcon("./data/imagenes/sur.png");
		etiqueta8.setIcon(iconoEtiqueta8);
		panel.add(etiqueta8);
		
		etiqueta9 = new JLabel();
		ImageIcon iconoEtiqueta9 = new ImageIcon("./data/imagenes/sureste.png");
		etiqueta9.setIcon(iconoEtiqueta9);
		panel.add(etiqueta9);
		
		add(panel, BorderLayout.CENTER);
	}

}
