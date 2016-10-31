package ru.jollydroid.androidsynthetic

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.custom_view.view.*

class CustomView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
: FrameLayout(context, attrs, defStyleAttr) {
    var message: String = ""
        set(value) {
            helloCustomView.text = value
        }

    init {
        LayoutInflater
                .from(context)
                .inflate(R.layout.custom_view, this, true)
    }
}
