package project.components;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SectionInformation {

	public VBox obtener_seccion_informacion() {
		VBox vbox = new VBox(25);

		Label txt_buttom = new Label("Buttom: ");
		Label txt_checkBox = new Label("ChecBox: ");
		Label txt_hyperLink = new Label("HyperLink: ");
		Label txt_radioButtom = new Label("RadioButtom: ");
		Label txt_Label = new Label("Label: ");
		Label txt_textField = new Label("TextField: ");
		Label txt_passwordFIeld = new Label("PasswordField: ");
		Label txt_textArea = new Label("TextArea: ");
		Label txt_progressIndicator = new Label("Progressindicator: ");
		Label txt_progressBar = new Label("ProgressBar: ");
		Label txt_slider = new Label("Slider: ");

		vbox.getChildren().addAll(txt_buttom, txt_checkBox, txt_hyperLink, txt_radioButtom,
				txt_Label, txt_textField, txt_passwordFIeld, txt_textArea, txt_progressBar, txt_progressIndicator, txt_slider);

		return vbox;

	}

}
