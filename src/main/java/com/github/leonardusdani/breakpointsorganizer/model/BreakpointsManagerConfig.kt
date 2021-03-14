package com.github.leonardusdani.breakpointsorganizer.model

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.project.Project

@State(name = "BreakpointManagerConfig", storages = arrayOf(Storage("breakpointManagerConfig.xml")))
open class BreakpointsManagerConfig() : PersistentStateComponent<BreakpointState> {
    var myState: BreakpointState? = BreakpointState()

    companion object {
        fun getInstance(project: Project) = ServiceManager.getService(project, BreakpointsManagerConfig::class.java)
    }

    override fun loadState(state: BreakpointState) {
        myState = state
    }

    override fun getState(): BreakpointState? {
        return myState
    }
}