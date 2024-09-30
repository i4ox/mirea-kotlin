package com.example.pr4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pr4.databinding.FragmentListBinding
import java.io.File

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private val dataList = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()

        val adapter = PhotoListAdapter(dataList)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter
    }

    private fun loadData() {
        val file = File(requireContext().getExternalFilesDir("photos"), "date.txt")
        if (file.exists()) {
            file.readLines().forEach {
                dataList.add(it)
            }
        }
    }
}