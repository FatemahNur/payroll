module se2203b.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens se2203b.fsayednoipayrollassignment2 to javafx.fxml;
    exports se2203b.fsayednoipayrollassignment2;
}