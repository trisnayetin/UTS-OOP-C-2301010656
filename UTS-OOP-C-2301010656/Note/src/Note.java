/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elda
 */
public class Note {
    private String isi;

    public Note() {
        this.isi = "";
    }

    public Note(String isi) {
        this.isi = isi;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    @Override
    public String toString() {
        return isi;
    }
}

