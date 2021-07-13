package com.catapalooza.toolWindow;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class CatapaloozaWindowFactory implements ToolWindowFactory {

    /**
     * Create the tool window content
     *
     * @param project  current project
     * @param toolWindow current tool window
     */

    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow){
        Catapalooza miniMusicPlayerWindow = null;
        try {
            miniMusicPlayerWindow = new Catapalooza(toolWindow);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(miniMusicPlayerWindow.getContent(),"",false);
        toolWindow.getContentManager().addContent(content);
    }
}

