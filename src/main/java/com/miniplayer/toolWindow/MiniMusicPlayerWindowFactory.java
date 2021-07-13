package com.miniplayer.toolWindow;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

public class MiniMusicPlayerWindowFactory implements ToolWindowFactory {

    /**
     * Create the tool window content
     *
     * @param project  current project
     * @param toolWindow current tool window
     */

    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow){
        MiniMusicPlayerWindow miniMusicPlayerWindow = new MiniMusicPlayerWindow(toolWindow);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(miniMusicPlayerWindow.getContent(),"",false);
        toolWindow.getContentManager().addContent(content);
    }
}
