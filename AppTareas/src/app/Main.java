package app;
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        AdminTarea admin=new AdminTarea();
        Scanner scanner=new Scanner(System.in);
        int opcion=-1;

        while(opcion!=0){
            System.out.println("\n1. Crear tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Editar tarea");
            System.out.println("5. Eliminar tarea");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion=scanner.nextInt();
            scanner.nextLine();


            switch(opcion){
                case 1:
                    System.out.println("Titulo: ");
                    String titulo=scanner.nextLine();
                    System.out.println("Descripcion: ");
                    String descripcion=scanner.nextLine();
                    admin.addTarea(titulo, descripcion);
                    break;
                case 2:
                    admin.listarTareas();
                    break;
                case 3:
                    System.out.println("Que tarea quieres finalizar?: ");
                    int index=scanner.nextInt();
                    admin.finalizarTarea(index);
                    break;
                case 4:
                    System.out.println("Tarea a editar: ");
                    int indexEdit=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nuevo titulo: ");
                    String nuevoTitulo=scanner.nextLine();
                    System.out.println("Nueva descripcion: ");
                    String nuevaDescripcion=scanner.nextLine();
                    admin.editarTarea(indexEdit, nuevoTitulo, nuevaDescripcion);
                    break;
                case 5:
                    System.out.println("Tarea a eliminar: ");
                    int indexDelete=scanner.nextInt();
                    admin.eliminarTarea(indexDelete);
                    break;
                case 0:
                    System.out.println("Gracias por utilizar esta app");
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
        }
        scanner.close();
    }
}