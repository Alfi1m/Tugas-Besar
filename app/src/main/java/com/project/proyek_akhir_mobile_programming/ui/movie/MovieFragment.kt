package com.project.proyek_akhir_mobile_programming.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.proyek_akhir_mobile_programming.R
import com.project.proyek_akhir_mobile_programming.databinding.FragmentMovieBinding

class MovieFragment : Fragment() {

    private var _binding: FragmentMovieBinding? = null
    private lateinit var binding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        if (_binding == null){
            _binding = FragmentMovieBinding.inflate(inflater, container, false)
            binding = _binding as FragmentMovieBinding
        }

        return binding.root
    }
}