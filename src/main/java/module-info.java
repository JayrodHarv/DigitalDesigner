module com.jayrodharv.digitaldesigner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.jayrodharv.digitaldesigner to javafx.fxml;
    exports com.jayrodharv.digitaldesigner;
}