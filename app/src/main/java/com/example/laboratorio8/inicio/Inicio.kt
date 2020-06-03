package com.example.laboratorio8.inicio

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
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
        val binding = DataBindingUtil.inflate<FragmentInicioBinding>(inflater,
            R.layout.fragment_inicio, container, false)

        binding.buscar.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_inicio_to_noticias)
        }

        setHasOptionsMenu(true)
        return binding.root


    }

}


