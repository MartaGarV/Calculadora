package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import controlador.AdminEventos;



public class Calculadora extends JFrame {

	//los componentes de la ventana son las variables de la clase
			//hay que referenciarlas al principio y son globales
			private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, logo;
			private JTextField cajaTexto1, cajaTexto2;
			private JButton sumar, restar, multiplicar, dividir,r_cuadrada,r_cubica;
			
			//creamos el constructor sin parámetros
			public Calculadora() {
				//Métodos
				//le damos un tamaño
				setSize(350, 460);
			//ubicación en pantalla por medio de coordenadas
			//con este método en particular, centramos la ventana
				setLocationRelativeTo(null);
			//comportamiento de la ventana al cerrar
				setDefaultCloseOperation(EXIT_ON_CLOSE);
			//evitar que el usuario redimensione la ventana
				setResizable(false);
			//ponemos un título
				setTitle("CALCULADORA");
			//cambiamos el icono de java por otro que queramos	
				setIconImage(Toolkit.getDefaultToolkit().getImage("calculating.png"));
			//para colocar los componentes de forma manual desactivamos el layout
				setLayout(null);
			//función para inicializar los componentes	
				inicializarComponentes();
			//visibilidad de la ventana. esta instrucción SIEMPRE ha de ir la última
				setVisible(true);			
			}
		
			//creamos, damos tamaño, ubicación en pantalla y añadimos los componentes
			//todos los componentes son propiedades de la clase
			private void inicializarComponentes() {
				//añado un color background
				getContentPane().setBackground(new Color(135,206,250));

				Image img = new ImageIcon("sings.png").getImage();
				logo = new JLabel(new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
				logo.setBounds(130,5,80,80);
				add(logo);
			
				try {
					Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("DS-DIGII.TTF"));
					
					cajaTexto1 = new JTextField();
					cajaTexto1.setBounds(160, 100, 90, 30);
					cajaTexto1.setFont(font.deriveFont(Font.BOLD, 20f));
					cajaTexto1.setForeground(new Color(105,105,105));
					//le quito los bordes
					cajaTexto1.setBorder(null);
					add(cajaTexto1);
					
					cajaTexto2 = new JTextField();
					cajaTexto2.setBounds(160, 150, 90, 30);
					cajaTexto2.setFont(font.deriveFont(Font.BOLD, 20f));
					cajaTexto2.setForeground(new Color(105,105,105));
					//le quito los bordes
					cajaTexto2.setBorder(null);
					add(cajaTexto2);
					
				} catch (FontFormatException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				
				
				etiqueta1= new JLabel("NÚMERO 1 :");
				etiqueta1.setBounds(90, 100, 70, 30);
				etiqueta1.setForeground(new Color(105,105,105));
				add(etiqueta1);
				
				etiqueta2= new JLabel("NÚMERO 2 :");
				etiqueta2.setBounds(90, 150, 70, 30);
				etiqueta2.setForeground(new Color(105,105,105));
				add(etiqueta2);
								
				sumar= new JButton("");
				sumar.setBounds(110, 220, 45,45);
				sumar.setIcon(new ImageIcon("plus-box.png"));
				sumar.setBorder(new MatteBorder(null));
				add(sumar);
				sumar.addActionListener(new AdminEventos(this));
				
				multiplicar= new JButton("");
				multiplicar.setBounds(110, 270, 45,45);
				multiplicar.setIcon(new ImageIcon("multiplication-box.png"));
				multiplicar.setBorder(new MatteBorder(null));
				add(multiplicar);
				multiplicar.addActionListener(new AdminEventos(this));
				
				restar= new JButton("");
				restar.setBounds(180, 220, 45, 45);
				restar.setIcon(new ImageIcon("minus-box.png"));
				restar.setBorder(new MatteBorder(null));
				add(restar);
				restar.addActionListener(new AdminEventos(this));
				
				dividir= new JButton("");
				dividir.setBounds(180, 270, 45,45);
				dividir.setIcon(new ImageIcon("division-box.png"));
				dividir.setBorder(new MatteBorder(null));
				add(dividir);
				dividir.addActionListener(new AdminEventos(this));
				
				r_cuadrada= new JButton("");
				r_cuadrada.setBounds(250, 220, 45, 45);
				r_cuadrada.setIcon(new ImageIcon("square-root.png"));
				r_cuadrada.setBorder(new MatteBorder(null));
				add(r_cuadrada);
				r_cuadrada.addActionListener(new AdminEventos(this));
				
				r_cubica= new JButton("");
				r_cubica.setBounds(250, 270, 45,45);
				r_cubica.setIcon(new ImageIcon("cube.png"));
				r_cubica.setBorder(new MatteBorder(null));
				add(r_cubica);
				r_cubica.addActionListener(new AdminEventos(this));
				
				etiqueta3= new JLabel("RESULTADO :");
				etiqueta3.setBounds(90, 340, 150, 30);
				etiqueta3.setForeground(new Color(105,105,105));
				etiqueta3.setFont(new Font("Dialog", Font.BOLD,15));
				add(etiqueta3);
				
				etiqueta4= new JLabel("");
				etiqueta4.setBounds(60, 370, 200, 30);
				etiqueta4.setForeground(new Color(255,20,147));
				etiqueta4.setFont(new Font("Dialog", Font.BOLD,15));
				add(etiqueta4);
				
			}

			

			//Creo los getter de los botones
			public JButton getSumar() {
				return sumar;
			}
			
			public JButton getRestar() {
				return restar;
			}

			public JButton getMultiplicar() {
				return multiplicar;
			}

			public JButton getDividir() {
				return dividir;
			}
			
			public JButton getR_cuadrada() {
				return r_cuadrada;
			}

			public JButton getR_cubica() {
				return r_cubica;
			}
			//Los getter de las cajas de texto
			public JTextField getCajaTexto1() {
				return cajaTexto1;
			}

			public JTextField getCajaTexto2() {
				return cajaTexto2;
			}
			
			//Y el get de la etiqueta 3, que contiene el resultado
			public JLabel getEtiqueta4() {
				return etiqueta4;
			}

}


