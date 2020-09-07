package org.oxycblt.auxio

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import org.oxycblt.auxio.theme.accent

class MainActivity : AppCompatActivity() {

    // Debug placeholder so I can test dark and light modes. Ignore.
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        // Apply the theme
        setTheme(accent.second)

        return super.onCreateView(name, context, attrs)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(this::class.simpleName, "Activity Created.")
    }
}
