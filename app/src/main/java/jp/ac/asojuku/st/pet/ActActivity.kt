package jp.ac.asojuku.st.pet

import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class ActActivity : AppCompatActivity(), SensorEventListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act)


    }
    override fun onSensorChanged(event: SensorEvent){

        var strb:StringBuffer = StringBuffer()
        strb.append(event.values[0])
        strb.append(event.values[1])
        strb.append(event.values[2])

    }

    var actList:ArrayList<Act> = ArrayList()

    fun add_act(water:Int,love:Int,name:String,png:String){
        var act = Act(water,love,name,png)
        actList.add(act)
    }

}
