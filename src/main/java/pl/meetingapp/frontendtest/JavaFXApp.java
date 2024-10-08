package pl.meetingapp.frontendtest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class JavaFXApp extends Application {

    private static Stage stage;
    private static String jwtToken;
    private static Long userId;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
//        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setResizable(false);
        loadScene("/fxml/loginSceneFRONT.fxml", 520, 400); // Ustawienie domyślnego rozmiaru
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return stage;
    }

    public static Long getUserId() {
        return userId;
    }

    public static void setUserId(Long userId) {
        JavaFXApp.userId = userId;
    }

    public static void setJwtToken(String token) {
        jwtToken = token;
    }

    public static String getJwtToken() {
        return jwtToken;
    }

    public void loadScene(String fxml, double width, double height) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        Parent root = loader.load();
        Scene scene = new Scene(root, width, height);

        Stage primaryStage = getStage();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void clearJwtToken() {
        jwtToken = null;
    }
    public static void clearUserId() {
        userId = null;
    }
}
