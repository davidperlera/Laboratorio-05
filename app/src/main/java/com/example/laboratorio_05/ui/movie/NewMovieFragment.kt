package com.example.laboratorio_05.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.laboratorio_05.R
import com.example.laboratorio_05.data.models.MovieModel
import com.example.laboratorio_05.databinding.ActivityMainBinding
import com.example.laboratorio_05.databinding.FragmentCreateMovieBinding


class NewMovieFragment : Fragment() {

    private lateinit var binding: FragmentCreateMovieBinding

    private val viewModel: MovieViewModel by activityViewModels() {
        MovieViewModel.Factory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCreateMovieBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.actionSubmit.setOnClickListener {
            createMovie()
        }
    }

    private fun createMovie() {
        val newMovie = MovieModel (
            binding.nameEdittext.text.toString(),
            binding.categoryEdittext.text.toString(),
            binding.descriptionEdittext.text.toString(),
            binding.calificationEdittext.text.toString(),
        )

        viewModel.addMovie(newMovie)

        Log.d("TAG APP", viewModel.getMovies().toString())

        findNavController().popBackStack()
    }
}