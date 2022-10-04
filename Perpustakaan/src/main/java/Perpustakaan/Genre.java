/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author PC
 */
public class Genre extends Mahasiswa{
    public String genre;

    
    public Genre(String genre){
        super();
        this.genre = genre;
    }
    @Override
    public String toString(){
        return(super.toString() + "Genre " + this.genre);
    }
    
}
