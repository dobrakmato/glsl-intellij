package com.github.dobrakmato.glsl.services

import com.github.dobrakmato.glsl.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
