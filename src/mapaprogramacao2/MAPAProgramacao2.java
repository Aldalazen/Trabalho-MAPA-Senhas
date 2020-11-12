/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapaprogramacao2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Aldalazen
 */
public class MAPAProgramacao2 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int contador = 0;
        
        // TODO code application logic here
        ArrayList<String> filaDeAtendimento = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        int op = 0;
        int repetir = 1;
        
        
        do {
        
        System.out.println("Selecione a opcao 1, 2 ou 3");
        op = sc.nextInt();
                
        if (op==1){
            contador = contador+1;
            filaDeAtendimento.add("N"+String.valueOf(contador));
        }
        else if (op==2){
            contador = contador+1;
            filaDeAtendimento.add("R"+String.valueOf(contador));
        }
        
        else if (op==3){
            contador = contador+1;
            filaDeAtendimento.add("P"+String.valueOf(contador));
        }
        
        System.out.println("Digite 0 para encerrar ou outro numero qualquer para continuar");
        repetir = sc.nextInt();
             
        
        }while(repetir != 0);
        
        for (int i = 0; i<filaDeAtendimento.size(); i++ ){
            System.out.println(filaDeAtendimento.get(i));
            
        }
        
        
        System.out.println("Letra para buscar N, R ou P");
        sc.nextLine();
        String letra = sc.nextLine();
        boolean continuarBuscando = true;
        
        while(continuarBuscando){
        
            for (int j = 0; j<filaDeAtendimento.size(); j++) {
                String senha = letra+String.valueOf(j);


                 for (int k = 0; k<filaDeAtendimento.size(); k++){
                    String temp = filaDeAtendimento.get(k);
                    if (senha.equals(temp)){
                        System.out.println("A Senha " + senha +" foi encontrada no índíce " + j);
                        continuarBuscando = false;

                    }
                    
                }
                 if (continuarBuscando == false){
                     break;
                 }
            }

        }

    }
}