/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author PC
 */
public class Buku extends Mahasiswa{
    public String title;
    public String Author;

    /**
     * @return the title
     */
    public Buku(String title, String Author){
        super();
        this.title = title;
        this.Author= Author;
    }
   
    public String toString(){
        return(super.toString() + "Title: " + this.title + "\n"
                + "Author: " + Author);
    }
}
