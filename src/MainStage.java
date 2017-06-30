import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sun.applet.Main;

public class MainStage extends Application {

    Stage window;
    boolean[] ivies;
    String name;

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
        Label pennLabel = new Label("Penn");
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

        VBox apply = new VBox();
        TextField name = new TextField("Name");
        name.setOnMouseClicked(e -> {
            name.setText("");
        });
        Button applyButton = new Button("APPLY!");
        applyButton.setMinWidth(100);
        applyButton.setMinHeight(50);
        apply.getChildren().addAll(name, applyButton);
        apply.setAlignment(Pos.CENTER);
        applyButton.setOnAction(e -> {
            this.name = name.getText();
            window.setScene(getNextScene());
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topLabel);
        borderPane.setCenter(middle);
        borderPane.setBottom(apply);

        Scene scene = new Scene(borderPane, 300, 250);
        window.setScene(scene);
        window.show();
    }

    public Scene getNextScene() {
        // Scene 2
        GridPane middle = new GridPane();
        // ivy league checkboxes
        // brown
        Label brownLabel = new Label("Brown");
        Button brownStatus = new Button("View status update");
        brownLabel.setManaged(false);
        brownStatus.setManaged(false);
        // columbia
        Label columbiaLabel = new Label("Columbia");
        Button columbiaStatus = new Button("View status update");
        columbiaLabel.setManaged(false);
        columbiaStatus.setManaged(false);
        // cornell
        Label cornellLabel = new Label("Cornell");
        Button cornellStatus = new Button("View status update");
        cornellLabel.setManaged(false);
        cornellStatus.setManaged(false);
        // dartmouth
        Label dartmouthLabel = new Label("Dartmouth");
        Button dartmouthStatus = new Button("View status update");
        dartmouthLabel.setManaged(false);
        dartmouthStatus.setManaged(false);
        // harvard
        Label harvardLabel = new Label("Harvard");
        Button harvardStatus = new Button("View status update");
        harvardLabel.setManaged(false);
        harvardStatus.setManaged(false);
        // princeton
        Label princetonLabel = new Label("Princeton");
        Button princetonStatus = new Button("View status update");
        princetonLabel.setManaged(false);
        princetonStatus.setManaged(false);
        // penn
        Label pennLabel = new Label("Penn");
        Button pennStatus = new Button("View status update");
        pennLabel.setManaged(false);
        pennStatus.setManaged(false);
        // yale
        Label yaleLabel = new Label("Yale");
        Button yaleStatus = new Button("View status update");
        yaleLabel.setManaged(false);
        yaleStatus.setManaged(false);
        // add all ivies
        middle.add(brownLabel, 0, 0);
        middle.add(brownStatus, 1, 0);
        middle.add(columbiaLabel, 0, 1);
        middle.add(columbiaStatus, 1, 1);
        middle.add(cornellLabel, 0, 2);
        middle.add(cornellStatus, 1, 2);
        middle.add(dartmouthLabel, 0, 3);
        middle.add(dartmouthStatus, 1, 3);
        middle.add(harvardLabel, 0, 4);
        middle.add(harvardStatus, 1, 4);
        middle.add(princetonLabel, 0, 5);
        middle.add(princetonStatus, 1, 5);
        middle.add(pennLabel, 0, 6);
        middle.add(pennStatus, 1, 6);
        middle.add(yaleLabel, 0, 7);
        middle.add(yaleStatus, 1, 7);
        middle.setAlignment(Pos.CENTER);
        middle.setHgap(10);

        // enable stuff
        if (ivies[0]) {
            brownLabel.setManaged(true);
            brownStatus.setManaged(true);
        }
        if (ivies[1]) {
            columbiaLabel.setManaged(true);
            columbiaStatus.setManaged(true);
        }
        if (ivies[2]) {
            cornellLabel.setManaged(true);
            cornellStatus.setManaged(true);
        }
        if (ivies[3]) {
            dartmouthLabel.setManaged(true);
            dartmouthStatus.setManaged(true);
        }
        if (ivies[4]) {
            harvardLabel.setManaged(true);
            harvardStatus.setManaged(true);
        }
        if (ivies[5]) {
            princetonLabel.setManaged(true);
            princetonStatus.setManaged(true);
        }
        if (ivies[6]) {
            pennLabel.setManaged(true);
            pennStatus.setManaged(true);
        }
        if (ivies[7]) {
            yaleLabel.setManaged(true);
            yaleStatus.setManaged(true);
        }

        // add button action for getting status
        harvardStatus.setOnAction(e -> {
            harvardLabel.setVisible(false);
            harvardStatus.setVisible(false);
            Harvard.display(name);
        });
        cornellStatus.setOnAction(e -> {
            Cornell.display(name);
            cornellLabel.setVisible(false);
            cornellStatus.setVisible(false);
        });
        brownStatus.setOnAction(e -> {
            Brown.display(name);
            brownLabel.setVisible(false);
            brownStatus.setVisible(false);
        });
        columbiaStatus.setOnAction(e -> {
            Columbia.display(name);
            columbiaLabel.setVisible(false);
            columbiaStatus.setVisible(false);
        });
        yaleStatus.setOnAction(e -> {
            Yale.display(name);
            yaleLabel.setVisible(false);
            yaleStatus.setVisible(false);
        });
        princetonStatus.setOnAction(e -> {
            Princeton.display(name);
            princetonLabel.setVisible(false);
            princetonStatus.setVisible(false);
        });

        Button restart = new Button("Apply again!");
        restart.setAlignment(Pos.BOTTOM_CENTER);
        restart.setOnAction(e -> {
            try {
                window.close();
                new MainStage().start(new Stage());
            } catch (Exception d) {
                // do stuff
            }
        });
        BorderPane borderPane2 = new BorderPane();
        borderPane2.setCenter(middle);
        borderPane2.setBottom(restart);

        return new Scene(borderPane2, 300, 250);
    }

}
