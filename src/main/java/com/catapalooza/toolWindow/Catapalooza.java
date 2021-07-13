package com.catapalooza.toolWindow;

import com.intellij.openapi.wm.ToolWindow;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class Catapalooza {
    private JButton randomCat;
    private JLabel catHooray;

    private JPanel miniMusicPlayerContent;

    public Catapalooza(ToolWindow toolWindow) throws IOException {
        randomCat.addActionListener( e -> {
            try {
                getRandomCat();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
    }

    private void getRandomCat() throws IOException {
        Image image = null;
        URL url = new URL("https://cataas.com/cat");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        image = ImageIO.read(url);
        ImageIcon icon = new ImageIcon(image);
        catHooray.setIcon(icon);
    }

    public JPanel getContent() {
        return miniMusicPlayerContent;
    }
}
