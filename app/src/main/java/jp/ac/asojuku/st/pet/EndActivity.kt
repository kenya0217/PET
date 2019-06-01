package jp.ac.asojuku.st.pet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_end.*

class EndActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)
        pic.setImageResource()
        text.setText("ばいばい"+name)
    }

    /*keynomberによってエンディングを変化させる*/
    fun ending(key: kynomber ?,name: petname){
        when{
            key == 1->{/*keynomber1:洋服*/
                pic.setImageResource()
                text.setText("やった！"+name+"は洋服になった！")

            }
            /*key1終了*/
            /*Kye2:GOMI*/
            key == 2->{/*keynomber1:洋服*/
                pic.setImageResource()
                text.setText(name+"は洋服になった！")

            }
        }
    }
}