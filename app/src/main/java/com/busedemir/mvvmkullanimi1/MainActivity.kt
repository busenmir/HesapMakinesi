package com.busedemir.mvvmkullanimi1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.busedemir.mvvmkullanimi1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    private val viewModel : MainActivtyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim=DataBindingUtil.setContentView(this,R.layout.activity_main)
        tasarim.mainActivityNesnesi=this

        viewModel.modelSonuc.observe(this,{ tasarim.sonuc=it })
        viewModel.modelBoolean.observe(this,{
            if (viewModel.modelBoolean.value == it ){
                Toast.makeText(this, "ilk girilen sayı , ikinci sayıdan küçük sonuç negatif çıkabilir ! ", Toast.LENGTH_LONG).show()
            }
        })
    }
    fun buttonToplamaTikla(sayi1:String , sayi2:String){
        viewModel.toplamaYap(sayi1,sayi2)
    }
    fun buttonCikarmaTikla(sayi1:String , sayi2:String){
        viewModel.cikarmaYap(sayi1,sayi2)
    }
    fun buttonCarpmaTikla(sayi1:String , sayi2:String){
        viewModel.carpmaYap(sayi1,sayi2)
    }
    fun buttonBolmeTikla(sayi1:String , sayi2:String){
        viewModel.bolmeYap(sayi1,sayi2)
    }

    fun buttonOrtTikla(sayi1:String , sayi2:String){
        viewModel.OrtYap(sayi1,sayi2)
    }
    fun buttonStandartTikla(sayi1:String , sayi2:String){
        viewModel.usYap(sayi1,sayi2)
        if (viewModel.modelBoolean.value == false){
            Toast.makeText(this, "İkinci Sayı üst olacak sayıdır", Toast.LENGTH_LONG).show()
        }
    }
}