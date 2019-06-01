package jp.ac.asojuku.st.pet

import android.support.v4.content.ContextCompat.startActivity


class Pet(pet_png:String,pet_dec:Int,pet_border:Int) {
    var pet_png:String = ""
    var pet_dec:Int = 0
    var pet_water:Int = 100
    var pet_love:Int = 0
    var pet_border = 0

    init {
        this.pet_png = pet_png
        this.pet_dec = pet_dec
        this.pet_border = pet_border
    }
    fun water_inc(water:Int){
        this.pet_water += water
    }
    fun love_inc(love:Int){
        this.pet_love += love
    }

    fun tick(){
        pet_water -= pet_dec
        if(pet_water<=0){

        }
    }
}