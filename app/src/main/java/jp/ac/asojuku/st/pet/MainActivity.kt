package jp.ac.asojuku.st.pet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ListView
import android.widget.TextView
import kotlin.arrayOf as arrayOf

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var i:Int = 0;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var pet = Pet(
            //intent.getStringExtra("png"),
            //intent.getIntExtra("dec",222),
            //intent.getIntExtra("border",222)
            // ,intent.getStringExtra("name")
            //)
        val button = findViewById(R.id.constraintLayout) as Button

        button.setOnClickListener {
            if(i ==0) {
                ListView.setVisibility(View.VISIBLE);
                i++
            }else{
                ListView.setVisibility(View.INVISIBLE);
                i=0
            }
        }
        val items = arrayOf("振る","撫でる","散歩")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        ListView.adapter = adapter
//        ListView.setOnItemClickListener { adapterView, view, position, id ->
//
//        }
        ListView.setVisibility(View.GONE);
    }

}
