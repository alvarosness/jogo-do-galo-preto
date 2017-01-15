import javax.swing.*;
import java.awt.event.*;

class Botao{
   private JButton botao;
   private boolean preenchido;
   private char partido;
   
   public Botao(){
      setPreenchido(false);
      setPartido(' ');
   }
   
   public JButton getBotao(){
      return botao;
   }
   
   public boolean getPreenchido(){
      return preenchido;
   }
   
   public char getPartido(){
      return partido;
   }
   
   public void setPreenchido( boolean preenchido ){
      this.preenchido = preenchido;
   }
   
   public void setPartido( char partido ){
      this.partido = partido;
   }
   
   public void click(Icon icone){
      botao.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent ecvt){
               botao.setIcon(icone);
            }
         }
      );
   }
}
