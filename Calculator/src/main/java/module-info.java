module com.calc.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.calc.calculator to javafx.fxml;
    exports com.calc.calculator;
}