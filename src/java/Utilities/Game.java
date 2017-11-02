/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author Ge Wang
 */

import java.beans.*;
import java.io.Serializable;


public class Game implements Serializable {
    private int id;
    private String name;
    private String category;
    private String description;
    private Double price;
    private int copies;

    public Game() {
        this.name = "";
        this.category = "";
        this.description = "";
        this.copies = 0;
        this.price = 0.0;
    }

    public Game(String name, String category, String description, Double price, int copies) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.copies = copies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
