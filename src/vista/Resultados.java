package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.Arrays;

import controlador.AdminEventos;


import javax.swing.JDialog;
import javax.swing.JLabel;


public class Resultados extends JDialog {

	private JLabel resultado1, resultado2, resultado3;
	private JLabel resultado4, resultado5;
 
	
	public Resultados() {
		setBounds(100, 100, 300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//evitar que el usuario redimensione la ventana
			setResizable(true);
		//ponemos un título
			setTitle("RESULTADOS");
		//cambiamos el icono de java por otro que queramos	
			setIconImage(Toolkit.getDefaultToolkit().getImage("calculating.png"));
		//para colocar los componentes de forma manual desactivamos el layout
			setLayout(null);
		//función para inicializar los componentes	
			inicializarComponentes();
		//visibilidad de la ventana. esta instrucción SIEMPRE ha de ir la última
			setVisible(false);		
		}
	public void inicializarComponentes() {
		resultado1= new JLabel("Resultados: ");
		resultado1.setBounds(20, 20, 500, 100);
		resultado1.setForeground(new Color(105,105,105));
		add(resultado1);
		
		resultado2= new JLabel(" ");
		resultado2.setBounds(20, 40, 500, 100);
		resultado2.setForeground(new Color(105,105,105));
		add(resultado2);
		
		resultado3= new JLabel(" ");
		resultado3.setBounds(20, 60, 500, 100);
		resultado3.setForeground(new Color(105,105,105));
		add(resultado3);
		
		resultado4= new JLabel(" ");
		resultado4.setBounds(20, 80, 500, 100);
		resultado4.setForeground(new Color(105,105,105));
		add(resultado4);
		
		resultado5= new JLabel(" ");
		resultado5.setBounds(20, 100, 500, 100);
		resultado5.setForeground(new Color(105,105,105));
		add(resultado5);
	}
	public void refrescar() {
		
		 if(AdminEventos.getResultados().size()>=5){
				getResultado1().setText("Resultado: " + AdminEventos.getResultados().get(0));
				getResultado2().setText("Resultado: " + AdminEventos.getResultados().get(1));
				getResultado3().setText("Resultado: " + AdminEventos.getResultados().get(2));
				getResultado4().setText("Resultado: " + AdminEventos.getResultados().get(3));
				getResultado5().setText("Resultado: " + AdminEventos.getResultados().get(4));
		 }else if(AdminEventos.getResultados().size()>=4){
				getResultado1().setText("Resultado: " + AdminEventos.getResultados().get(0));
				getResultado2().setText("Resultado: " + AdminEventos.getResultados().get(1));
				getResultado3().setText("Resultado: " + AdminEventos.getResultados().get(2));
				getResultado4().setText("Resultado: " + AdminEventos.getResultados().get(3));
			}else if(AdminEventos.getResultados().size()>=3){
				getResultado1().setText("Resultado: " + AdminEventos.getResultados().get(0));
				getResultado2().setText("Resultado: " + AdminEventos.getResultados().get(1));
				getResultado3().setText("Resultado: " + AdminEventos.getResultados().get(2));
			}else if(AdminEventos.getResultados().size()>=2) {
				getResultado1().setText("Resultado: " + AdminEventos.getResultados().get(0));
				getResultado2().setText("Resultado: " + AdminEventos.getResultados().get(1));
			}else if(AdminEventos.getResultados().size()>=1) {
				getResultado1().setText("Resultado: " + AdminEventos.getResultados().get(0));
			}if(AdminEventos.getResultados().isEmpty()) {
				
			}
		
		
	}
	public JLabel getResultado2() {
		return resultado2;
	}
	public JLabel getResultado1() {
		return resultado1;
	}
	public JLabel getResultado3() {
		return resultado3;
	}
	public JLabel getResultado4() {
		return resultado4;
	}
	public JLabel getResultado5() {
		return resultado5;
	}
	
	
	
	}


