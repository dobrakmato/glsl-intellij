package com.github.dobrakmato.glsl.lang.psi

import com.github.dobrakmato.glsl.lang.GlslLanguage
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class GlslElementType(@NonNls @NotNull debugName: String) : IElementType(debugName, GlslLanguage) {
}