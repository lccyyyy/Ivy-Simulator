import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by young on 6/29/17.
 */
public class Harvard {

    static TextArea letter;
    static String name;

    public static void display(String a) {
        name = a;

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Your Harvard Application");
        window.setResizable(false);

        Image harvardLogo = new Image("file:donotedit/Harvard.jpg");
        ImageView image = new ImageView();
        image.setImage(harvardLogo);
        image.setFitWidth(350);
        image.setPreserveRatio(true);

        letter = new TextArea();
        letter.setEditable(false);
        int caretPosition = letter.getCaretPosition();
        // Get random number. 0~5 acceptance, 6~99 rejection
        Random decision = new Random();
        int num = decision.nextInt(100);
        if (num >= 0 && num < 5) {
            getAcceptanceText();
        } else if (num >= 5 && num <= 9) {
            getWaitlistText();
        } else {
            getRejectionText();
        }
        letter.setWrapText(true);
        letter.positionCaret(caretPosition);
        letter.setStyle("-fx-focus-color: -fx-control-inner-background ; -fx-faint-focus-color: -fx-control-inner-background ;");

        Image welcomeHarvard = new Image("file:donotedit/WelcomeHarvard.gif");
        ImageView image2 = new ImageView();
        image2.setImage(welcomeHarvard);
        image2.setFitWidth(350);
        image2.setPreserveRatio(true);

        Label welcome = new Label("Welcome to Harvard! We can't wait to see you in the fall.");
        welcome.setFont(Font.font("Verdana", FontWeight.BOLD,8));

        VBox pictureHarvard = new VBox();
        pictureHarvard.setAlignment(Pos.CENTER);
        pictureHarvard.getChildren().addAll(image2, welcome);

        BorderPane layout = new BorderPane();
        layout.setCenter(letter);
        layout.setTop(image);
        if (num >= 0 && num < 5) {
            layout.setBottom(pictureHarvard);
        }
        layout.setBackground(new Background(new BackgroundFill(javafx.scene.paint.Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        Scene scene = new Scene(layout, 800, 700);

        window.setScene(scene);
        window.showAndWait();
    }

    private static void getRejectionText() {
        try {
            Scanner sc = new Scanner(new File("donotedit/HarvardRejection.txt"));
            letter.appendText("March 31, 2017");
            letter.appendText("\n\n");
            letter.appendText("Dear " + name + ",\n\n");
            while (sc.hasNext()) {
                letter.appendText(sc.nextLine() + " ");
                letter.appendText("\n");
            }
        } catch (FileNotFoundException c) {
            System.out.println("File not found.");
        }
    }

    private static void getAcceptanceText() {
        try {
            Scanner sc = new Scanner(new File("donotedit/HarvardAcceptance.txt"));
            letter.appendText("March 31, 2017");
            letter.appendText("\n\n");
            letter.appendText("Dear " + name + ",\n\n");
            while (sc.hasNext()) {
                letter.appendText(sc.nextLine() + " ");
                letter.appendText("\n");
            }
        } catch (FileNotFoundException c) {
            System.out.println("File not found.");
        }
    }

    private static void getWaitlistText() {
        try {
            Scanner sc = new Scanner(new File("donotedit/HarvardWaitlist.txt"));
            letter.appendText("March 31, 2017");
            letter.appendText("\n\n");
            letter.appendText("Dear " + name + ",\n\n");
            while (sc.hasNext()) {
                letter.appendText(sc.nextLine() + " ");
                letter.appendText("\n");
            }
        } catch (FileNotFoundException c) {
            System.out.println("File not found.");
        }
    }
}
