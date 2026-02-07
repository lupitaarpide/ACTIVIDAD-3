package Semana4.Ejercicios;

public class Libro {

    private String titulo;
    private String autor;
    private int totalEjemplares;
    private int ejemplaresPrestados;

    public Libro(String titulo, String autor, int totalEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalEjemplares = totalEjemplares;
        this.ejemplaresPrestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getTotalEjemplares() {
        return totalEjemplares;
    }
    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTotalEjemplares(int totalEjemplares) {
        this.totalEjemplares = totalEjemplares;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }


    public boolean prestar() {
        if (totalEjemplares - ejemplaresPrestados > 0) {
            ejemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true;
        }
        return false;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total: " + totalEjemplares);
        System.out.println("Prestados: " + ejemplaresPrestados);
        System.out.println("Disponibles: " + (totalEjemplares - ejemplaresPrestados));
    }
}