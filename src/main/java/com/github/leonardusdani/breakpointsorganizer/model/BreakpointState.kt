package com.github.leonardusdani.breakpointsorganizer.model

data class BreakpointState(var entities: MutableMap<BreakpointsSetInfo, MutableList<BreakpointEntity>> = mutableMapOf())
