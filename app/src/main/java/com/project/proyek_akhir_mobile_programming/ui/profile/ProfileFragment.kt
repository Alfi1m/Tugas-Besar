package com.project.proyek_akhir_mobile_programming.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.proyek_akhir_mobile_programming.databinding.FragmentTvShowBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentTvShowBinding? = null
    private lateinit var binding: FragmentTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        if (_binding == null){
            _binding = FragmentTvShowBinding.inflate(layoutInflater, container, false)
            binding = _binding as FragmentTvShowBinding
        }
        return binding.root
    }

}