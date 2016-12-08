package uniandes.cupi2.cupiPokemonGo.interfaz;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMapa extends JPanel {
	
	//---------------------------------------------------------------------------------------
	// Constantes
	//---------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;
	
	//---------------------------------------------------------------------------------------
	// Atributos
	//---------------------------------------------------------------------------------------
	
	private InterfazCupiPokemonGo principal;
	
	//---------------------------------------------------------------------------------------
	// Atributos de la interfaz
	//---------------------------------------------------------------------------------------
	
	private int numeroFilas;
	
	private int numeroColumnas;
	
	private JLabel[][] tableroCupiPokemonGo;
	
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------
		
	public PanelMapa(InterfazCupiPokemonGo pPrincipal, int pNumeroFilas, int pNumeroColumnas)
	{
		principal = pPrincipal;
		numeroFilas = pNumeroFilas;
		numeroColumnas = pNumeroColumnas;
		setLayout(new GridLayout(3,3));
		tableroCupiPokemonGo = new JLabel[numeroFilas][numeroColumnas];
		
		for(int i=0; i<numeroFilas; i++)
		{
			for(int j=0; j<numeroColumnas; j++)
			{
				if(principal.getMundo().getTableroCupiPokemonGo()[i][j].getTipoCasilla() == 0)
				{
					tableroCupiPokemonGo[i][j] = new JLabel(new ImageIcon("data/imagenes/casillaVacia.png"));
					add(tableroCupiPokemonGo[i][j]);
				}
				else if(principal.getMundo().getTableroCupiPokemonGo()[i][j].getTipoCasilla() == 1)
				{
					tableroCupiPokemonGo[i][j] = new JLabel(new ImageIcon("data/imagenes/casillaObstaculo.png"));
					add(tableroCupiPokemonGo[i][j]);
				}
				else if(principal.getMundo().getTableroCupiPokemonGo()[i][j].getTipoCasilla() == 2)
				{
					tableroCupiPokemonGo[i][j] = new JLabel(new ImageIcon("data/imagenes/pokeball.png"));
					add(tableroCupiPokemonGo[i][j]);
				}
				else if(principal.getMundo().getTableroCupiPokemonGo()[i][j].getTipoCasilla() == 6)
				{
					tableroCupiPokemonGo[i][j] = new JLabel(new ImageIcon("data/imagenes/casillaJugador.png"));
					add(tableroCupiPokemonGo[i][j]);
				}
			}
		}
	}

}
