import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Controller implements ColorChangeObserver {

    @FXML
    private Button BtAmarillo;

    @FXML
    private Button BtRosado;

    @FXML
    private Button BtNegro;

    @FXML
    private VBox root_;

    @FXML
    private void botonAmarillo() {
        notifyColor("YELLOW");
    }

    @FXML
    private void botonRosado() {
        notifyColor("PINK");
    }

    @FXML
    private void botonNegro() {
        notifyColor("BLACK");
    }

    @Override
    public void notifyColor(String colorName) {
        root_.setStyle("-fx-background-color: " + colorName + ";");
    }
}