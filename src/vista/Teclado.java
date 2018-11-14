package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;

public class Teclado extends JDialog{

	Calculadora ventana = new Calculadora();
	private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
	
	public Teclado(Calculadora ventana) {
		this.ventana = ventana;
		setSize(275, 460);
		setLocation((int)ventana.getLocationOnScreen().getX()+350, (int)ventana.getLocationOnScreen().getY());
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setIconImage(ventana.getIconImage());
		setResizable(false);
		setLayout(null);
		inicializarComponentes();
		comprobarModo();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		num1 = new JButton("1");
		num1.setFont(num1.getFont().deriveFont(40f));
		num1.setBounds(25, 15, 75, 100);
		num1.setFocusable(false);
		this.add(num1);
		
		num2 = new JButton("2");
		num2.setFont(num2.getFont().deriveFont(40f));
		num2.setBounds(100, 15, 75, 100);
		num2.setFocusable(false);
		this.add(num2);
		
		num3 = new JButton("3");
		num3.setBounds(175, 15, 75, 100);
		num3.setFont(num3.getFont().deriveFont(40f));
		num3.setFocusable(false);
		this.add(num3);		
		
		num4 = new JButton("4");
		num4.setBounds(25, 115, 75, 100);
		num4.setFont(num4.getFont().deriveFont(40f));
		num4.setFocusable(false);
		this.add(num4);
		
		num5 = new JButton("5");
		num5.setBounds(100, 115, 75, 100);
		num5.setFont(num5.getFont().deriveFont(40f));
		num5.setFocusable(false);
		this.add(num5);
		
		num6 = new JButton("6");
		num6.setBounds(175, 115, 75, 100);
		num6.setFont(num6.getFont().deriveFont(40f));
		num6.setFocusable(false);
		this.add(num6);
		
		num7 = new JButton("7");
		num7.setBounds(25, 215, 75, 100);
		num7.setFont(num7.getFont().deriveFont(40f));
		num7.setFocusable(false);
		this.add(num7);
		
		num8 = new JButton("8");
		num8.setBounds(100, 215, 75, 100);
		num8.setFont(num8.getFont().deriveFont(40f));
		num8.setFocusable(false);
		this.add(num8);
		
		num9 = new JButton("9");
		num9.setBounds(175, 215, 75, 100);
		num9.setFont(num9.getFont().deriveFont(40f));
		num9.setFocusable(false);
		this.add(num9);
		
		num0 = new JButton("0");
		num0.setBounds(100, 315, 75, 100);
		num0.setFont(num0.getFont().deriveFont(40f));
		num0.setFocusable(false);
		this.add(num0);
		
	}
	
	public void comprobarModo() {
		/*
		 * if(ventana.getModoNormal().isSelected()) {
			getContentPane().setBackground(new Color(178, 235, 242));
			 
			num1.setBackground(new Color(0, 151, 167));
			num1.setForeground(Color.WHITE);			
				
			num2.setBackground(new Color(0, 151, 167));
			num2.setForeground(Color.WHITE);

			num3.setBackground(new Color(0, 151, 167));
			num3.setForeground(Color.WHITE);
			
			num4.setBackground(new Color(0, 151, 167));
			num4.setForeground(Color.WHITE);

			num5.setBackground(new Color(0, 151, 167));
			num5.setForeground(Color.WHITE);	
				
			num6.setBackground(new Color(0, 151, 167));
			num6.setForeground(Color.WHITE);
				
			num7.setBackground(new Color(0, 151, 167));
			num7.setForeground(Color.WHITE);
								
			num8.setBackground(new Color(0, 151, 167));
			num8.setForeground(Color.WHITE);
				
			num9.setBackground(new Color(0, 151, 167));
			num9.setForeground(Color.WHITE);
				
			num0.setBackground(new Color(0, 151, 167));
			num0.setForeground(Color.WHITE);
		}else {
			getContentPane().setBackground(new Color(33, 33, 33));
			
			num1.setBackground(new Color(205, 220, 57));
			num1.setForeground(new Color(33, 33, 33));			
			
			num2.setBackground(new Color(205, 220, 57));
			num2.setForeground(new Color(33, 33, 33));

			num3.setBackground(new Color(205, 220, 57));
			num3.setForeground(new Color(33, 33, 33));
			
			num4.setBackground(new Color(205, 220, 57));
			num4.setForeground(new Color(33, 33, 33));

			num5.setBackground(new Color(205, 220, 57));
			num5.setForeground(new Color(33, 33, 33));	
			
			num6.setBackground(new Color(205, 220, 57));
			num6.setForeground(new Color(33, 33, 33));
			
			num7.setBackground(new Color(205, 220, 57));
			num7.setForeground(new Color(33, 33, 33));
							
			num8.setBackground(new Color(205, 220, 57));
			num8.setForeground(new Color(33, 33, 33));
			
			num9.setBackground(new Color(205, 220, 57));
			num9.setForeground(new Color(33, 33, 33));
			
			num0.setBackground(new Color(205, 220, 57));
			num0.setForeground(new Color(33, 33, 33));
		}
		 */
		
		
	}

	public JButton getNum1() {
		return num1;
	}

	public void setNum1(JButton num1) {
		this.num1 = num1;
	}

	public JButton getNum2() {
		return num2;
	}

	public void setNum2(JButton num2) {
		this.num2 = num2;
	}

	public JButton getNum3() {
		return num3;
	}

	public void setNum3(JButton num3) {
		this.num3 = num3;
	}

	public JButton getNum4() {
		return num4;
	}

	public void setNum4(JButton num4) {
		this.num4 = num4;
	}

	public JButton getNum5() {
		return num5;
	}

	public void setNum5(JButton num5) {
		this.num5 = num5;
	}

	public JButton getNum6() {
		return num6;
	}

	public void setNum6(JButton num6) {
		this.num6 = num6;
	}

	public JButton getNum7() {
		return num7;
	}

	public void setNum7(JButton num7) {
		this.num7 = num7;
	}

	public JButton getNum8() {
		return num8;
	}

	public void setNum8(JButton num8) {
		this.num8 = num8;
	}

	public JButton getNum9() {
		return num9;
	}

	public void setNum9(JButton num9) {
		this.num9 = num9;
	}

	public JButton getNum0() {
		return num0;
	}

	public void setNum0(JButton num0) {
		this.num0 = num0;
	}
	
}
