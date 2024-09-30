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

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Lucas Garcia <lucas.garciadelacerda@gmail.com>
 * @date 30/09/2024
 * @brief Class Post
 *
 **/

public class Post {
    
    private Date moment;
    private String title,content;
    private int likes;
    private List<Comment> comments = new ArrayList<>();
    
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Post(Date moment, String content, String title, int likes) {
        this.moment = moment;
        this.content = content;
        this.title = title;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComment() {
        return comments;
    }

    public void setComment(List<Comment> comment) {
        this.comments = comment;
    }

    public void addComments(Comment comment){
        
        comments.add(comment);
    }
    
    public void removeComments(Comment comment){
        
        comments.remove(comment);
    }
    
    private String dateFormatter(){
        
        LocalDateTime date;
        date = moment.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        String formattedDate = date.format(fmt);
        return formattedDate;
    }
    
    public void exibir(){
        
        System.out.println(title);
        System.out.print(likes + " Likes");
        System.out.println(" - " + dateFormatter());
        System.out.println(content);
        System.out.println("Comments:");
        for (Comment c : comments) {
            System.out.println(c.getText());         
        }
    }
}