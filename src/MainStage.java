import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainStage extends Application {

    Stage window;
    boolean[] ivies;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Ivy League Admissions Simulator");
        window.setResizable(false);
        ivies = new boolean[8];

        HBox topLabel = new HBox();
        Label label = new Label();
        label.setText("Ivy League Admissions Simulator");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        topLabel.setAlignment(Pos.CENTER);
        topLabel.getChildren().add(label);

        GridPane middle = new GridPane();
        // ivy league checkboxes
        // brown
        Label brownLabel = new Label("Brown");
        CheckBox brownApply = new CheckBox();
        // columbia
        Label columbiaLabel = new Label("Columbia");
        CheckBox columbiaApply = new CheckBox();
        // cornell
        Label cornellLabel = new Label("Cornell");
        CheckBox cornellApply = new CheckBox();
        // dartmouth
        Label dartmouthLabel = new Label("Dartmouth");
        CheckBox dartmouthApply = new CheckBox();
        // harvard
        Label harvardLabel = new Label("Harvard");
        CheckBox harvardApply = new CheckBox();
        // princeton
        Label princetonLabel = new Label("Princeton");
        CheckBox princetonApply = new CheckBox();
        // penn
        Label pennLabel = new Label("Columbia");
        CheckBox pennApply = new CheckBox();
        // yale
        Label yaleLabel = new Label("Yale");
        CheckBox yaleApply = new CheckBox();
        // add all ivies
        middle.add(brownLabel, 0, 0);
        middle.add(brownApply, 1, 0);
        middle.add(columbiaLabel, 0, 1);
        middle.add(columbiaApply, 1, 1);
        middle.add(cornellLabel, 0, 2);
        middle.add(cornellApply, 1, 2);
        middle.add(dartmouthLabel, 0, 3);
        middle.add(dartmouthApply, 1, 3);
        middle.add(harvardLabel, 0, 4);
        middle.add(harvardApply, 1, 4);
        middle.add(princetonLabel, 0, 5);
        middle.add(princetonApply, 1, 5);
        middle.add(pennLabel, 0, 6);
        middle.add(pennApply, 1, 6);
        middle.add(yaleLabel, 0, 7);
        middle.add(yaleApply, 1, 7);
        middle.setAlignment(Pos.CENTER);
        middle.setHgap(10);
        // CHECK BOX EVENT
        brownApply.selectedProperty().addListener(e -> {
            ivies[0] = !ivies[0];
            System.out.println(ivies[0]);
        });
        columbiaApply.selectedProperty().addListener(e -> {
            ivies[1] = !ivies[1];
        });
        cornellApply.selectedProperty().addListener(e -> {
            ivies[2] = !ivies[2];
        });
        dartmouthApply.selectedProperty().addListener(e -> {
            ivies[3] = !ivies[3];
        });
        harvardApply.selectedProperty().addListener(e -> {
            ivies[4] = !ivies[4];
        });
        princetonApply.selectedProperty().addListener(e -> {
            ivies[5] = !ivies[5];
        });
        pennApply.selectedProperty().addListener(e -> {
            ivies[6] = !ivies[6];
        });
        yaleApply.selectedProperty().addListener(e -> {
            ivies[7] = !ivies[7];
        });

        HBox apply = new HBox();
        Button applyButton = new Button("APPLY!");
        applyButton.setMinWidth(100);
        applyButton.setMinHeight(50);
        apply.getChildren().add(applyButton);
        apply.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topLabel);
        borderPane.setCenter(middle);
        borderPane.setBottom(apply);

        Scene scene = new Scene(borderPane, 300, 250);
        window.setScene(scene);
        window.show();
    }

}
