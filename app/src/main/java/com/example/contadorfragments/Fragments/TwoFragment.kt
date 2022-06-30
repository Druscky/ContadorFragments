package com.example.contadorfragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import com.example.contadorfragments.R
import com.example.contadorfragments.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {
    private var _b : FragmentTwoBinding?= null
    private val b get() = _b!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFragmentResultListener("Paquete1") {
            paquete, datos -> b.tvHello2.text = datos.getString("PrimerDato")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentTwoBinding.inflate(inflater, container, false)
        return b.root
    }

}