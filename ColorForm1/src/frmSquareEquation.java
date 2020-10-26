import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class frmSquareEquation extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSquareEquation frame = new frmSquareEquation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmSquareEquation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblZAGOLOVOK = new JLabel("Квадратное уравнение");
		lblZAGOLOVOK.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblZAGOLOVOK.setBounds(24, 11, 176, 14);
		contentPane.add(lblZAGOLOVOK);
		
		JLabel lblSolution = new JLabel("");
		lblSolution.setVerticalAlignment(SwingConstants.TOP);
		lblSolution.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSolution.setBounds(10, 214, 314, 36);
		contentPane.add(lblSolution);
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt1.setBounds(10, 47, 51, 22);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblX_1 = new JLabel("X2 +");
		lblX_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblX_1.setBounds(61, 52, 37, 14);
		contentPane.add(lblX_1);
		
		txt2 = new JTextField();
		txt2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt2.setBounds(91, 47, 51, 22);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JLabel lblX = new JLabel("X +");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblX.setBounds(144, 51, 46, 14);
		contentPane.add(lblX);
		
		txt3 = new JTextField();
		txt3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt3.setBounds(171, 47, 51, 22);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		JButton btnrewenie = new JButton("Решить уравнение");
		btnrewenie.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnrewenie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a;
				double b;
				double c;
				try{
					a = Double.parseDouble(txt1.getText());
					}
					catch(NumberFormatException nfe){
					a = 0.0;
					txt1.setText("0.0");
					}
				try{
					b = Double.parseDouble(txt2.getText());
					}
					catch(NumberFormatException nfe){
					b = 0.0;
					txt2.setText("0.0");
					}
				try{
					c = Double.parseDouble(txt3.getText());
					}
					catch(NumberFormatException nfe){
					c = 0.0;
					txt3.setText("0.0");
					}
				double D = b * b - 4 * a * c;
				// Дискриминант
				double x1, x2;
				// Корни
				String Sol = "";
				if(D < 0.0)
				Sol = "Действительных корней нет";
				else if(D > 0 && a != 0.){
				x1 = (-b + Math.sqrt(D)) / (2. * a);
				x2 = (-b - Math.sqrt(D)) / (2. * a);
				Sol = "Корни: x1 = " + x1 + ", x2 = " + x2;
				}
				else if(D == 0 && a != 0.0){
				x1 = -b / (2. * a);
				Sol = "Корень x = " + x1;
				}
				else if(a == 0 && b != 0.){
				x1 = -c / b;
				Sol = "Корень x = " + x1;
				}
				lblSolution.setText(Sol);
			}
		});
		btnrewenie.setBounds(10, 149, 314, 23);
		contentPane.add(btnrewenie);
		
		JLabel label_1 = new JLabel("Решение");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(125, 183, 140, 14);
		contentPane.add(label_1);
		

	}
}
