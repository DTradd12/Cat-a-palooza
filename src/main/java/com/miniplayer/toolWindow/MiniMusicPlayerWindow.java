package com.miniplayer.toolWindow;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

public class MiniMusicPlayerWindow {
    private JButton refresh;
    private JButton hideWindow;

    private JLabel title;
    private JLabel currentDate;
    private JLabel currentTime;

    private JPanel miniMusicPlayerContent;

    public MiniMusicPlayerWindow(ToolWindow toolWindow) {
        hideWindow.addActionListener(e -> toolWindow.hide(null));
        refresh.addActionListener(e -> setTitle());

        this.setTitle();
    }

    public void setTitle() {
        // Get current date and time
        title.setText("Mini Music Player");
    }

    public JPanel getContent() {
        return miniMusicPlayerContent;
    }
}
