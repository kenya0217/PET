package jp.ac.asojuku.st.pet
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_end.*

class EndActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)
        text.setText("ばいばい"+name)
        pic.setOnClickListener{ending(key,name)}
    }



    /*keynomberによってエンディングを変化させる*/
    fun ending(key: Int ?,name: String){
        when{
            key == 1->{/*keynomber1:洋服*/
                pic.setImageResource(/*あとでがぞういれる*/)
                text.setText("やった！"+name+"は洋服になった！")
            }
            /*key1終了*/
            else ->{
                pic.setImageResource(/*あとでがぞうあいでー*/)
                text.setText("残念…"name+"燃えないゴミになってしまった…")
            }
            /*Kye2:GOMI*/
            /*key == 2->{/*keynomber1:洋服*/
                pic.setImageResource()
                text.setText("残念…"name+"燃えないゴミになってしまった…")
            }*/
            /*key2終了*/
        }
        endbtn.setVisibility(View.VISIBLE)
        endbtn.setOnClickListener{
            val intent = Intent(this, ChoicesActivity::class.java)
            startActivity(intent)
        }
    }
}