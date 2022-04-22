package com.busedemir.mvvmkullanimi1

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivtyViewModel : ViewModel() {
    val isNegative = false
    var modelSonuc = MutableLiveData<String>()
    var modelBoolean = MutableLiveData<Boolean>()
    init {
        modelSonuc = MutableLiveData<String>("0")
        modelBoolean = MutableLiveData<Boolean>()
    }

    fun toplamaYap(sayi1:String , sayi2:String){
        val birinciSayi = sayi1.toInt()
        val ikinciSayi= sayi2.toInt()
        val toplam = birinciSayi + ikinciSayi
        modelSonuc.value = toplam.toString()
    }
    fun cikarmaYap(sayi1:String , sayi2:String){
        val birinciSayi = sayi1.toInt()
        val ikinciSayi= sayi2.toInt()
        if (sayi1 > sayi2){
            val cikarma = birinciSayi - ikinciSayi
            modelSonuc.value = cikarma.toString()
        }else{
            val cikarma = birinciSayi - ikinciSayi
            modelSonuc.value = cikarma.toString()
            modelBoolean.value = isNegative
        }
    }
    fun carpmaYap(sayi1:String , sayi2:String){
        val birinciSayi = sayi1.toInt()
        val ikinciSayi= sayi2.toInt()
        val carpma= birinciSayi * ikinciSayi
        modelSonuc.value = carpma.toString()
    }
    fun bolmeYap(sayi1:String , sayi2:String){
        val birinciSayi = sayi1.toFloat()
        val ikinciSayi= sayi2.toFloat()
        val bolme = birinciSayi / ikinciSayi
        modelSonuc.value = bolme.toInt().toString()
    }
    fun OrtYap(sayi1:String , sayi2:String){
        val birinciSayi = sayi1.toInt()
        val ikinciSayi= sayi2.toInt()
        val ort = (birinciSayi + ikinciSayi) / 2.0
        modelSonuc.value = ort.toInt().toString()
    }
    fun usYap(sayi1:String , sayi2:String){
        val birinciSayi = sayi1.toDouble()
        val ikinciSayi= sayi2.toDouble()
        val us = Math.pow(birinciSayi,ikinciSayi)
        modelSonuc.value = us.toInt().toString()
        modelBoolean.value = isNegative
    }
}