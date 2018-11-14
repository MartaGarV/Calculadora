package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import vista.Calculadora;
import vista.Resultados;
import vista.Teclado;



public class AdminEventos implements ActionListener, ChangeListener, MouseListener {
	
	//creo una variable
	private Calculadora calculadora;
	private Teclado teclado = null;
	private int num1, num2, suma, resta, raiz_3, multi, div;
	private static ArrayList<String> resultados = new ArrayList<String>();;
	Resultados r = new Resultados();
			
						
	//constructor al que le pasamos la propia calculadora como parámetro
	public AdminEventos(Calculadora calculadora) {
		//vamos a guardar el objeto calculadora en la variable calculadora
		//asi podremos acceder a todo el objeto: titulo, texto, etc
		this.calculadora = calculadora;
	}
			 
	//Acciones de cada botón
	public void actionPerformed(ActionEvent e) { 
			
		if(e.getSource() == calculadora.getTeclado()) {
			teclado = new Teclado(calculadora);
		}else if(e.getSource()== calculadora.getHistorial()) {
			if(resultados.size()>5) {
				resultados.remove(0);
			}
			r.refrescar();
			r.setVisible(true);
			
		}
		//Aviso de funcionalidad no disponible para la raíz cuadrada
		else if(e.getSource()== calculadora.getR_cuadrada()) {
			JOptionPane.showMessageDialog(calculadora,"Funcionalidad no disponible","Aviso", JOptionPane.INFORMATION_MESSAGE);
		}
		//Petición de contraseña para la raíz cúbica
		else if(e.getSource()== calculadora.getR_cubica()) {
					
			String pw = JOptionPane.showInputDialog(null,"Introduce contraseña");
			//La contraseña es "hola"
			if("hola".equals(pw)) {
				JOptionPane.showMessageDialog(null,"Contraseña correcta");	
				//Error si no hemos puesto nada en la caja de texto
				if(calculadora.getCajaTexto1().getText().equals("")) {
					calculadora.getEtiqueta4().setText("Falta Número 1");
				}			 
				else {
					//Realizamos la operación
					num1 = Integer.parseInt(calculadora.getCajaTexto1().getText());
					raiz_3=(int) Math.cbrt(num1); 
					calculadora.getEtiqueta4().setText(String.valueOf(raiz_3));					
				}
			}else {
				JOptionPane.showMessageDialog(null,"Error");	
			}
		}

		else {				
			try {			
				//declaramos las variables para las operaciones
				num1 = Integer.parseInt(calculadora.getCajaTexto1().getText());
				num2 = Integer.parseInt(calculadora.getCajaTexto2().getText());
				suma = num1+num2;
				resta = num1-num2;
				multi = num1*num2;
						
				//comprobamos si alguna de las cajas de texto está vacía
				if(calculadora.getCajaTexto1().getText().equals("")) {
					calculadora.getEtiqueta4().setText("Falta Número 1");
				}
				else if(calculadora.getCajaTexto2().getText().equals("")) {
					calculadora.getEtiqueta4().setText("Falta Número 2");
				}
						
				//SUMA
				else if(e.getSource()== calculadora.getSumar()) {
					calculadora.getEtiqueta4().setText(String.valueOf(suma));
					String suma1= calculadora.getCajaTexto1().getText() + " " + "+" + " "+ calculadora.getCajaTexto2().getText()+ " " + "=" + " " + " " + suma;
					getResultados().add(suma1);
				}
				//RESTA
				else if(e.getSource()== calculadora.getRestar()) {	
					calculadora.getEtiqueta4().setText(String.valueOf(resta));
					String resta1= calculadora.getCajaTexto1().getText() + " " + "-" + " "+ calculadora.getCajaTexto2().getText()+ " " + "=" + " " + " " + resta;
					getResultados().add(resta1);
				}
				//MULTIPLICACIÓN
				else if(e.getSource()== calculadora.getMultiplicar()) {
					calculadora.getEtiqueta4().setText(String.valueOf(multi));
					String multi1= calculadora.getCajaTexto1().getText() + " " + "x" + " "+ calculadora.getCajaTexto2().getText()+ " " + "=" + " " + " " + multi;
					getResultados().add(multi1);
				}
				//DIVISIÓN
				else if(e.getSource()== calculadora.getDividir()) {		
					//Lanzamos un mensaje si el usuario intenta dividir por cero
					if(num2==0) {
						calculadora.getEtiqueta4().setText("No se puede dividir por 0");
					} else {
						div = num1/num2;
						calculadora.getEtiqueta4().setText(String.valueOf(div));
						String div1= calculadora.getCajaTexto1().getText() + " " + "/" + " "+ calculadora.getCajaTexto2().getText()+ " " + "=" + " " + " " + div;
						getResultados().add(div1);
					}
				}
	
				//Devolvemos el foco a la primera caja
				calculadora.getCajaTexto1().requestFocus();	
			}
			//Excepción en caso de que se introdujeran letras en las cajas
			catch(NumberFormatException b) {
				calculadora.getEtiqueta4().setText("Sólo números");
			}
		}
	}
	
	//Método de la interfaz ChangeListener
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
	}
	
	
	//Métodos de la interfaz MouseListener
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	public static ArrayList<String> getResultados() {
		return resultados;
	}

	public static void setResultados(ArrayList<String> resultados) {
		AdminEventos.resultados = resultados;
	}

	
	
				
				
				
}