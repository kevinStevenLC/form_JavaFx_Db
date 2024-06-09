package project.components;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;

public class SectionElements {

	public VBox mostrar_seccion_elementos() {
		VBox vbox = new VBox(5);

		Button btn = new Button("Buttom");
		CheckBox checkBox = new CheckBox("CheckBox");
		Hyperlink hyperlink = new Hyperlink("HyperLink");
		ToggleButton toggleButton = new ToggleButton("ToggleButtom/ToggleButtom");
		RadioButton rb1 = new RadioButton("RadioButtom");
		Label txt = new Label("Label");
		TextField txtField = new TextField("TextField");
		PasswordField passField = new PasswordField();
		TextArea txtArea = new TextArea("Text area");
		ProgressIndicator progressIndicator = new ProgressIndicator(10);
		ProgressBar progressBar = new ProgressBar(2);
		Slider slider = new Slider(0, 100, 30);

		vbox.getChildren().addAll(btn, checkBox, hyperlink, toggleButton, rb1, txt, txtField,
				passField, txtArea, progressIndicator, progressBar, slider);

		return vbox;
	}

}
