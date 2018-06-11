/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.tv;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class Televisao implements Serializable {
  /**
   * Identificada de serialicacao da classe
   */
  private static final long serialVersionUID = 1L;
  private int canal;
  private int volume;
  

    public Televisao(int canal, int volume) {
        setCanal(canal);
        setVolume(volume);
    }
    

    public Televisao() {
        this(0, 0);
    }
    

    public int getCanal() {
        return canal;
    }
    

    public int getVolume() {
        return volume;
    }
    
    public void setCanal(int canal) {
        if ((canal < 1) || (canal > 500)) {
            canal = 1;
        }
        this.canal = canal;
        System.out.println("Canal: " + getCanal());
    }


    private void setVolume(int volume) {
        if ((volume >= 0) && (volume <= 50)) {
            this.volume = volume;
        }

        System.out.println("Volume: " + getVolume());
    }
    

    public void addCanal() {
        setCanal(getCanal() + 1);
    }
    

    public void addVolume() {
        setVolume(getVolume() + 1);
    }
    

    public void subCanal()
  {
    setCanal(getCanal() - 1);
  }
  
  
  public void subVolume()
  {
    setVolume(getVolume() - 1);
  }

  
  
}
