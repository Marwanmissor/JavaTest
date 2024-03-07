module com.myapp.myfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.myapp.myfx to javafx.fxml;
    exports com.myapp.myfx;
}