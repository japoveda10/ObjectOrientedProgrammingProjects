package uniandes.cupi2.cupiPokemonGo.interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uniandes.cupi2.cupiPokemonGo.mundo.TableroCupiPokemonGo;

public class InterfazCupiPokemonGo extends JFrame {
	
	//---------------------------------------------------------------------------------------
	// Constantes
	//---------------------------------------------------------------------------------------
		
	private static final long serialVersionUID = 1L;
	
	//---------------------------------------------------------------------------------------
	// Atributos
	//---------------------------------------------------------------------------------------	

	private TableroCupiPokemonGo mundo;
	
	private PanelImagen panelImagen;

	private PanelInformacionJuego panelInformacionJuego;

	private PanelMapa panelMapa;

	private PanelOpciones panelOpciones;
	
	private PanelControles panelControles;
	
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------

	public InterfazCupiPokemonGo()
	{

		// Construye la forma
		setTitle("Cupi Pokemon Go");
		setSize(775,720);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());


		// Crea el mundo
		mundo = new TableroCupiPokemonGo();


		// Creación de los paneles

		// Panel imagen
		panelImagen = new PanelImagen();
		add(panelImagen, BorderLayout.NORTH);

		// Panel opciones
		panelOpciones = new PanelOpciones(this);
		add(panelOpciones, BorderLayout.SOUTH);

		// Panel informacion juego
		panelInformacionJuego = new PanelInformacionJuego();
		add(panelInformacionJuego, BorderLayout.WEST);

		// Panel mapa
		panelMapa = new PanelMapa();
		add(panelMapa, BorderLayout.CENTER);
		
		// Panel controles
		panelControles = new PanelControles();
		add(panelControles, BorderLayout.EAST);
	}
	
	//---------------------------------------------------------------------------------------
	// Requerimientos funcionales
	//---------------------------------------------------------------------------------------
	
	//---------------------------------------------------------------------------------------
	// Puntos de extension
	//---------------------------------------------------------------------------------------
	
	public void reqFuncOpcion1( )
	{
		String respuesta = mundo.metodo1( );
		JOptionPane.showMessageDialog( this, respuesta, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
	}

	public void reqFuncOpcion2( )
	{
		String respuesta = mundo.metodo2( );
		JOptionPane.showMessageDialog( this, respuesta, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
	}
	
	//---------------------------------------------------------------------------------------
	// Programa principal
	//---------------------------------------------------------------------------------------
	
	public static void main(String[] args)
	{
		System.out.println("CUPI POKEMON GO");
		
		try
		{
			InterfazCupiPokemonGo interfaz = new InterfazCupiPokemonGo();
			interfaz.setVisible(true);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
