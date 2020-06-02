package com.example.laboratorio8.inicio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

import com.example.laboratorio8.R
import com.example.laboratorio8.databinding.FragmentInicioBinding


/**
 * A simple [Fragment] subclass.
 */
class Inicio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_inicio, container, false)
        val binding = DataBindingUtil.inflate<FragmentInicioBinding>(inflater,
            R.layout.fragment_inicio, container, false)

        binding.buscar.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_inicio_to_noticias)
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item!!,
            requireView().findNavController()
        )
                || super.onOptionsItemSelected(item)

    }



}
