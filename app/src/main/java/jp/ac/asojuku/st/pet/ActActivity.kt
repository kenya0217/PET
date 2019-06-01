package jp.ac.asojuku.st.pet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.seismic.ShakeDetector
import android.content.Context
import android.hardware.SensorManager
import kotlinx.android.synthetic.main.activity_act.*



class ActActivity : AppCompatActivity(), ShakeDetector.Listener {
    override fun hearShake() {
        image.setImageResource(R.drawable.yakan1)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act)
        val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val sd = ShakeDetector(this)
        sd.start(sensorManager)
    }


}
