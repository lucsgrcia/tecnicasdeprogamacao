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
 * @brief Class ListaOrdenada
 *
 **/

public class ListaOrdenada extends Lista {
    
    private List<Integer> listaOrdenada;
    
    public ListaOrdenada(){
        super();
        listaOrdenada = new ArrayList<>();
    }

    public List<Integer> getListaOrdenada() {
        return listaOrdenada;
    }

    public void setListaOrdenada(List<Integer> listaOrdenada) {
        this.listaOrdenada = listaOrdenada;
    }

    public void ordenarLista(List<Integer> lista) {
        
        listaOrdenada.clear();
        listaOrdenada.addAll(lista);
        for (int i = 0; i < listaOrdenada.size(); i++) {
            for (int j = i; j < listaOrdenada.size(); j++) {
                if (listaOrdenada.get(i) > listaOrdenada.get(j)) {
                    int temp = listaOrdenada.get(i);
                    listaOrdenada.set(i, listaOrdenada.get(j));
                    listaOrdenada.set(j, temp);
                }
            }
        }        
    }
    
    @Override
    public void exibir(){
        
        System.out.println("Lista Ordenada:");
        for (Integer x : listaOrdenada) {
            System.out.println(x);
        }
    }
}