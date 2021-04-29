package com.github.dobrakmato.glslintellij.services

import com.github.dobrakmato.glslintellij.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
