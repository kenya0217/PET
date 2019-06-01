package jp.ac.asojuku.st.pet

import android.os.Parcel
import android.os.Parcelable

class Act(act_watar:Int,act_love:Int,act_name:String,act_png:String): Parcelable {
    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var act_name:String = ""
    var act_png:String = ""
    var act_watar:Int = 0
    var act_love:Int = 0

    constructor(parcel: Parcel) : this(
        TODO("act_watar"),
        TODO("act_love"),
        TODO("act_name"),
        TODO("act_png")
    ) {
        act_name = parcel.readString()
        act_png = parcel.readString()
        act_watar = parcel.readInt()
        act_love = parcel.readInt()
    }


    init {
        this.act_watar = act_watar
        this.act_love = act_love
        this.act_name = act_name
        this.act_png = act_png
    }

    companion object CREATOR : Parcelable.Creator<Act> {
        override fun createFromParcel(parcel: Parcel): Act {
            return Act(parcel)
        }

        override fun newArray(size: Int): Array<Act?> {
            return arrayOfNulls(size)
        }
    }


}

