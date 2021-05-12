import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JEditorPane;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
public class Calculator {
	JFrame frame;
	JTextField textField;
	JButton one,two,three,four,five,six,seven,eight,nine,zero,m2,add,sub,div,mult,dot,clear,BS,power3, Float,equal, btnMr,btnmc,mMinus,mplus;
	JRadioButton decimal,binary,radian,degree;
	//=============================================
	
	public double Number1;
	public double Number2;
	public String operation;
	public double result;
	public String answer1;
	public String answer2;
	public String answer3;
	public String answer4;
	public String answer5;
	public String s;
	public String s2;
	
	//==================================================	

	
	
	public Calculator() {

        frame = new JFrame();
        frame.getContentPane().setBackground(Color.GRAY);
		frame.setSize(514,349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().setLayout(new GridBagLayout());
		
		
      //TEXT FFIELD===================================================
		
		textField = new JTextField(20);
		textField.setFont(new Font("Tahoma", Font.ITALIC, 19));
	     GridBagConstraints gbc_textField = new GridBagConstraints();
		 textField.setBackground(Color.LIGHT_GRAY);
		 gbc_textField.gridwidth = 5;
		 gbc_textField.insets = new Insets(10,10,10,10);
		 gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField.gridx = 1;
		 gbc_textField.gridy = 0;
		 frame.getContentPane().add(textField,gbc_textField);
		
		//============================================================DEGREE
		degree = new JRadioButton("degree");
		GridBagConstraints gbc_rdbtnDegree = new GridBagConstraints();
		degree.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			try {
				Number1=(int)Double.parseDouble( textField.getText());
				textField.setText("");// law set text bo awaya ka zhmara daxl dakay hicht pishan nadat hata zhmaray dwam daxl dakay
				result=Number1*180/3.141559263535;
				textField.setText(textField.getText()+result);

			    }catch(Exception m) {
			}}});
		
		gbc_rdbtnDegree.insets = new Insets(10,10,10,10);
		gbc_rdbtnDegree.gridx = 4;
		gbc_rdbtnDegree.gridy = 2;
		frame.getContentPane().add(degree,gbc_rdbtnDegree);
		degree.setBackground(Color.WHITE);
	
		//=================================================================RADIAN
				 radian = new JRadioButton("radian");
				 GridBagConstraints gbc_rdbtnRadian = new GridBagConstraints();
				 radian.setBackground(Color.WHITE);
				 
				 		radian.addActionListener(new ActionListener() {
				 
				 			
				 			public void actionPerformed(ActionEvent e) {
				 				try {
				 				Number1=(int)Double.parseDouble( textField.getText());
				 				textField.setText("");
				 				// law set text bo awaya ka zhmara daxl dakay hicht pishan nadat hata zhmaray dwam daxl dakay
				 				result=(int)Number1*3.1415926535/180;
				 				textField.setText(textField.getText()+result);
				 				}catch(Exception radian) {
				 					JOptionPane.showMessageDialog(null, "please enter an amount to be converted");
				 					
				 				}}});

				 		gbc_rdbtnRadian.insets = new Insets(10,10,10,10);
				 		gbc_rdbtnRadian.gridx = 3;
				 		gbc_rdbtnRadian.gridy = 2;
				 		frame.getContentPane().add(radian,gbc_rdbtnRadian);
				 		
				 		//=========================================================DECIMAL
				 		 decimal = new JRadioButton("decimal");
				 		 GridBagConstraints gbc_rdbtnDecumal = new GridBagConstraints();
				 		 decimal.setBackground(Color.WHITE);
				 		 decimal.addActionListener(new ActionListener() {
				 		 	public void actionPerformed(ActionEvent e) {
				 		 		try {
				 		 			
				 		 			
				 		 		Number1=(int)Double.parseDouble(textField.getText());
				 		 		textField.setText("");
				 		 		String str=Integer.toBinaryString((int) Number1);
				 		 		textField.setText(textField.getText()+str);
				 		 		
				 		 		
				 		 		}catch(Exception decimal) {						
				 		 		}}});
				 		 gbc_rdbtnDecumal.insets = new Insets(10,10,10,10);
				 		 gbc_rdbtnDecumal.gridx = 2;
				 		 gbc_rdbtnDecumal.gridy = 2;
				 		 frame.getContentPane().add(decimal,gbc_rdbtnDecumal);
				 //========================================================BINARY
		        binary = new JRadioButton("Binary");
		GridBagConstraints gbc_rdbtnBinary = new GridBagConstraints();
		binary.setBackground(Color.WHITE);
		gbc_rdbtnBinary.insets = new Insets(10,10,10,10);
		gbc_rdbtnBinary.gridx = 1;
		gbc_rdbtnBinary.gridy = 2;
		frame.getContentPane().add(binary,gbc_rdbtnBinary);
		binary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					// buttons that must be disable when you entire Binary numbers
					three.setEnabled(false);
					two.setEnabled(false);
					four.setEnabled(false);
					five.setEnabled(false);
					six.setEnabled(false);
					seven.setEnabled(false);
					eight.setEnabled(false);
					nine.setEnabled(false);
					sub.setEnabled(false);
					div.setEnabled(false);
					mult.setEnabled(false);
					add.setEnabled(false);
			   
					equal.setEnabled(false);
					power3.setEnabled(false);
					Float.setEnabled(false);
					
				Number1=Integer.parseInt((textField.getText()),2);
				textField.setText(String.valueOf(Number1));
					
			// we should enable them back
				two.setEnabled(true);
				four.setEnabled(true);
				five.setEnabled(true);
				six.setEnabled(true);
				seven.setEnabled(true);
				eight.setEnabled(true);
				nine.setEnabled(true);
				sub.setEnabled(true);
				div.setEnabled(true);
				mult.setEnabled(true);
				add.setEnabled(true);
		      
				equal.setEnabled(true);
				power3.setEnabled(true);
				Float.setEnabled(true);
			//	textField.setText("");// law set text bo awaya ka zhmara daxl dakay hicht pishan nadat hata zhmaray dwam daxl dakay
				}catch(Exception m) {
					
				}}});
				 
//===================================== BUTTONS
		
		one = new JButton("1");
		GridBagConstraints G1 = new GridBagConstraints();
		one.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+1);
			}
		});
		G1.insets = new Insets(10, 10, 10, 10);
		G1.anchor = GridBagConstraints.EAST;
		G1.gridx = 0;
		G1.gridy = 3;
		frame.getContentPane().add(one,G1);
		



		
//===================================================================		
		two = new JButton("2");
		GridBagConstraints G2 = new GridBagConstraints();
		two.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textField.setText(textField.getText()+2);				
			}
			
		});
		G2.insets = new Insets(10, 10, 10, 10);
		G2.gridx = 1;
		G2.gridy = 3;
		frame.getContentPane().add(two,G2);
		

//=======================================================================================	
		three= new JButton("3");
		GridBagConstraints G3= new GridBagConstraints();
		three.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textField.setText(textField.getText()+3);
			}
		});
		G3.insets = new Insets(10,10,10,10);
		G3 .gridx = 2;
		G3 .gridy = 3;
		frame.getContentPane().add(three,G3 );

//====================================================================================		

		
		
		four = new JButton("4");
		GridBagConstraints G4 = new GridBagConstraints();
		G4.insets = new Insets(10,10,10,10);
		four.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				textField.setText(textField.getText()+4);
				
			}

		});
		G4.anchor = GridBagConstraints.WEST;
		G4.gridx = 3;
		G4.gridy = 3;
		frame.getContentPane().add(four,G4);

//============================================================================================
		
		five = new JButton("5");
		GridBagConstraints G5 = new GridBagConstraints();
		G5.insets = new Insets(10,10,10,10);
	     five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				textField.setText(textField.getText()+5);				
			}
	    	 
	     });
	     G5.anchor = GridBagConstraints.EAST;
	     G5.gridx = 0;
	     G5.gridy = 4;
		frame.getContentPane().add(five,G5);

		//========================================================================================
		six= new JButton("6");
		GridBagConstraints G6 = new GridBagConstraints();
		G6.insets = new Insets(10,10,10,10);
		six.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stub
				textField.setText(textField.getText()+6);
			}
			
		});
		G6.gridx = 1;
		G6.gridy = 4;
		frame.getContentPane().add(six, G6);

		//========================================================================================

		seven= new JButton("7");
		GridBagConstraints G7 = new GridBagConstraints();
		seven.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String EnterNumber=textField.getText()+seven.getText();
				textField.setText(EnterNumber);
			}
			
		});
		G7 .insets = new Insets(10,10,10,10);
		G7 .gridx = 2;
		G7 .gridy = 4;
		frame.getContentPane().add(seven,G7);

		//==============================================================================================================

		eight = new JButton("8");
		GridBagConstraints G8= new GridBagConstraints();
		eight.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+8);

			}

		});
		G8.anchor = GridBagConstraints.WEST;// this is for locating the button with others in same axis
	G8.insets = new Insets(10,10,10,10);
		G8.gridx = 3;
		G8.gridy = 4;
		frame.getContentPane().add(eight, G8);
		textField.setText(null);

		//=================================================================================================================
		
		nine= new JButton("9");
		GridBagConstraints G9 = new GridBagConstraints();
		G9 .anchor = GridBagConstraints.EAST;
		G9 .insets = new Insets(10,10,10,10);
		G9 .gridx = 0;
		G9 .gridy = 5;
		frame.getContentPane().add(nine, G9 );
		nine.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				textField.setText(textField.getText()+9);	
				

			}
			

		});

//===============================================================================================================================================
		zero = new JButton("0");
		GridBagConstraints G0 = new GridBagConstraints();
		zero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				textField.setText(textField.getText()+0);				
			}
			
		});
		G0.insets = new Insets(10,10,10,10);
		G0.gridx = 1;
		G0.gridy = 5;
		frame.getContentPane().add(zero, G0);

		//==============================================================================
		add= new JButton("+");
		GridBagConstraints gbc_plus = new GridBagConstraints();
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Number1=Double.parseDouble( textField.getText());
				textField.setText("");// law set text bo awaya ka zhmara daxl dakay hicht pishan nadat hata zhmaray dwam daxl dakay
				operation="+";// awash bo awaya ka la if u else pey bnasretawa wata rastawxo betawa naw aw methoda
				}catch(Exception add) {
				}
			}
			
		});
		gbc_plus.fill = GridBagConstraints.HORIZONTAL;
		gbc_plus.insets = new Insets(10,10,10,10);
		gbc_plus.gridx = 4;
		gbc_plus.gridy = 3;
		frame.add(add,gbc_plus);
		add.setBackground(Color.orange);
		
		//====================================================================================================================
    
		sub = new JButton("-");
		GridBagConstraints gbc_sub = new GridBagConstraints();
		sub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				Number1=Double.parseDouble( textField.getText());
				textField.setText("");
				operation="-";
				}catch(Exception sub) {

				}
 
				
			}
			
			
			
		});
		gbc_sub.fill = GridBagConstraints.HORIZONTAL;
		gbc_sub.insets = new Insets(10,10,10,10);
		gbc_sub.gridx = 5;
		gbc_sub.gridy = 3;
		sub.setBackground(Color.orange);

		frame.add(sub,gbc_sub);
    
    
	//====================================================================================================================
	
		
		mult = new JButton("*");
		GridBagConstraints mult1= new GridBagConstraints();
		mult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
            try {
				Number1=Double.parseDouble( textField.getText());
				textField.setText("");
				operation="*";
            }catch(Exception mult) {

                    }
			}
			
			
		});
		mult1.fill = GridBagConstraints.HORIZONTAL;
		mult1.insets = new Insets(10,10,10,10);
		mult1.gridx =4;
		mult1.gridy = 4;
		frame.add(mult, mult1);
		mult.setBackground(Color.orange);

//============================================================================		
		div = new JButton("/");
		GridBagConstraints Gidv = new GridBagConstraints();
		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				Number1=Double.parseDouble( textField.getText());
				textField.setText("");
				operation="/";		
				}catch(Exception div) {

				}
			}
			
		});
		Gidv.fill = GridBagConstraints.HORIZONTAL;
		Gidv.insets = new Insets(10,10,10,10);
		Gidv.gridx = 5;
		Gidv.gridy = 4;
		frame.add(div, Gidv);
		div.setBackground(Color.orange);

//==================================================Backspace
		BS = new JButton("\uF0E7");// this is brought from char map to show the backsapce Sign
		BS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=null;
				if(textField.getText().length()>0) {
					StringBuilder br=new StringBuilder(textField.getText());
					br.deleteCharAt(textField.getText().length()-1);
					str=br.toString();
					textField.setText(str);
				}}});
		
		GridBagConstraints BS1 = new GridBagConstraints();
		BS1.anchor = GridBagConstraints.WEST;
		BS1.insets = new Insets(10,10,10,10);
		BS1.gridx = 2;
		BS1.gridy = 5;
		frame.add(BS,BS1);
	//	BS.setBackground(Color.orange);

//===============================================================Clear button
		clear = new JButton("C");
		
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.anchor = GridBagConstraints.WEST;
		gbc_btnC.insets = new Insets(10,10,10,10);
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
			
		});
		gbc_btnC.gridx = 3;
		gbc_btnC.gridy = 5;
		frame.getContentPane().add(clear, gbc_btnC);

//=============================================================================================
		power3= new JButton("x^n");
		power3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Number1=(int)Double.parseDouble( textField.getText());
				textField.setText("");
				operation="x^n";	
				}catch(Exception power3) {
				}
			}
		});
		GridBagConstraints Gpower = new GridBagConstraints();
		 Gpower .fill = GridBagConstraints.VERTICAL;
		 Gpower .insets = new Insets(10,10,10,10);
		 Gpower .gridx = 4;
		 Gpower .gridy = 5;
		frame.add(power3, Gpower );
		power3.setBackground(Color.orange);

	//======================================================================================	
			
	
	equal = new JButton("=");
	GridBagConstraints Gequal = new GridBagConstraints();
	
	equal.addActionListener(new ActionListener() {

		@Override
		
		public void actionPerformed(ActionEvent e) {

			try {
			

			Number2=Double.parseDouble(textField.getText());


			}catch(Exception equal) {
				//frame.setTitle(null);

			}
		
			if(operation=="+") {
				
				result=Number1+Number2;
				answer1=String.format("%.2f", result);
				textField.setText(answer1);
			}else if(operation=="-") {
				
				result=Number1-Number2;
				answer2=String.format("%.2f", result);
				textField.setText(answer2);
				

			}else if(operation=="*") {
				
				result=Number1*Number2;
				answer3=String.format("%.2f", result);
				textField.setText(answer3);


			}else if(operation=="/") {
				
				result=Number1/Number2;
				answer4=String.format("%.2f", result);
				textField.setText(answer4);


			}else if(operation=="x^n") {
				result=Math.pow(Number1, Number2);
				answer5=String.format("%.2f", result);
				textField.setText(answer5);

				}}}
	);

	Gequal.insets = new Insets(10,10, 10, 10);
	Gequal.gridx = 5;
	Gequal.gridy = 5;
	frame.add(equal, Gequal);
	equal.setBackground(Color.orange);

//==============================================================================================		
		Float = new JButton(".");
		GridBagConstraints Gdot = new GridBagConstraints();
		Gdot.fill = GridBagConstraints.HORIZONTAL;
		Float.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");				
			}
			
		});
		Gdot.insets = new Insets(10, 10, 10, 10);
		Gdot.gridx = 5;
		Gdot.gridy = 6;
		frame.getContentPane().add(Float, Gdot);
		Float.setBackground(Color.orange);


//============================================================================		
		btnMr = new JButton("MR");
		btnMr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+answer1);				

			}
		});
		GridBagConstraints gbc_btnMr = new GridBagConstraints();
		gbc_btnMr.anchor = GridBagConstraints.EAST;
		gbc_btnMr.insets = new Insets(0, 0, 0, 5);
		gbc_btnMr.gridx = 1;
		gbc_btnMr.gridy = 6;
		frame.getContentPane().add(btnMr, gbc_btnMr);
		btnMr.setBackground(Color.orange);

//=====================================================================
		btnmc = new JButton("MC");
		GridBagConstraints gbc_btnMc = new GridBagConstraints();
		btnmc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+answer2);				

			}
			
			
		});
		gbc_btnMc.insets = new Insets(0, 0, 0, 5);
		gbc_btnMc.gridx = 2;
		gbc_btnMc.gridy = 6;
		frame.getContentPane().add(btnmc, gbc_btnMc);
		btnmc.setBackground(Color.orange);

//==============================================================		
		mplus = new JButton("M+");
		GridBagConstraints Gmp = new GridBagConstraints();
		mplus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
							
				
			}
			
			
		});
		Gmp.insets = new Insets(0, 0, 0, 5);
		Gmp.gridx = 3;
		Gmp.gridy = 6;
		frame.getContentPane().add(mplus, Gmp);
		mplus.setBackground(Color.orange);

//======================================================================
		
		mMinus= new JButton("M-");
		GridBagConstraints gmm = new GridBagConstraints();
		mMinus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
 
			}
			
		});
		gmm .insets = new Insets(0, 0, 0, 5);
		gmm .gridx = 4;
		gmm .gridy = 6;
		frame.getContentPane().add(mMinus, gmm );
		mMinus.setBackground(Color.orange);

		
		//-------------------------------------
		
	}



    public static void main(String[] args) {
   		
				Calculator win= new Calculator();
				win.frame.setVisible(true);
		
	}
	}


