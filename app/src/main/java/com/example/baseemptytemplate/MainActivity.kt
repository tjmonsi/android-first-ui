package com.example.baseemptytemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var mCount: Int = 0
        private

    lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        val toast: Toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)
        toast.show()
    }
    fun countUp(view: View) {
        mCount++
        if (mShowCount !== null)
            mShowCount.text = mCount.toString()
    }
}
