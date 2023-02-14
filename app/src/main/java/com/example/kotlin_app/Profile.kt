package com.example.kotlin_app

import android.os.Parcel
import android.os.Parcelable

data class Profile(var name: String?, var age:Int) : Parcelable {
    // Parcel pour lire les types primitifs
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    )

    // Override covertit l'ojjet en parcelable
    // Il est important de respecter l'order
    override fun writeToParcel(parcel: Parcel, flags:Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    // Permet de creer une liste d'utilisateurs via mon OBJ
    companion object CREATOR : Parcelable.Creator<Profile> {
        override fun createFromParcel(parcel: Parcel): Profile {
            return Profile(parcel)
        }

        // Permet de creer une liste d'utilisateurs via mon OBJ
        override fun newArray(size: Int) : Array<Profile?> {
            return arrayOfNulls(size)
        }
    }
}
