package com.example.odongju.bmicalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        result.setOnClickListener {
            saveData(
                heightEditText.text.toString().toInt(),
                weightEditText.text.toString().toInt()
            )

//                    var intent = Intent(this, ResultActivity::class.java)
//                    intent.putExtra("weight",weightEditText.text.toString())
//                    intent.putExtra("height", heightEditText.text.toString())
//                    startActivity(intent)

            startActivity<ResultActivity>(
                "weight" to weightEditText.text.toString(),
                "height" to weightEditText.text.toString()
            )
        }
    }

    private fun saveData(height: Int, weight: Int) {
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()

        editor.putInt("KEY_HEIGHT", height)
            .putInt("KEY_WEIGHT", weight)
            .apply()
    }

    private fun loadData() {
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val height = pref.getInt("KEY_HEIGHT", 0)
        val weight = pref.getInt("KEY_WEIGHT", 0)

        if (height != 0 && weight != 0) {
            heightEditText.setText(height.toString())
            weightEditText.setText(weight.toString())
        }
    }
}
