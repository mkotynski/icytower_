package model;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InfoLabel extends Label {
    public final static String FONT_PATH = "model/resources/HALO____.TTF";


    public InfoLabel(String text)
    {
        setPrefWidth(400);
        setPrefHeight(200);
        setPadding(new Insets(40,40,40,40));
        setText(text);
        setWrapText(true);
        setLabelFont();
        setStyle("-fx-text-fill: white;");
    }

    private void setLabelFont()
    {
        try {
            setFont(Font.loadFont(new FileInputStream(new File(FONT_PATH)),23));
        } catch(FileNotFoundException e) {
            setFont(Font.font("Verdana"));
        }

    }
}
