import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;

public aspect AspectoColor {
	pointcut ObserverPoincut(Color color) : call(void notifyColor(Color)) && args(color);
	//Advice para los botones observados.
	after(Color color) returning : ObserverPoincut(color) {
		System.out.println("El color actual es = " +color.toString());
		//Implementación del aspecto cross cutting. al escoger el color saldra una notificacion
		showNotification(color);
	}
	private void showNotification(Color color) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Cambio de Color");
        alert.setHeaderText("Nuevo color seleccionado");
        alert.setContentText("El color actual es: " + color.toString());
        alert.showAndWait();
    }
}