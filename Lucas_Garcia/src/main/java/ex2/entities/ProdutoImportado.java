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
 * @brief Class ProdutoImportado
 *
 **/

public class ProdutoImportado extends ProdutoNacional{
    
    private double taxaImportacao;
    
    public ProdutoImportado(){
        
    }
    
    public ProdutoImportado(String descricao, double valor){
        
        super(descricao, valor);
        this.taxaImportacao = 5;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
    
    @Override
    public double calcularPrecoFinal(){
        
        return super.calcularPrecoFinal() * (1 + taxaImportacao/100);
    }
    
    @Override
    public String toString(){
        
        return "Descricao: " + super.getDescricao()
                + "\nValor: RS " + String.format("%.2f", super.getValor())
                + "\nImposto: " + String.format("%.2f", super.getImposto()) + "%"
                + "\nTaxa: "+ String.format("%.2f", super.getTaxa())+ "%"
                + "\nTaxa de Importacao: " + String.format("%.2f", taxaImportacao)+ "%";
    }
}