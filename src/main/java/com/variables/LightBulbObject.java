package com.variables;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import java.nio.file.Paths;


public class LightBulbObject extends Application {
    boolean isOn = false;
    //Declare the primitive types
    double paneWidth = 925;
    double paneHeight = 600;

    //Declare the object types
    Pane pane = new Pane();
    Scene scene;

    String backgroundColor = "black";
    String title = "LIGHT BULB PROGRAM";
    ImageView imageView;
    Image imgLtOff;
    Image imgLtOn;
    Button lightSwitch;
    AudioClip sound;


    @Override
    public void start(Stage stage) {
        intiObjects();
        buildStage(stage);
    }

    public void buildStage(Stage stage) {
        scene = new Scene(pane, paneWidth, paneHeight);
        stage.setScene(scene);
        stage.setTitle("LIGHT BULB PROGRAM");
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    public void throwSwitch(){
        playSound();
        if (isOn){
            imageView.setImage(imgLtOff);
            lightSwitch.setText("FALSE");
        }

        else {
            imageView.setImage(imgLtOn);
            lightSwitch.setText("TRUE ");
        }

        this.isOn = !isOn;
    }

    void intiObjects() {
        title = "LightBulb";
        backgroundColor = "Black";
        imgLtOn = createImage("bulbOn.png");
        imgLtOff = createImage("bulbOff.png");
        imageView = createViewer();
        lightSwitch = createButton();

        addObjects(imageView,lightSwitch);
    }

    Image createImage(String imageFile)  {
        return new Image(imageFile);
    }

    public ImageView createViewer(){
        setPaneWidth(250);
        setPaneHeight(250);
        imageView = new ImageView();
        imageView.setImage(imgLtOff);
        setSound(Paths.get("src/main/resources/SwitchSound.wav").toUri().toString());
        imageView.setFitWidth(paneWidth);
        imageView.setFitHeight(paneHeight);
        return imageView;
    }

    public Button createButton(){
         lightSwitch = new Button("FALSE");
         lightSwitch.setOnAction(e-> throwSwitch());
         return lightSwitch;
    }

    void playSound(){
        sound.play();
    }

    public void setSound(String soundFile)  {
        this.sound = new AudioClip(soundFile);
    }
    public void addObjects(Node... nodes){
        pane.getChildren().addAll(nodes);
    }

    public void setPaneWidth(double paneWidth) {
        this.paneWidth = paneWidth;
    }

    public void setPaneHeight(double paneHeight) {
        this.paneHeight = paneHeight;
    }

    public static void main(String[] args) {
        launch();
    }
}