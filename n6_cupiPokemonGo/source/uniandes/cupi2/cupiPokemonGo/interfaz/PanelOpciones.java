package uniandes.cupi2.cupiPokemonGo.interfaz;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOpciones extends JPanel implements ActionListener {

	//---------------------------------------------------------------------------------------
	// Constantes
	//---------------------------------------------------------------------------------------
	
	private static final long serialVersionUID = 1L;

	public final static String CARGAR = "Cargar";
	
	public final static String REINICIAR = "Reiniciar";
	
	public final static String CASILLA_MAS_VISITADA = "Casilla mas visitada";
	
	public final static String OPCION_1 = "Opcion 1";
	
	public final static String OPCION_2 = "Opcion 2";
	
	//---------------------------------------------------------------------------------------
	// Atributos
	//---------------------------------------------------------------------------------------
	
	private InterfazCupiPokemonGo ventana;
	
	//---------------------------------------------------------------------------------------
	// Atributos de la interfaz
	//---------------------------------------------------------------------------------------
	
	private JButton butCargar;
	
	private JButton butReiniciar;
	
	private JButton butCasillaMasVisitada;
	
	private JButton butOpcion1;
	
	private JButton butOpcion2;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	public PanelOpciones(InterfazCupiPokemonGo ventanaP)
	{
		ventana=ventanaP;

		setLayout(new GridLayout (2,4));
		setPreferredSize(new Dimension (0,80));
		TitledBorder border=BorderFactory.createTitledBorder("Opciones");
		setBorder(border);

		butCargar = new JButton("Cargar");
		butReiniciar = new JButton("Reiniciar");
		butCasillaMasVisitada = new JButton("Casilla mas visitada");
		butOpcion1 = new JButton("Opción 1");
		butOpcion2 = new JButton("Opción 2");

		butCargar.setActionCommand(CARGAR);
		butReiniciar.setActionCommand(REINICIAR);
		butCasillaMasVisitada.setActionCommand(CASILLA_MAS_VISITADA);
		butOpcion1.setActionCommand(OPCION_1);
		butOpcion2.setActionCommand(OPCION_2);

		butCargar.addActionListener(this);
		butReiniciar.addActionListener(this);
		butCasillaMasVisitada.addActionListener(this);
		butOpcion1.addActionListener(this);
		butOpcion2.addActionListener(this);

		add(butCargar);
		add(butReiniciar);
		add(butCasillaMasVisitada);
		add(butOpcion1);
		add(butOpcion2);
	}

	// -----------------------------------------------------------------
	// Métodos
	// -----------------------------------------------------------------

	public void actionPerformed(ActionEvent evento) {
		
		String comando = evento.getActionCommand();
		
		if (comando.equals(CARGAR)) 
		{
			//ventana.cargar();
		} 
		else if (comando.equals(REINICIAR)) 
		{
			//ventana.reiniciar();
		}
		else if (comando.equals(CASILLA_MAS_VISITADA))
		{
			//ventana.getCasillaMasVisitada();
		}
	    else if (comando.equals(OPCION_1)) 
	    {
			ventana.reqFuncOpcion1();
		}
	    else if (comando.equals(OPCION_2)) 
	    {
			ventana.reqFuncOpcion2();
		}
	}

}
