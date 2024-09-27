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
 * @brief Class ProdutoNacional
 *
 **/

public class ProdutoNacional extends ProdutoEstadual {
    
    private double taxa;
    
    public ProdutoNacional(){
        
    }
    
    public ProdutoNacional(String descricao, double valor){
        
        super(descricao,valor);
        this.taxa = 5;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    @Override
    public double calcularPrecoFinal(){
        
        return super.calcularPrecoFinal() * (1+ taxa/100);
    }
    
    @Override    
    public String toString(){
        
        return "Descricao: " + super.getDescricao()
                + "\nValor: RS " + String.format("%.2f", super.getValor())
                + "\nImposto: " + String.format("%.2f", super.getImposto()) + "%"
                + "\nTaxa: " + String.format("%.2f", taxa) + "%";
    }
}