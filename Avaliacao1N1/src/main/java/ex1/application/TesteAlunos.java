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

import ex1.entities.Aluno;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia <lucas.garciadelacerda@gmail.com>
 * @date 19/09/2024
 * @brief Class TesteAlunos
 */

public class TesteAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos alunos serao cadastrados?");
        int qtde = sc.nextInt();
        sc.nextLine();
        
        Aluno[] aluno = new Aluno[qtde];
        
        for(int i=0; i<qtde; i++){
            sc.nextLine();
            System.out.println("Informe a nota " + (i+1) + " do " + (i+1) + "° aluno");
            Double n1 = (sc.nextDouble());
            System.out.println("Informe a nota " + (i+2) + " do " + (i+1) + "° aluno");
            Double n2 = (sc.nextDouble());
            System.out.println("Informe a nota " + (i+3) + " do " + (i+1) + "° aluno");
            Double n3 = (sc.nextDouble());
            System.out.println("Informe a nota " + (i+4) + " do " + (i+1) + "° aluno");
            Double n4 = (sc.nextDouble());
            
            aluno[i] = new Aluno(n1, n2, n3, n4);
            aluno[i].media();
        }
        
        System.out.println(String.format("A media geral dos alunos é: %.2f",Aluno.media_total()));        
        Aluno a1, a2, a3;

        a1 = new Aluno();
        System.out.println("Informe a nota1 do primeiro aluno");
        a1.setN1(sc.nextDouble());
        System.out.println("Informe a nota2 do primeiro aluno");
        a1.setN2(sc.nextDouble());
        System.out.println("Informe a nota3 do primeiro aluno");
        a1.setN3(sc.nextDouble());
        System.out.println("Informe a nota4 do primeiro aluno");
        a1.setN4(sc.nextDouble());

        a2 = new Aluno();
        System.out.println("Informe a nota1 do segundo aluno");
        a2.setN1(sc.nextDouble());
        System.out.println("Informe a nota2 do segundo aluno");
        a2.setN2(sc.nextDouble());
        System.out.println("Informe a nota3 do segundo aluno");
        a2.setN3(sc.nextDouble());
        System.out.println("Informe a nota4 do segundo aluno");
        a2.setN4(sc.nextDouble());

        a3 = new Aluno();
        System.out.println("Informe a nota1 do terceiro aluno");
        a3.setN1(sc.nextDouble());
        System.out.println("Informe a nota2 do terceiro aluno");
        a3.setN2(sc.nextDouble());
        System.out.println("Informe a nota3 do terceiro aluno");
        a3.setN3(sc.nextDouble());
        System.out.println("Informe a nota4 do terceiro aluno");
        a3.setN4(sc.nextDouble());
        
        a1.media();
        a2.media();
        a3.media();
        
        System.out.println(String.format("A media geral dos alunos é: %.2f",Aluno.media_total()));

    }
}