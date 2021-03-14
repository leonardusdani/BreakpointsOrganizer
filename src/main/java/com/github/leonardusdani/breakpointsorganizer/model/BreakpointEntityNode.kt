package com.github.leonardusdani.breakpointsorganizer.model

import java.io.File

class BreakpointEntityNode(val entity: BreakpointEntity) {
    override fun toString(): String {
        return "Line ${entity.line} in ${entity.fileUrl.substringAfterLast(File.separator)}"
    }
}