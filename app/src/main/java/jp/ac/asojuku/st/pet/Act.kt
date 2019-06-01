package jp.ac.asojuku.st.pet

class Act(act_id:Int,act_watar:Int,act_love:Int,act_name:String,act_png:String) {

    var act_id:Int = 0
    var act_name:String = ""
    var act_png:String = ""
    var act_watar:Int = 0
    var act_love:Int = 0


    init {
        this.act_id = act_id
        this.act_watar = act_watar
        this.act_love = act_love
        this.act_name = act_name
        this.act_png = act_png
    }


}

