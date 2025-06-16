module io.github.piratepanda805.obforge {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.piratepanda805.obforge to javafx.fxml;
    exports io.github.piratepanda805.obforge;
}