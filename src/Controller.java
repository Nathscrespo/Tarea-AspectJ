import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Controller implements cambiocolor {

    @FXML
    private Button BtAmarillo;

    @FXML
    private Button BtPurpura;

    @FXML
    private Button BtCeleste;

    @FXML
    private VBox rootPane;

    @FXML
    private void botonAmarillo() {
        notifyColor(Color.YELLOW);
    }

    @FXML
    private void botonPurpura() {
        notifyColor(Color.PURPLE);
    }

    @FXML
    private void botonCeleste() {
        notifyColor(Color.LIGHTBLUE);
    }

    @Override
    public void notifyColor(Color color) {
    	String colorName = this.toHexString(color);
    	rootPane.setStyle("-fx-background-color: "+colorName+";");
    }

	private String toHexString(Color color) {
        int a = (int) (color.getRed() * 255);
        int v = (int) (color.getGreen() * 255);
        int z = (int) (color.getBlue() * 255);
        return String.format("#%02X%02X%02X", a, v, z);
    }	
}