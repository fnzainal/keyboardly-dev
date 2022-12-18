package app.keyboardly.dev

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.rowland.kokokeyboard.keypad.KokoKeyboardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val binding = ActivityMainBinding.inflate(layoutInflater)
//        binding.keyboardTest.registerEditText(KokoKeyboardView.INPUT_TYPE_QWERTY, binding.inputTest)

        val keyboardView = findViewById<KokoKeyboardView>(R.id.keyboardTest)
        val editText = findViewById<EditText>(R.id.inputTest)

        keyboardView.registerEditText(KokoKeyboardView.INPUT_TYPE_QWERTY, editText)

    }
}