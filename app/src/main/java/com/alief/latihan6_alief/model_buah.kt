package com.alief.latihan6_alief

//import com.alief.latihan6_alief
data class model_buah(
    val image: Int, val deskripsi : String
)

//kita bikin array data
    object MockList{
    fun getModel() : List<model_buah>{
        val itemModel1 = model_buah(
            R.drawable.apple,
            "Apple",
        )

        val itemModel2 = model_buah(
            R.drawable.grapes,
            "Anggur",
        )

        val itemModel3 = model_buah(
            R.drawable.grapes,
            "Anggur",
        )

}