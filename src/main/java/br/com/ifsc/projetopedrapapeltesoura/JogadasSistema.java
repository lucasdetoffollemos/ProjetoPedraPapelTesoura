/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifsc.projetopedrapapeltesoura;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class JogadasSistema { 
    
    public String[] Jogar(String jogadaPlayer){  
        String [] array = new String[2];
        
        String jogadaMaquina = JogoDaMaquina();
        if(jogadaPlayer != null){
            if(jogadaPlayer.equals(MenuJFrame.traducoes.getString("PEDRA")) && 
                    jogadaMaquina.equals(MenuJFrame.traducoes.getString("PEDRA"))){
                array[0] = MenuJFrame.traducoes.getString("EMPATE");
                array[1] = MenuJFrame.traducoes.getString("PEDRA");
                return array;
            }
        
            if(jogadaPlayer.equals(MenuJFrame.traducoes.getString("PAPEL")) 
                    && jogadaMaquina.equals(MenuJFrame.traducoes.getString("PAPEL"))){
                 array[0] = MenuJFrame.traducoes.getString("EMPATE");
                array[1] = MenuJFrame.traducoes.getString("PAPEL");
                return array;
            }

            if(jogadaPlayer.equals(MenuJFrame.traducoes.getString("TESOURA")) 
                    && jogadaMaquina.equals(MenuJFrame.traducoes.getString("TESOURA"))){
                array[0] = MenuJFrame.traducoes.getString("EMPATE");
                array[1] = MenuJFrame.traducoes.getString("TESOURA");
                return array;
            }

            if(jogadaPlayer.equals(MenuJFrame.traducoes.getString("PEDRA")) 
                    && jogadaMaquina.equals(MenuJFrame.traducoes.getString("PAPEL"))){
                array[0] = MenuJFrame.traducoes.getString("JOGADOR_GANHA");
                array[1] = MenuJFrame.traducoes.getString("PAPEL");
                return array;

            }

            if(jogadaPlayer.equals(MenuJFrame.traducoes.getString("PEDRA")) 
                    && jogadaMaquina.equals(MenuJFrame.traducoes.getString("TESOURA"))){
                array[0] = MenuJFrame.traducoes.getString("JOGADOR_GANHA");
                array[1] = MenuJFrame.traducoes.getString("TESOURA");
                return array;

            }

            if(jogadaPlayer.equals(MenuJFrame.traducoes.getString("PAPEL")) 
                    && jogadaMaquina.equals(MenuJFrame.traducoes.getString("PEDRA"))){
                array[0] = MenuJFrame.traducoes.getString("JOGADOR_GANHA");
                array[1] = MenuJFrame.traducoes.getString("PEDRA");
                return array;
            }

            if(jogadaPlayer.equals(MenuJFrame.traducoes.getString("PAPEL")) 
                    && jogadaMaquina.equals(MenuJFrame.traducoes.getString("TESOURA"))){
                array[0] = MenuJFrame.traducoes.getString("SISTEMA_GANHA");
                array[1] = MenuJFrame.traducoes.getString("TESOURA");
                return array;
            }

            if(jogadaPlayer.equals(MenuJFrame.traducoes.getString("TESOURA")) && 
                    jogadaMaquina.equals(MenuJFrame.traducoes.getString("PEDRA"))){
                array[0] = MenuJFrame.traducoes.getString("SISTEMA_GANHA");
                array[1] = MenuJFrame.traducoes.getString("PEDRA");
                return array;
            }

            if(jogadaPlayer.equals(MenuJFrame.traducoes.getString("TESOURA")) 
                    && jogadaMaquina.equals(MenuJFrame.traducoes.getString("PAPEL"))){
                array[0] = MenuJFrame.traducoes.getString("SISTEMA_GANHA");
                array[1] = MenuJFrame.traducoes.getString("PAPEL");
                return array;
            }
        }
        
   
        return null;
    }

    private String JogoDaMaquina() {
       Random r = new Random();
         
       int valor = r.nextInt(3);
       
       if(valor == 0)
           return MenuJFrame.traducoes.getString("PEDRA");
       else if(valor == 1)
           return MenuJFrame.traducoes.getString("PAPEL");
       else
           return MenuJFrame.traducoes.getString("TESOURA");
    }
}
