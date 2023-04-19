package com.example.coco.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.coco.R
import com.example.coco.databinding.FragmentIntro1Binding


// findViewByID -> ViewBinding

class IntroFragment1 : Fragment() {

    // viewBinding 쓰기
    private var _binding : FragmentIntro1Binding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIntro1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextBtn.setOnClickListener {
            // main_nav의 intro 1 -> intro 2 로 이동하는 action 사용
            Navigation.findNavController(view).navigate(R.id.action_introFragment1_to_introFragment2)
        }
    }

    // Fragment가 없어졌을 때 처리
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}