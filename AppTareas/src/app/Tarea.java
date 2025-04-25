package app;
public class Tarea {
    private String titulo;
    private String descripcion;
    private boolean finalizada;

    public Tarea(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.finalizada = false;
    }

    public void finalizar() {
        this.finalizada = true;
    }

    public void editar(String nuevoTitulo, String nuevaDescripcion) {
        this.titulo = nuevoTitulo;
        this.descripcion = nuevaDescripcion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public boolean isCompletada() {
        return finalizada;
    }
    @Override
    public String toString() {
        String estado = finalizada ? "✔ Finalizada" : "⏳ Pendiente";
        return String.format("[%s] %s: %s", estado, titulo, descripcion);
    }
}
