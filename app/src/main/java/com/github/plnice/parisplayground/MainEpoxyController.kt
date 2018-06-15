package com.github.plnice.parisplayground

import com.airbnb.epoxy.TypedEpoxyController
import com.github.plnice.uilibrary.component

class MainEpoxyController : TypedEpoxyController<Unit>() {

    override fun buildModels(data: Unit) {
        component {
            id(0)
            title(R.string.app_name)
        }
    }

}
