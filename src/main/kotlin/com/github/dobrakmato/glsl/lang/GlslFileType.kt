package com.github.dobrakmato.glsl.lang

import com.github.dobrakmato.glsl.GLSLIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon

object GlslFileType : LanguageFileType(GlslLanguage) {
    override fun getName(): String = "GLSL"

    override fun getIcon(): Icon = GLSLIcons.GLSLFile

    override fun getDefaultExtension(): String = "glsl"

    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"

    override fun getDescription(): String = "GLSL files"
}