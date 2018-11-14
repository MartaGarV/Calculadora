package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import controlador.AdminEventos;



public class Calculadora extends JFrame {

	//los componentes de la ventana son las variables de la clase
			//hay que referenciarlas al principio y son globales
	        private JDialog ventanaSecundaria;
			private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, logo;
			private JTextField cajaTexto1, cajaTexto2;

			private JButton sumar, restar, multiplicar, dividir,r_cuadrada,r_cubica, historial, teclado;
			private JRadioButton modoNormal,modoAccesibilidad;
			private ButtonGroup grupo;
			
			//creamos el constructor sin parámetros
			public Calculadora() {
				//Métodos
				//le damos un tamaño
				setSize(400, 580);
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
				setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
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
				getContentPane().setBackground(new Color(178, 235, 242));

				Image img = new ImageIcon("logo.png").getImage();
				logo = new JLabel(new ImageIcon(img.getScaledInstance(60, 60, Image.SCALE_SMOOTH)));
				logo.setBounds(290,15,80,80);
				add(logo);
			
				try {
					Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("H.H. Samuel-font-defharo.ttf"));
					
					cajaTexto1 = new JTextField();
					
					cajaTexto1.setBounds(70, 110, 260, 40);
					cajaTexto1.setFont(font.deriveFont(Font.PLAIN, 25f));
					cajaTexto1.setForeground(new Color(189, 189, 189));
					TextPrompt placeholder = new TextPrompt("Número 1", cajaTexto1);
					placeholder.changeAlpha(0.75f);
					placeholder.changeStyle(Font.ITALIC);
					//le quito los bordes
					cajaTexto1.setBorder(null);
					add(cajaTexto1);
					
					cajaTexto2 = new JTextField();
					cajaTexto2.setBounds(70, 170, 260, 40);
					cajaTexto2.setFont(font.deriveFont(Font.PLAIN, 25f));
					cajaTexto2.setForeground(new Color(0, 151, 167));
					TextPrompt placeholder1 = new TextPrompt("Número 2", cajaTexto2);
					placeholder.changeAlpha(0.75f);
					placeholder.changeStyle(Font.ITALIC);
					//le quito los bordes
					cajaTexto2.setBorder(null);
					add(cajaTexto2);
					
					etiqueta1= new JLabel("CALCULADORA");
					etiqueta1.setBounds(70, 35, 230, 40);
					etiqueta1.setFont(font.deriveFont(Font.BOLD, 45f));
					etiqueta1.setForeground(new Color(105,105,105));
					add(etiqueta1);
					
					etiqueta4= new JLabel("");
					etiqueta4.setBounds(95, 430, 200, 30);
					etiqueta4.setHorizontalAlignment(SwingConstants.CENTER);
					etiqueta4.setForeground(new Color(117, 117, 117));
					etiqueta4.setFont(font.deriveFont(Font.BOLD, 35f));
					add(etiqueta4);
					
					etiqueta2= new JLabel("=");
					etiqueta2.setBounds(90, 430, 200, 30);
					etiqueta2.setForeground(new Color(117, 117, 117));
					etiqueta2.setFont(font.deriveFont(Font.BOLD, 35f));
					add(etiqueta2);
					
					
				} catch (FontFormatException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
								
				sumar= new JButton("");
				sumar.setBounds(60, 240, 100, 80);
				sumar.setIcon(new ImageIcon("mas.png"));
				sumar.setBorder(new MatteBorder(null));
				add(sumar);
				sumar.addActionListener(new AdminEventos(this));
				
				multiplicar= new JButton("");
				multiplicar.setBounds(60, 320, 100, 80);
				multiplicar.setIcon(new ImageIcon("por.png"));
				multiplicar.setBorder(new MatteBorder(null));
				add(multiplicar);
				multiplicar.addActionListener(new AdminEventos(this));
				
				restar= new JButton("");
				restar.setBounds(155, 240, 100, 80);
				restar.setIcon(new ImageIcon("menos.png"));
				restar.setBorder(new MatteBorder(null));
				add(restar);
				restar.addActionListener(new AdminEventos(this));
				
				dividir= new JButton("");
				dividir.setBounds(155, 320, 100, 80);
				dividir.setIcon(new ImageIcon("entre.png"));
				dividir.setBorder(new MatteBorder(null));
				add(dividir);
				dividir.addActionListener(new AdminEventos(this));
				
				r_cuadrada= new JButton("");
				r_cuadrada.setBounds(250, 240, 100, 80);
				r_cuadrada.setIcon(new ImageIcon("raiz2.png"));
				r_cuadrada.setBorder(new MatteBorder(null));
				add(r_cuadrada);
				r_cuadrada.addActionListener(new AdminEventos(this));
				
				r_cubica= new JButton("");
				r_cubica.setBounds(250, 320, 100, 80);
				r_cubica.setIcon(new ImageIcon("raiz3.png"));
				r_cubica.setBorder(new MatteBorder(null));
				add(r_cubica);
				r_cubica.addActionListener(new AdminEventos(this));
				
				historial= new JButton("");
				historial.setBounds(300, 420, 50,40);
				historial.setIcon(new ImageIcon("flecha.png"));
				historial.setBorder(new MatteBorder(null));
				add(historial);
				historial.addActionListener(new AdminEventos(this));

				teclado = new JButton("teclado");
				teclado.setBounds(0, 400, 100, 50);
				teclado.addActionListener(new AdminEventos(this));
				add(teclado);				
				
				modoNormal = new JRadioButton("normal");
				modoNormal.setBounds(70, 500, 100, 30);
				modoNormal.setSelected(true);
				modoNormal.setBackground(getContentPane().getBackground());
				modoNormal.setFocusable(false);
				modoNormal.addChangeListener(new AdminEventos(this));
				add(modoNormal);
				
				modoAccesibilidad = new JRadioButton("accesibilidad");
				modoAccesibilidad.setBounds(250, 500, 100, 30);
				modoAccesibilidad.setBackground(getContentPane().getBackground());
				modoAccesibilidad.setFocusable(false);
				modoAccesibilidad.addActionListener(new AdminEventos(this));
				add(modoAccesibilidad);
				
				grupo = new ButtonGroup();
				grupo.add(modoNormal);
				grupo.add(modoAccesibilidad);
				
				
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
			
			public JButton getHistorial() {
				return historial;
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


			public JButton getTeclado() {
				return teclado;
			}

			public void setTeclado(JButton teclado) {
				this.teclado = teclado;
			}



			public JDialog getVentanaSecundaria() {
				return ventanaSecundaria;
			}



			public void setVentanaSecundaria(JDialog ventanaSecundaria) {
				this.ventanaSecundaria = ventanaSecundaria;
			}



			public JLabel getEtiqueta1() {
				return etiqueta1;
			}



			public void setEtiqueta1(JLabel etiqueta1) {
				this.etiqueta1 = etiqueta1;
			}



			public JLabel getEtiqueta2() {
				return etiqueta2;
			}



			public void setEtiqueta2(JLabel etiqueta2) {
				this.etiqueta2 = etiqueta2;
			}



			public JLabel getEtiqueta3() {
				return etiqueta3;
			}



			public void setEtiqueta3(JLabel etiqueta3) {
				this.etiqueta3 = etiqueta3;
			}



			public JLabel getLogo() {
				return logo;
			}



			public void setLogo(JLabel logo) {
				this.logo = logo;
			}



			public JRadioButton getModoNormal() {
				return modoNormal;
			}



			public void setModoNormal(JRadioButton modoNormal) {
				this.modoNormal = modoNormal;
			}



			public JRadioButton getModoAccesibilidad() {
				return modoAccesibilidad;
			}



			public void setModoAccesibilidad(JRadioButton modoAccesibilidad) {
				this.modoAccesibilidad = modoAccesibilidad;
			}



			public ButtonGroup getGrupo() {
				return grupo;
			}



			public void setGrupo(ButtonGroup grupo) {
				this.grupo = grupo;
			}



			public void setEtiqueta4(JLabel etiqueta4) {
				this.etiqueta4 = etiqueta4;
			}



			public void setCajaTexto1(JTextField cajaTexto1) {
				this.cajaTexto1 = cajaTexto1;
			}



			public void setCajaTexto2(JTextField cajaTexto2) {
				this.cajaTexto2 = cajaTexto2;
			}



			public void setSumar(JButton sumar) {
				this.sumar = sumar;
			}



			public void setRestar(JButton restar) {
				this.restar = restar;
			}



			public void setMultiplicar(JButton multiplicar) {
				this.multiplicar = multiplicar;
			}



			public void setDividir(JButton dividir) {
				this.dividir = dividir;
			}



			public void setR_cuadrada(JButton r_cuadrada) {
				this.r_cuadrada = r_cuadrada;
			}



			public void setR_cubica(JButton r_cubica) {
				this.r_cubica = r_cubica;
			}



			public void setHistorial(JButton historial) {
				this.historial = historial;
			}

}


