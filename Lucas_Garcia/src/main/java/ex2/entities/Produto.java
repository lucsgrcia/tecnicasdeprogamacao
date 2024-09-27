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

package ex2.entities;

/**
 *
 * @author Lucas Garcia e Natanel Silva
 * @date23/09/2024
 * @brief Class Produto
 *
 **/

public class Produto {
    
    private String descricao;
    private double valor, imposto;
    
    public Produto(){
        
    }
    
    public Produto(String descricao, double valor, double imposto){
        
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double calcularPrecoFinal(){
        
        return (1 + (imposto/100))*valor;
    }

    @Override
    public String toString() {
        
        return "Descricao: " + descricao
                + "\nValor: RS " + String.format("%.2f", valor)
                + "\nImposto: " + String.format("%.2f", imposto) + "%";
    }
}