package com.github.dobrakmato.glsl.lang.psi

import com.github.dobrakmato.glsl.lang.GlslLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class GlslTokenType(@NonNls @NotNull debugName: String) : IElementType(debugName, GlslLanguage) {
    override fun toString(): String {
        return "GlslTokenType." + super.toString()
    }
}