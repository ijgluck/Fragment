package com.ijeoma.fragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.ijeoma.fragment.R
import com.ijeoma.fragment.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var manager: FragmentManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
       manager = requireActivity().supportFragmentManager
        binding.apply {
            NextButton.setOnClickListener {

            }

        }
        return binding.root
    }
private fun OpenNextFragment(){
    manager.commit {
        replace<NewFragment>(R.id.FragmentContainerView)
        setRecorderingAllowed(True)
        addToBackStack("")
    }
}

}