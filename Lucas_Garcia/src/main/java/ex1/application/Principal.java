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

package ex1.application;
import java.util.Scanner;
import ex1.entities.Peca;
import ex1.entities.PecaImportada;

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
        Peca pc = new Peca();
        PecaImportada pcimp = new PecaImportada();
        
        System.out.println("(1)Peca Nacional\n(2)Peca Importada");
        int op = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Digite o nome da peca: ");
        String nome = sc.nextLine();
        System.out.print("Digite o custo da peca: ");
        float custo = sc.nextFloat();
        System.out.print("Digite o lucro da peca: ");
        float lucro = sc.nextFloat();
        
        if(op==2){
            System.out.print("Digite a taxa de importacao (%): ");
            float tximp = sc.nextFloat();
            System.out.print("Digite o valor do frete: ");
            float frete = sc.nextFloat();
            
            pcimp = new PecaImportada (nome,custo,lucro,tximp,frete);
            pcimp.exibir();            
            
            System.out.println("Custo final: RS "+ pcimp.calcularPreco());
        }else{
            
            pc = new Peca(nome,custo,lucro);
            pc.exibir();
            System.out.println("Custo final: RS "+ pc.calcularPreco());
        }
    }
}