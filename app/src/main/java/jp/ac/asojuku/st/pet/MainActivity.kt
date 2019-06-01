package jp.ac.asojuku.st.pet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceHolder
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        var button = findViewById<Button>(R.id.test_button) as Button
        var hp1 = findViewById<ImageView>(R.id.hp_icon_1)
        var hp2 = findViewById<ImageView>(R.id.hp_icon_2)
        var hp3 = findViewById<ImageView>(R.id.hp_icon_3)
        var hp4 = findViewById<ImageView>(R.id.hp_icon_4)
        var love1 = findViewById<ImageView>(R.id.love_icon_1)
        var love2 = findViewById<ImageView>(R.id.love_icon_2)
        var love3 = findViewById<ImageView>(R.id.love_icon_3)
        var love4 = findViewById<ImageView>(R.id.love_icon_4)


        button.setOnClickListener {
                love4.setImageResource(R.drawable.love_x)
        }
    }


}
