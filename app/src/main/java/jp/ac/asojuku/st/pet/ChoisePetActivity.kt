package jp.ac.asojuku.st.pet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choise_pet.*

class ChoisePetActivity : AppCompatActivity() {

    var dec:Int = 0
    var border:Int = 0
    var png:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choise_pet)

        choise_1.setOnClickListener { this.dec=1; this.border=50; this.png="here1"}
        choise_1.setOnClickListener { this.dec=2; this.border=100; this.png="here2"}
        choise_1.setOnClickListener { this.dec=3; this.border=200; this.png="here3"}
        choise_1.setOnClickListener { this.dec=4; this.border=300; this.png="here4"}


        choise_decide_button.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            intent.putExtra("dec",this.dec)
            intent.putExtra("border",this.border)
            intent.putExtra("png",this.png)
            intent.putExtra("name",choise_name_text.text)
            startActivity(intent)
        }
    }


}
