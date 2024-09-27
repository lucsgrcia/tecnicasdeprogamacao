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

package ex3.entities;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Lucas Garcia e Natanel Silva
 * @date 25/09/2024
 * @brief Class Lista
 *
 **/

public class Lista {
    
    private List<Integer> lista;
    
    public Lista(){
        lista = new ArrayList<>();
    }
    
    public List<Integer> getList() {
        return lista;
    }

    public void setList(List<Integer> list) {
        this.lista = list;
    }
    
    public void addNum(int num){
        lista.add(num);
    }
    
    public void removeNum(int num){        
        for (Integer x : lista) {            
            if(num == x){
                lista.remove(x);
            }
        }        
    }
    
    public int qtdNum(){
        return lista.size();
    }
    
    public int posicaoNum(int num){
        
        for (Integer x : lista) {
            
            if(num == x){
                return lista.indexOf(num);
            }
        }
        return -1;    
    }
    
    public void exibir(){        
        System.out.println("Lista Original:");
        for (Integer x : lista) {
            System.out.println(x);
        }
    }
}