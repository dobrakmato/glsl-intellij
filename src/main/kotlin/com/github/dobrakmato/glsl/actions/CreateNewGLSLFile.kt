package com.github.dobrakmato.glsl.actions

import com.github.dobrakmato.glsl.GLSLIcons
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

object CreateNewGLSLFile :
    CreateFileFromTemplateAction("GLSL File", "Create new GLSL shader", GLSLIcons.GLSLFile) {

    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle("Create new GLSL shader")
        builder.addKind("GLSL File", GLSLIcons.GLSLFile, "GLSL File")
    }

    override fun getActionName(directory: PsiDirectory?, newName: String, templateName: String?): String {
        return "GLSL File"
    }

}