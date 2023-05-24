package com.example.noteslibrary

import android.content.Context
import android.widget.Toast

class ToastForNotes {
    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

}