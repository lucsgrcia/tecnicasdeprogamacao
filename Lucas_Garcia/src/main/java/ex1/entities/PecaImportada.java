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

package ex1.entities;

/**
 *
 * @author Lucas Garcia e Natanel Silva
 * @date23/09/2024
 * @brief Class PecaImportada
 * 
 **/

public class PecaImportada extends Peca {

    private float taxaImportacao, taxaFrete;
    
    public PecaImportada(){
        
    }
    
    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete){
        
        super(nome,lucro,custo);
        this.taxaFrete = taxaFrete;
        this.taxaImportacao = taxaImportacao;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public float getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(float taxaFrete) {
        this.taxaFrete = taxaFrete;
    }
    
    @Override
    public float calcularPreco(){
        
        return super.calcularPreco()*(taxaImportacao/100 + 1) + taxaFrete;
    }

    @Override
    public void exibir(){
        
        System.out.println("Nome: " + super.getNome() + "\nLucro: RS " + super.getLucro() + "\nCusto: RS " + super.getCusto()
                + "\nTaxa de Importacao: RS " + taxaImportacao + "\nTaxa de Frete: RS " + taxaFrete);
    }
}