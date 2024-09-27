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
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import ex2.entities.ProdutoEstadual;
import ex2.entities.ProdutoImportado;
import ex2.entities.ProdutoNacional;

/**
 *
 * @author Lucas Garcia e Natanel Silva
 * @date23/09/2024
 * @brief Class Principal
 *
 **/
public class Principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ProdutoEstadual pE = new ProdutoEstadual();
        ProdutoImportado pI = new ProdutoImportado();
        ProdutoNacional pN = new ProdutoNacional();
        
        List<ProdutoEstadual> listPE = new ArrayList();
        List<ProdutoImportado> listPI = new ArrayList();
        List<ProdutoNacional> listPN = new ArrayList();
        
        int opcao = 1;
        while(opcao!=9) {
            System.out.println("\nMENU"
                    + "\n1 - Cadastrar Produto Estadual"
                    + "\n2 - Cadastrar Produto Nacional"
                    + "\n3 - Cadastrar Produto Importado"
                    + "\n4 - Exibir Produtos Estaduais"
                    + "\n5 - Exibir Produtos Nacionais"
                    + "\n6 - Exibir Produtos Importados"
                    + "\n7 - Exibir Todos os Produtos"
                    + "\n9 - SAIR");
             opcao = sc.nextInt();
             
             while(opcao<1 || opcao==8 || opcao>9){
                 System.out.println("Digite uma opcao valida!");
                 opcao = sc.nextInt();
             }
            
            switch (opcao) {
                case 1:
                case 2:
                case 3:
                    sc.nextLine();
                    System.out.print("Descricao do produto: ");
                    String descricao = sc.nextLine();
                    System.out.print("Valor: RS ");
                    double preco = sc.nextDouble();
                    switch (opcao) {
                        case 1:
                            pE = new ProdutoEstadual(descricao,preco);
                            listPE.add(pE);
                            break;
                        case 2:
                            pN = new ProdutoNacional(descricao,preco);
                            listPN.add(pN);
                            break;
                        default:
                            pI = new ProdutoImportado(descricao,preco);
                            listPI.add(pI);
                            break;
                    }   break;
                case 4:
                case 5:
                case 6:
                    switch (opcao){
                        case 4:
                            for(ProdutoEstadual x : listPE){
                                System.out.println("\n"+x);
                                System.out.println("Custo final: RS " + String.format("%.2f", x.calcularPrecoFinal()));
                            }
                            break;
                        case 5:
                            for(ProdutoNacional x : listPN){
                                System.out.println("\n"+x);
                                System.out.println("Custo final: RS " + String.format("%.2f", x.calcularPrecoFinal()));
                                
                            }
                            break;
                        case 6:
                            for(ProdutoImportado x : listPI){
                                System.out.println("\n"+x);
                                System.out.println("Custo final: RS " + String.format("%.2f", x.calcularPrecoFinal()));
                            }
                            break;
                    }   break;
                case 7:
                    System.out.println("\n--------Produtos Estaduais--------");
                    for(ProdutoEstadual x : listPE){
                        System.out.println("\n"+x);
                        System.out.println("Custo final: RS " + String.format("%.2f", x.calcularPrecoFinal()));
                    }
                    
                    System.out.println("\n--------Produtos Nacionais--------");
                    for(ProdutoNacional x : listPN){
                        System.out.println("\n"+x);
                        System.out.println("Custo final: RS " + String.format("%.2f", x.calcularPrecoFinal()));
                    }
                    
                    System.out.println("\n--------Produtos Importados--------");
                    for(ProdutoImportado x : listPI){
                        System.out.println("\n"+x);
                        System.out.println("Custo final: RS " + String.format("%.2f", x.calcularPrecoFinal()));
                    }   break;
                default:
                    break;
            }
        }
    }
}