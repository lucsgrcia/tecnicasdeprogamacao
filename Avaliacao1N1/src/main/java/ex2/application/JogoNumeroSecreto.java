/*
 * Copyright (C) 2024 Lucas Garcia <lucas.garciadelacerda@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ex2.application;

import ex2.entities.NumeroSecreto;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia <lucas.garciadelacerda@gmail.com>
 * @date 19/09/2024
 * @brief Class JogoNumeroSecreto
 */
public class JogoNumeroSecreto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumeroSecreto ns = new NumeroSecreto();
        
        ns.sortear();
        
        long resultado;
        
        do {
            System.out.println("Forneça um palpite de número de 0 a 100:");
            int palpite = sc.nextInt();
            resultado = ns.adivinhar( palpite );
          
            if(resultado==-2){
                System.out.println("número não foi sorteado ainda");
                break;
            }
            else if ( resultado < 0 )
                System.out.println("O palpite é menor que o número sorteado");
            else if ( resultado > 0 )
                System.out.println("O palpite é maior que o número sorteado");      
            else if ( resultado == 0 )
                System.out.println("Acertou, parabéns!");            
        } while ( resultado != 0 );
    }
 }