package com.busedemir.mvvmkullanimi1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.busedemir.mvvmkullanimi1.databinding.BlankFragmentBinding

class BlankFragment : Fragment() {
    private lateinit var tasarim: BlankFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim=DataBindingUtil.inflate(inflater,R.layout.blank_fragment,container,false)
        return tasarim.root
    }
}