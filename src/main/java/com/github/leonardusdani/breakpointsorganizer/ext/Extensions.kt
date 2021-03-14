package com.github.leonardusdani.breakpointsorganizer.ext

import com.github.leonardusdani.breakpointsorganizer.model.BreakpointExpression
import com.intellij.xdebugger.XExpression

fun XExpression?.convertToEntity(): BreakpointExpression? {
    this ?: return null

    return BreakpointExpression().apply {
        val exp = this@convertToEntity
        languageId = exp.language?.id
        customInfo = exp.customInfo
        expression = exp.expression
        mode = exp.mode
    }
}
