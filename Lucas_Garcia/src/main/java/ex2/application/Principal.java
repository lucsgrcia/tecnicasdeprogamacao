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

import ex2.entities.Post;
import ex2.entities.Comment;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Lucas Garcia <lucas.garciadelacerda@gmail.com>
 * @date 29/09/2024
 * @brief Class Principal
 *
 **/

public class Principal {
    public static void main(String[] args) {      
        
        String title = "Traveling to New Zealand";
        String content = "I'm going to visit this wonderful country!";
        int likes = 12;
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String date = "21/06/2018 13:05:44";
        LocalDateTime date1 = LocalDateTime.parse(date, fmt);
        Date date2 = Date.from(date1.atZone(ZoneId.systemDefault()).toInstant());
        
        Comment comment = new Comment("Have a nice trip");
        Post post = new Post(date2,content,title,likes);
        post.addComments(comment);
        
        comment = new Comment("Wow that's awesome!");
        post.addComments(comment);
        
        post.exibir();
        
        title = "Good night guys";
        content = "See you tomorrow";
        likes = 5;
        
        date = "28/07/2018 23:14:19";
        date1 = LocalDateTime.parse(date, fmt);
        date2 = Date.from(date1.atZone(ZoneId.systemDefault()).toInstant());
        
        comment = new Comment("Good night");
        post = new Post(date2,content,title,likes);
        post.addComments(comment);
        
        comment = new Comment("May the Force be with you");
        post.addComments(comment);
        
        System.out.println("");
        post.exibir();
        
    }
}