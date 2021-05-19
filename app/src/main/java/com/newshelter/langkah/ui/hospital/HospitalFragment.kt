package com.newshelter.langkah.ui.hospital

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.newshelter.langkah.databinding.FragmentHospitalBinding

class HospitalFragment : Fragment() {

    private lateinit var binding : FragmentHospitalBinding
    private lateinit var hospitalViewModel: HospitalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHospitalBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null){
            hospitalViewModel = HospitalViewModel()
            hospitalViewModel.text.observe(viewLifecycleOwner, Observer {
                binding.textDashboard.text = it
            })
        }
    }

}