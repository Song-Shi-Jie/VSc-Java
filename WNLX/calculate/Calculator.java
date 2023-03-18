package WNLX.calculate;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
		
	private double result=0;
	private int count=0;
	
	public Calculator() {
		this.setSize(330,399);		
		this.setTitle("计算器");		
		init();
//		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public void init() {//初始化界面
		
		this.setLayout(new BorderLayout()); //总体布局为边框式布局
		
		/*
		 * 总体边框式布局north放置文本框
		 */		
		JTextField textField=new JTextField();
		textField.setEnabled(rootPaneCheckingEnabled);;
		textField.setPreferredSize(new Dimension(this.getWidth(),50));
		this.add(textField,BorderLayout.NORTH);

		/*	
		 * 总体边框式布局center放置@panel(边框式布局）
		 * @panel边框式布局north放置@panelN(网格布局)
		 * @panel边框式布局center放置@panelC(卡片式布局)
		 * @panelC卡片来切换@panel0(标准)和@panel1(科学)两种模式
		 * @panel0,@panel1均为网格布局
		 */					
		JPanel panel=new JPanel();
		panel.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.CENTER);
		
		JPanel panelN=new JPanel();
		panelN.setLayout(new GridLayout(1,6));
		JButton MC=new JButton("MC");
		JButton MR=new JButton("MR");
		JButton M0=new JButton("M+");
		JButton M1=new JButton("M-");
		JButton MS=new JButton("MS");
		JButton M=new JButton("M");
		panelN.add(MC);panelN.add(MR);panelN.add(M0);
		panelN.add(M1);panelN.add(MS);panelN.add(M);
		panel.add(panelN,BorderLayout.NORTH);
		
		CardLayout cardLayout=new CardLayout();
		JPanel panelC=new JPanel();
		panelC.setLayout(cardLayout);
		
		JPanel panel0=new JPanel();
		panel0.setLayout(new GridLayout(6,4));
		JButton[] standredButton=new JButton[24];
		String str[]={"%","√","x²","1/x",
				"CE","C","×","/",
				"7","8","9","*",
				"4","5","6","-",
				"1","2","3","+",
				"±","0",".","="	
		};
		for(int i=0;i<standredButton.length;i++) {
			standredButton[i]=new JButton(str[i]);
			String text=standredButton[i].getText();
			standredButton[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(text.equals("CE")||text.equals("C")) {
						textField.setText("");
					}
					else if(text.equals("=")) {
						String expression=textField.getText();
						Calculator cal=new Calculator();
						textField.setText(cal.evaluateExpression(expression)+"");
					}
					else if(text.equals("%")) {
						
					}
					else if(text.equals("√")) {
						result=Double.parseDouble(textField.getText());
						result=Math.sqrt(result);
						textField.setText(result+"");
					}
					else if(text.equals("x²")) {
						result=Double.parseDouble(textField.getText());
						result*=result;
						textField.setText(result+"");
					}
					else if(text.equals("1/x")) {
						result=Double.parseDouble(textField.getText());
						result=1/result;
						textField.setText(result+"");
					}
					else if(text.equals("±")) {
						if(count==0) {
							textField.setText(textField.getText()+"-");
							count=1;
						}
						else {
							textField.setText(textField.getText()+"+");
							count=0;
						}
					}
					else if(text.equals("×")) {
						textField.setText(textField.getText().substring(0, textField.getText().length()-1));
					}
					else {
						textField.setText(textField.getText()+text);
					}
									
				}
				
			}
			
			);
			panel0.add(standredButton[i]);
		}
		panelC.add(panel0);
		
		JPanel panel1=new JPanel();
		panel1.setLayout(new GridLayout(7,5));
		JButton scienceButton[]=new JButton[35];
		String str1[]= {
		"x²","x^y","sin","cos","tan",
		"√","10^x","log","Exp","Mod",
		"↑","CE","C","×","/",
		"π","7","8","9","*",
		"n!","4","5","6","-",
		"±","1","2","3","+",
		"(",")","0",".","="				
		};
		for(int i=0;i<str1.length;i++) {
			scienceButton[i]=new JButton(str1[i]);
			//scienceButton[i].addActionListener();
			panel1.add(scienceButton[i]);
		}
		panelC.add(panel1);
			
		panel.add(panelC,BorderLayout.CENTER);
		
		/*
		 * 菜单	
		 */
		JMenuBar menuBar=new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenu modelMenu=new JMenu("模式");
		menuBar.add(modelMenu);
		JMenuItem standred=new JMenuItem("标准");		
		standred.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.first(panelC);
			}		
		});
		modelMenu.add(standred);
		JMenuItem science=new JMenuItem("科学");
		science.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.last(panelC);
			}			
		});
		modelMenu.add(science);
		
	}
/*
	private class ButtonAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
					
		}		
	}
*/

	protected String evaluateExpression(String expression) {
		return null;
	}
}

