import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jacor extends JFrame{
	private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,nbt,sbt;
	
	private static boolean vez;
	private boolean estado[] = new boolean[9];
	
	private Icon galo = new ImageIcon(getClass().getResource( "Galo.gif" ));
	private Icon estrela = new ImageIcon(getClass().getResource( "Estrela.gif" ));
	
public Jacor(){
	for(int i=0;i<9;i++){
	   estado[i]=false;
	}
	CriaGui();
	accoes();
}

public void CriaGui(){
	setTitle("Jogo Do Galo Preto");
	JPanel painel= new JPanel();
	JPanel subpainel= new JPanel();
	
	Container container= getContentPane();
	container.setLayout(new BorderLayout());
	
	painel.setLayout(new GridLayout(3,3));
	subpainel.setLayout(new FlowLayout());
	
	bt1=new JButton("");
	bt2=new JButton("");
	bt3=new JButton("");
	bt4=new JButton("");
	bt5=new JButton("");
	bt6=new JButton("");
	bt7=new JButton("");
	bt8=new JButton("");
	bt9=new JButton("");
	nbt= new JButton("Novo Jogo");
	sbt= new JButton("Sair");
	
	painel.add(bt1);
	painel.add(bt2);
	painel.add(bt3);
	painel.add(bt4);
	painel.add(bt5);
	painel.add(bt6);
	painel.add(bt7);
	painel.add(bt8);
	painel.add(bt9);
	
	subpainel.add(nbt);
	subpainel.add(sbt);
	
	container.add(painel, BorderLayout.CENTER);
	container.add(subpainel, BorderLayout.SOUTH);
	
	setSize(300,300);
	setVisible(true);
	setResizable(false);
}
public void accoes(){
		nbt.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					dispose();
					new Jacor();
				}	
			}
		);
		sbt.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					dispose();
					System.exit(1);
				}
			}
		);
		bt1.addActionListener(
		      new ActionListener(){
		         public void actionPerformed(ActionEvent evt){
		            if(estado[0]){
		               JOptionPane.showMessageDialog(null, "O Espaco esta preenchido!!!");
		               return;
		            }
		            bt1.setIcon(escolheIcone());
		            vez = !vez;
		            estado[0] = true;
		         }
		      }	
		);
		bt2.addActionListener(
		      new ActionListener(){
		         public void actionPerformed(ActionEvent evt){
		            if(estado[1]){
		               JOptionPane.showMessageDialog(null, "O Espaco esta preenchido!!!");
		               return;
		            }
		            bt2.setIcon(escolheIcone());
		            vez = !vez;
		            estado[1] = true;
		         }
		      }	
		);
		bt3.addActionListener(
		      new ActionListener(){
		         public void actionPerformed(ActionEvent evt){
		            if(estado[2]){
		               JOptionPane.showMessageDialog(null, "O Espaco esta preenchido!!!");
		               return;
		            }
		            bt3.setIcon(escolheIcone());
		            vez = !vez;
		            estado[2] = true;
		         }
		      }	
		);
		bt4.addActionListener(
		      new ActionListener(){
		         public void actionPerformed(ActionEvent evt){
		            if(estado[3]){
		               JOptionPane.showMessageDialog(null, "O Espaco esta preenchido!!!");
		               return;
		            }
		            bt4.setIcon(escolheIcone());
		            vez = !vez;
		            estado[3] = true;
		         }
		      }	
		);
		bt5.addActionListener(
		      new ActionListener(){
		         public void actionPerformed(ActionEvent evt){
		            if(estado[4]){
		               JOptionPane.showMessageDialog(null, "O Espaco esta preenchido!!!");
		               return;
		            }
		            bt5.setIcon(escolheIcone());
		            vez = !vez;
		            estado[4] = true;
		         }
		      }	
		);
		bt6.addActionListener(
		      new ActionListener(){
		         public void actionPerformed(ActionEvent evt){
		            if(estado[5]){
		               JOptionPane.showMessageDialog(null, "O Espaco esta preenchido!!!");
		               return;
		            }
		            bt6.setIcon(escolheIcone());
		            vez = !vez;
		            estado[5] = true;
		         }
		      }	
		);
		bt7.addActionListener(
		      new ActionListener(){
		         public void actionPerformed(ActionEvent evt){
		            if(estado[6]){
		               JOptionPane.showMessageDialog(null, "O Espaco esta preenchido!!!");
		               return;
		            }
		            bt7.setIcon(escolheIcone());
		            vez = !vez;
		            estado[6] = true;
		         }
		      }	
		);
		bt8.addActionListener(
		      new ActionListener(){
		         public void actionPerformed(ActionEvent evt){
		            if(estado[7]){
		               JOptionPane.showMessageDialog(null, "O Espaco esta preenchido!!!");
		               return;
		            }
		            bt8.setIcon(escolheIcone());
		            vez = !vez;
		            estado[7] = true;
		         }
		      }	
		);
		bt9.addActionListener(
		      new ActionListener(){
		         public void actionPerformed(ActionEvent evt){
		            if(estado[8]){
		               JOptionPane.showMessageDialog(null, "O Espaco esta preenchido!!!");
		               return;
		            }
		            bt9.setIcon(escolheIcone());
		            vez = !vez;
		            estado[8] = true;
		         }
		      }	
		);
}
public static void main (String[] ari){
	new Jacor();
}

public Icon escolheIcone(){
   if(vez){
      return galo;
   }
   return estrela;
}
}
