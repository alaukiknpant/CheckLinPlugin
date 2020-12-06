package com.github.alaukiknpant.checklinplugin.services

import com.intellij.openapi.project.Project
import com.github.alaukiknpant.checklinplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
