
package controle.tv;

import java.io.Serializable;

// Classe para representar o controle remoto de uma televisao
 
public class ControleRemoto implements Serializable
{
 
   // Identificador de serialicacao da classe
 
  private static final long serialVersionUID = 1L;
  
 
   // Instancia da televisao controlada pelo controle remoto
  
  private Televisao televisao;
  
 
  // Construtor padrao
  
  public ControleRemoto()
  {
    this.televisao = new Televisao();
  }
  
  
  // Incrementar o canal em uma unidade
  
  public void addCanal()
  {
    this.televisao.addCanal();
  }


 //Incrementar o volume em uma unidade
 
  public void addVolume()
  {
    this.televisao.addVolume();
  }
  
   //Retornar o canal atual da televisao
   
  public int getCanal()
  {
    return this.televisao.getCanal();
  }

   // Retornar o volume atual da televisao
   
  public int getVolume()
  {
    return this.televisao.getVolume();
  }
  
  
    //Configurar o canal atual da televisao
   
  public void setCanal(int canal)
  {
    this.televisao.setCanal(canal);
  }

  
   //Decrementar o canal em uma unidade
   
  public void subCanal()
  {
    this.televisao.subCanal();
  }
  
  
   // Decrementar o volume em uma unidade
  
  public void subVolume()
  {
    this.televisao.subVolume();
  }
}
