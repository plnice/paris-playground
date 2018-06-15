package com.github.plnice.uilibrary

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.TextProp
import com.airbnb.paris.annotations.Attr
import com.airbnb.paris.annotations.Style
import com.airbnb.paris.annotations.Styleable
import kotlinx.android.synthetic.main.component_inner_layout.view.*

@Styleable("Component")
//@ModelView(defaultLayout = R2.layout.default_component_layout)
@ModelView
class Component @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
        ConstraintLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.component_inner_layout, this, true)
        Paris.style(this).apply(attrs)
    }

    @Attr(R2.styleable.Component_title)
    @TextProp
    fun setTitle(text: CharSequence) {
        title.text = text // kotlinx.android.synthetic
    }

    companion object {

        @Style
        const val DEFAULT_STYLE = R2.style.Component

        // Fails with
        // com.airbnb.paris.processor.framework.errors.ProcessorException: defaultStyle: Fields and methods annotated with @Style must be static and can't be private or protected
//        @JvmStatic
//        @Style
//        fun defaultStyle(builder: ComponentStyleApplier.StyleBuilder) {
//            builder.layoutWidth(LayoutParams.MATCH_PARENT)
//                    .layoutHeightDp(56)
//                    .backgroundRes(R.color.red)
//        }
    }

}
