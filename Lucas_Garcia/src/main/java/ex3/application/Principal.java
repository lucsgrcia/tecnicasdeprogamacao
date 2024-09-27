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

package ex3.application;
import java.util.Scanner;
import ex3.entities.Lista;
import ex3.entities.ListaOrdenada;

/**
 *
 * @author Lucas Garcia e Natanel Silva
 * @date 25/09/2024
 * @brief Class Principal
 *
 **/

public class Principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        ListaOrdenada listaOrdenada = new ListaOrdenada();
        int opcao=1;
        
        while(opcao>0 && opcao<6){
            
            System.out.println("\n--------MENU--------\n"
                    + "(1) Adicionar numero\n"
                    + "(2) Remover numero\n"
                    + "(3) Informar quantidade de numeros\n"
                    + "(4) Informar posicao do numero\n"
                    + "(5) Exibir todos os numeros\n"
                    + "(6) Sair");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    {
                        System.out.println("\n--------Adicionar numero--------");
                        System.out.print("Digite o numero: ");
                        int num = sc.nextInt();
                        lista.addNum(num);
                        break;
                    }
                case 2:
                    {
                        System.out.println("\n--------Remover numero--------");
                        System.out.print("Digite o numero: ");
                        int num = sc.nextInt();
                        lista.removeNum(num);
                        break;
                    }
                case 3:
                    System.out.println("\n--------Informar quantidade de numeros--------");
                    System.out.println(lista.qtdNum()+" numeros");
                    break;
                case 4:
                    {
                        System.out.println("\n--------Informar posicao do numero--------");
                        System.out.print("Digite o numero: ");
                        int num = sc.nextInt();
                        if(lista.posicaoNum(num)==-1){
                            System.out.println("Nao possui esse numero na lista");
                        }else{
                            System.out.println("Posicao: "+lista.posicaoNum(num));
                        }                        
                        break;
                    }
                case 5:
                    System.out.println("\n--------Exibir numeros--------");
                    listaOrdenada.ordenarLista(lista.getList());
                    lista.exibir();
                    listaOrdenada.exibir();
                    break;
                default:
                    break;
            }
        }
    }
}