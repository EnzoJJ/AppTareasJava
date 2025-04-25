package app;
import java.util.ArrayList;
import java.util.List;

public class AdminTarea {
    private List<Tarea> tareas=new ArrayList<>();

    public void addTarea(String titulo, String descripcion){
        tareas.add(new Tarea(titulo, descripcion));
    }

    public void listarTareas(){
        for(int i=0; i<tareas.size(); i++){
            System.out.println(i+ ": "+tareas.get(i));
        }
    }
    public void finalizarTarea(int index){
        if(index>=0 && index<tareas.size()){
            tareas.get(index).finalizar();
        }
    }
    public void editarTarea(int index, String nuevoTitulo, String nuevaDescripcion){
        if(index>=0 && index<tareas.size()){
            tareas.get(index).editar(nuevoTitulo, nuevaDescripcion);
        }
    }
    public void eliminarTarea(int index){
        if(index>=0 && index<tareas.size()){
            tareas.remove(index);
        }
    }
    public List<Tarea> getTasks() {
        return new ArrayList<>(tareas); // devuelve una copia
    }
    
}
