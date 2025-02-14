package com.udacity.shoestore.screens.onbroarding.welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        binding.btnLetsGo.setOnClickListener {
            findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToInstructionFragment())
        }
        return binding.root
    }
}