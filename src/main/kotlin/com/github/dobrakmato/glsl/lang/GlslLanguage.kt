package com.github.dobrakmato.glsl.lang

import com.intellij.lang.Language

object GlslLanguage : Language("GLSL", "text/glsl", "text/x-glsl", "text/plain") {
    override fun isCaseSensitive() = true

    override fun getDisplayName() = "GLSL"
}