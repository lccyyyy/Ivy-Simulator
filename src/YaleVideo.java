import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by young on 6/30/17.
 */
public class YaleVideo extends Application {
    public static void display() {
        WebView webview = new WebView();
        webview.getEngine().load(
                "https://www.youtube.com/embed/lt8R-hzzLVA?autoplay=1"
        );
        webview.setPrefSize(640, 390);
        Stage window = new Stage();
        window.setResizable(false);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Congratulations!");
        window.setScene(new Scene(webview));
        window.showAndWait();
    }

    @Override
    public void start(Stage stage) throws Exception {
    }
}
