package com.example.contadorfragments.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import com.example.contadorfragments.R
import com.example.contadorfragments.databinding.FragmentOneBinding
import com.example.contadorfragments.databinding.FragmentTwoBinding


class OneFragment : Fragment() {
    private var _b: FragmentOneBinding? = null
    private val b get() = _b!!
    private var cont = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _b = FragmentOneBinding.inflate(inflater, container, false)
        return b.root
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            b.tvHello1.setOnClickListener {
                cont++
                b.tvHello1.text = cont.toString()
                setFragmentResult("Paquete1", bundleOf("PrimerDato" to b.tvHello1.text))
            }
        }
    }

