/*


*/

import javax.swing.*;

public class BotaoJogo extends JToggleButton{
   
   private boolean estado;    //esta variavel de instancia vai indicar se o espaco esta preenchido ou nao.
   private char partido;
   
   public BotaoJogo(){
      super();
   }
   
   public boolean getEstado(){
      return estado;
   }
   
   public void preencheBotao( boolean estado ){
      this.estado = estado;
   }
   
   public void setPartido( char partido ){
      this.partido = partido;
   }
   
   public char getPartido(){
      return partido;
   }
}
