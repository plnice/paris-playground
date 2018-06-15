package com.github.plnice.parisplayground

import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import com.airbnb.epoxy.TypedEpoxyController
import com.github.plnice.uilibrary.component

class MainEpoxyController : TypedEpoxyController<Unit>() {

    override fun buildModels(data: Unit) {
        component {
            id(0)
            title(R.string.app_name)
//            styleBuilder { builder -> builder.layoutWidth(MATCH_PARENT).layoutHeightDp(56).backgroundRes(R.color.red) }
        }
    }

}
