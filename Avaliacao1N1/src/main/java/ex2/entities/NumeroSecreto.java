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
 * @author Lucas Garcia <lucas.garciadelacerda@gmail.com>
 * @date 19/09/2024
 * @brief Class NumeroSecreto
 */
public class NumeroSecreto {
    private long numeroAleatorio;

    public NumeroSecreto() {
        this.numeroAleatorio = -1;
    }

    public void sortear() {
        this.numeroAleatorio = (Math.round(Math.random() * 100));
    }

    public int adivinhar(long palpite) {
        int retorno;
        if (this.numeroAleatorio == -1) {
            retorno = -2;
        } else if (this.numeroAleatorio > palpite) {
            retorno = -1;
        } else if (this.numeroAleatorio == palpite) {
            retorno = 0;
        } else {
            retorno = 1;
        }

        return retorno;

    }
}