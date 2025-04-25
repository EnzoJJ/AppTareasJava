package app.controller;

import app.Tarea;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class TareaController {
    @FXML private TextField tituloField;
    @FXML private TextField descripcionField;
    @FXML private ListView<Tarea> tareasListView;

    private ObservableList<Tarea> tareasList = FXCollections.observableArrayList();
    
    @FXML
    private void addTarea() {
        String title = tituloField.getText();
        String desc = descripcionField.getText();
        if (!title.isEmpty()) {
            Tarea tarea = new Tarea(title, desc);
            tareasList.add(tarea);
            tituloField.clear();
            descripcionField.clear();
            updateList();
        }
    }

    @FXML
    private void finalizarTarea() {
        int index = tareasListView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            Tarea tarea = tareasList.get(index);
            tarea.finalizar();  // Marcar como completada
            updateList();       // Refrescar para que se vea "(Completada)"
        }
    }

    @FXML
    private void handleEditTask() {
        int index = tareasListView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            Tarea tarea = tareasList.get(index);
            tarea.editar(tituloField.getText(), descripcionField.getText());
            updateList();
        }
    }

    @FXML
    private void handleDeleteTask() {
        int index = tareasListView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            tareasList.remove(index);
            updateList();
        }
    }

    private void updateList() {
        tareasListView.setItems(null); // Forzar refresco visual
        tareasListView.setItems(tareasList);
    }
}
