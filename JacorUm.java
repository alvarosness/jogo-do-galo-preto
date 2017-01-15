import java.util.Random;
import java.awt.event.*;
import javax.swing.*;

public class JacorUm extends JacorDois{
    
   protected Random aleatorio = new Random();	
	
   public JacorUm(){
      super();
   }
   
   private void accoes(){
      TrataEventos eventos = new TrataEventos();
      btNovoJogo.addActionListener(eventos);
      btSair.addActionListener(eventos);
      for(int i=0;i<9;i++){
         botoes[i].addActionListener(eventos);
         pcJogando();
         //jogadas++;
      }
   }
   
   protected void pcJogando(){
      int i = 0;
      while(true){
      	 i = aleatorio.nextInt(9);
         if(botoes[i].getEstado()){
            ;
         }
         else{
           botoes[i].doClick();
           return;
         }
      }
      
     // botoes[i].setIcon( escolheIcone() );
     // botoes[i].preencheBotao( true );
     // botoes[i].setPartido( escolhePartido() );
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
               //pcJogando();
               //jogadas++;
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
      new JacorUm();
   }
}
