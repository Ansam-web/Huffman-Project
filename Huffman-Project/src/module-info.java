module HuffmanProject {
	requires javafx.controls;
	requires javafx.graphics;
    requires javafx.fxml;
    requires java.base;

	opens application to javafx.graphics, javafx.fxml;
}
