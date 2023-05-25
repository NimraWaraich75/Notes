package com.example.notesact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.noteslibrary.ToastForNotes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastForNotes().showToast(this,"lib")

    }
}