package com.example.laboratorio8.noticias

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.laboratorio8.databinding.FragmentNoticiasBinding
import com.example.laboratorio8.R

/**
 * A simple [Fragment] subclass.
 */
class Noticias : Fragment() {
    private lateinit var viewModel: NoticiasViewModel
    private lateinit var binding: FragmentNoticiasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentNoticiasBinding>(inflater,
            R.layout.fragment_noticias, container, false)


        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.lifecycleOwner = this

        viewModel = ViewModelProvider(this).get(NoticiasViewModel::class.java)

        binding.viewModel = viewModel
    }


}
