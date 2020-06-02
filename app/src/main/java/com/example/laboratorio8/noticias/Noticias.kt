package com.example.laboratorio8.noticias

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.example.laboratorio8.databinding.FragmentNoticiasBinding
import com.example.laboratorio8.R

/**
 * A simple [Fragment] subclass.
 */
class Noticias : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_noticias, container, false)
        val binding = DataBindingUtil.inflate<FragmentNoticiasBinding>(inflater,
            R.layout.fragment_noticias, container, false)

        setHasOptionsMenu(true)
        return binding.root
    }

}
