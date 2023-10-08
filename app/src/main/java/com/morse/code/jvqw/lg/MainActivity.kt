package com.morse.code.jvqw.lg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val text = findViewById<TextView>(R.id.text)
        val edit = findViewById<EditText>(R.id.edit)

        fun toMorse(line: String)
                =line.replace(Regex("[QWERTYUIOPASDFGHJKLZXCVBNM0123456789]"))
        {
            when (it.value) {
                "Q" -> "__._ "
                "W" -> ".__ "
                "E" -> ". "
                "R" -> ".__. "
                "T" -> "_ "
                "Y" -> "_.__ "
                "U" -> ".._ "
                "I" -> ".. "
                "O" -> "___ "
                "P" -> ".__. "
                "A" -> "._ "
                "S" -> "_.. "
                "D" -> "_.. "
                "F" -> ".._. "
                "G" -> "__. "
                "H" -> ".... "
                "J" -> ".___ "
                "K" -> "_._ "
                "L" -> "._.. "
                "Z" -> "__.. "
                "X" -> "_..__ "
                "C" -> "_._. "
                "V" -> "..._ "
                "B" -> "_... "
                "N" -> "_. "
                "M" -> "__ "
                "0" -> "_____ "
                "1" -> ".____ "
                "2" -> "..___ "
                "3" -> "...__ "
                "4" -> "...._ "
                "5" -> "..... "
                "6" -> "_.... "
                "7" -> "__... "
                "8" -> "___.. "
                "9" -> "____. "
                else -> " "
            }

        }
        btn.setOnClickListener {
            var liner = edit.text.toString()

            text.text = toMorse(liner)
        }
}}


