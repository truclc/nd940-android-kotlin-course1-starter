package com.udacity.shoestore.screens.onbroarding.instructions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentInstructionsBinding.inflate(inflater, container, false)
        binding.btnStart.setOnClickListener {
            findNavController().navigate(InstructionsFragmentDirections.actionInstructionFragmentToShoeListFragment())
        }
        return binding.root
    }
}