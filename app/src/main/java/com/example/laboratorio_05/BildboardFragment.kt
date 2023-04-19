package com.example.laboratorio_05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BildboardFragment : Fragment() {

    private lateinit var actionNavToCreateMovie: FloatingActionButton
    private lateinit var actionNavToMovie: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bildboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind(view)

        actionNavToCreateMovie.setOnClickListener {
            //se puede usar it o view no hay ningùn problema
            view.findNavController().navigate(R.id.action_bildboardFragment_to_createMovieFragment)
        }

        actionNavToMovie.setOnClickListener{
            view.findNavController().navigate(R.id.action_bildboardFragment_to_movieFragment)
        }
    }

    private fun bind (view: View) {
        actionNavToMovie = view.findViewById(R.id.cardView_action_info)
        actionNavToCreateMovie = view.findViewById(R.id.action_toCreat_movie)
    }
}