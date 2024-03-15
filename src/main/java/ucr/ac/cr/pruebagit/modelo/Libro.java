/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.pruebagit.modelo;

/**
 *
 * @author Estudiante
 */
public class Libro {
    
    private String bookId;
    private String nombre;
    private String autor;

    public Libro() {
        
    }

    public Libro(String bookId, String nombre, String autor) {
        this.bookId = bookId;
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
