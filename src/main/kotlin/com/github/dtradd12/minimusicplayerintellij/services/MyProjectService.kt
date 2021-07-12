package com.github.dtradd12.minimusicplayerintellij.services

import com.github.dtradd12.minimusicplayerintellij.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
