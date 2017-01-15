import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JacorDois extends JFrame{
   protected BotaoJogo botoes[] = new BotaoJogo[9];
   protected JButton btNovoJogo, btSair;

   protected static boolean vez;
   protected static int jogadas=0;	
   
   protected Icon galo = new ImageIcon(getClass().getResource( "Galo.gif" ));
   protected Icon estrela = new ImageIcon(getClass().getResource( "Estrela.gif" ));

   public JacorDois(){
      jogadas=0;
      criaGUI();
      accoes();
   }
   
   protected void criaGUI(){
      setTitle("Jogo Do Galo Preto Fudido!!!");
      JPanel painel= new JPanel( new GridLayout(3,3) );
      JPanel subpainel= new JPanel();
	
      Container container= getContentPane();
      container.setLayout(new BorderLayout());
	
      for(int i=0;i<9;i++){
         botoes[i] = new BotaoJogo();
      }
      
      btNovoJogo = new JButton("Novo Jogo");
      btSair = new JButton("Sair");

      for(int i=0;i<9;i++){
         painel.add(botoes[i]);
      }
      subpainel.add(btNovoJogo);
      subpainel.add(btSair);
      
      container.add(painel, BorderLayout.CENTER);
      container.add(subpainel, BorderLayout.SOUTH);
	
      setSize(300,300);
      setVisible(true);
      setResizable(false);
   }
   
   protected Icon escolheIcone(){
      if(vez){
         return galo;
      }
         return estrela;
   }
   
   protected char escolhePartido(){
      if(vez){
         return 'g';
      }
         return 'm';
   }
   
   protected void novoJogo(){
      dispose();
      new JacorDois();
   }
   
   private void accoes(){
      TrataEventos eventos = new TrataEventos();
      btNovoJogo.addActionListener(eventos);
      btSair.addActionListener(eventos);
      for(int i=0;i<9;i++){
         botoes[i].addActionListener(eventos);
      }
   }
   
   protected void vencedor(){
         if( (botoes[0].getPartido()=='g') && (botoes[1].getPartido()=='g') && (botoes[2].getPartido() == 'g') ){
            JOptionPane.showMessageDialog(null,"YAAAAAAAAH!!!\nGALOOOOOOOO!!!");
            novoJogo();
         }
         else if( (botoes[0].getPartido()=='m') && (botoes[1].getPartido()=='m') && (botoes[2].getPartido() == 'm') ){
            JOptionPane.showMessageDialog(null,"Epah...\nGanha a estrela.");
            novoJogo();
         }
         else if( (botoes[3].getPartido()=='g') && (botoes[4].getPartido()=='g') && (botoes[5].getPartido() == 'g') ){
            JOptionPane.showMessageDialog(null,"YAAAAAAAAH!!!\nGALOOOOOOOO!!!");
            novoJogo();
         }
         else if( (botoes[3].getPartido()=='m') && (botoes[4].getPartido()=='m') && (botoes[5].getPartido() == 'm') ){
            JOptionPane.showMessageDialog(null,"Epah...\nGanha a estrela.");
            novoJogo();
         }
         else if( (botoes[6].getPartido()=='g') && (botoes[7].getPartido()=='g') && (botoes[8].getPartido() == 'g') ){
            JOptionPane.showMessageDialog(null,"YAAAAAAAAH!!!\nGALOOOOOOOO!!!");
            novoJogo();
         }
         else if( (botoes[6].getPartido()=='m') && (botoes[7].getPartido()=='m') && (botoes[8].getPartido() == 'm') ){
            JOptionPane.showMessageDialog(null,"Epah...\nGanha a estrela.");
            novoJogo();
         }
         else if( (botoes[0].getPartido()=='g') && (botoes[3].getPartido()=='g') && (botoes[6].getPartido() == 'g') ){
            JOptionPane.showMessageDialog(null,"YAAAAAAAAH!!!\nGALOOOOOOOO!!!");
            novoJogo();
         }
         else if( (botoes[0].getPartido()=='m') && (botoes[3].getPartido()=='m') && (botoes[6].getPartido() == 'm') ){
            JOptionPane.showMessageDialog(null,"Epah...\nGanha a estrela.");
            novoJogo();
         }
         else if( (botoes[1].getPartido()=='g') && (botoes[4].getPartido()=='g') && (botoes[7].getPartido() == 'g') ){
            JOptionPane.showMessageDialog(null,"YAAAAAAAAH!!!\nGALOOOOOOOO!!!");
            novoJogo();
         }
         else if( (botoes[1].getPartido()=='m') && (botoes[4].getPartido()=='m') && (botoes[7].getPartido() == 'm') ){
            JOptionPane.showMessageDialog(null,"Epah...\nGanha a estrela.");
            novoJogo();
         }
         else if( (botoes[2].getPartido()=='g') && (botoes[5].getPartido()=='g') && (botoes[8].getPartido() == 'g') ){
            JOptionPane.showMessageDialog(null,"YAAAAAAAAH!!!\nGALOOOOOOOO!!!");
            novoJogo();
         }
         else if( (botoes[2].getPartido()=='m') && (botoes[5].getPartido()=='m') && (botoes[8].getPartido() == 'm') ){
            JOptionPane.showMessageDialog(null,"Epah...\nGanha a estrela.");
            novoJogo();
         }
         else if( (botoes[0].getPartido()=='g') && (botoes[4].getPartido()=='g') && (botoes[8].getPartido() == 'g') ){
            JOptionPane.showMessageDialog(null,"YAAAAAAAAH!!!\nGALOOOOOOOO!!!");
            novoJogo();
         }
         else if( (botoes[0].getPartido()=='m') && (botoes[4].getPartido()=='m') && (botoes[8].getPartido() == 'm') ){
            JOptionPane.showMessageDialog(null,"Epah...\nGanha a estrela.");
            novoJogo();
         }
         else if( (botoes[2].getPartido()=='g') && (botoes[4].getPartido()=='g') && (botoes[6].getPartido() == 'g') ){
            JOptionPane.showMessageDialog(null,"YAAAAAAAAH!!!\nGALOOOOOOOO!!!");
            novoJogo();
         }
         else if( (botoes[2].getPartido()=='m') && (botoes[4].getPartido()=='m') && (botoes[6].getPartido() == 'm') ){
            JOptionPane.showMessageDialog(null,"Epah...\nGanha a estrela.");
            novoJogo();
         }
   }
   
   private class TrataEventos implements ActionListener{
      public void actionPerformed( ActionEvent evento ){
         if( evento.getSource() == btNovoJogo ){
            novoJogo();
         }
         if( evento.getSource() == btSair ){
            dispose();
            System.exit(1);
         }
         for(int i=0;i<9;i++){
            if( evento.getSource() == botoes[i] ){
               if( botoes[i].getEstado() ){
                  JOptionPane.showMessageDialog(null,"O Espaco esta preenchido!\nEscolha outro.");
                  return;
               }
               botoes[i].setIcon(escolheIcone());
               botoes[i].preencheBotao(true);
               botoes[i].setPartido( escolhePartido() );
               vez = !vez;
               jogadas++;
               vencedor();
               if(jogadas==9){
                  JOptionPane.showMessageDialog(null,"Empate!");
                  novoJogo();
               }
            }
         }
      }
   }

   public static void main( String args[] ){
      new JacorDois();
   }
}
