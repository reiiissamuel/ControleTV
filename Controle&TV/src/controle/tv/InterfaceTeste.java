/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.tv;

import java.util.Scanner;


public class InterfaceTeste {
    private Scanner entrada;
    private ControleRemoto controle;
    
    public InterfaceTeste(){
        entrada = new Scanner(System.in);
        controle = new ControleRemoto();
    }
    
    
    public void inicializadorTeste(){
      int decisao;
        
        System.out.println("---------- CONTROLE REMOTO ----------");
        System.out.println("1 - Canal UP.");
        System.out.println("2 - Canal DOWN.");
        System.out.println("3 - Volume UP.");
        System.out.println("4 - Volume DOWN.");
        System.out.println("5 - Selecionar um canal");
        System.out.println("0 - Ligar/Desligar");
        
        System.out.println("------------------------------");
        decisao = entrada.nextInt();
        
        switch(decisao){
            case 1:
                controle.addCanal();
                inicializadorTeste();
                break;
            case 2:
                controle.subCanal();
                inicializadorTeste();
                break;
            case 3:
                controle.addVolume();
                inicializadorTeste();
                break;
            case 4:
                controle.subVolume();
                inicializadorTeste();
                break;
            case 5:
                System.out.println("digite o canal desejado:");
                int j;
                controle.setCanal(j = entrada.nextInt());
                inicializadorTeste();
                break;
            case 0:
                break;
            default:
                System.out.println("\n");
        }
  }
}


