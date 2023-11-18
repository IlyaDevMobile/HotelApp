package com.android.hotelapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.android.hotelapp.databinding.WelcomeFragmentBinding


class WelcomeFragment : Fragment() {


    private var _binding: WelcomeFragmentBinding? = null
    private val binding: WelcomeFragmentBinding
        get() = _binding ?: throw RuntimeException("WelcomeFragmentBinding is null")


    private var imageList = mutableListOf<Int>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = WelcomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        postToList()

        binding.viewPager2.adapter = ViewPagerAdapter(imageList)
        binding.viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        binding.circleIndicator.setViewPager(binding.viewPager2)


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun addToList(image: Int) {
        imageList.add(image)
    }

    private fun postToList() {
        repeat(3) {
            addToList(R.drawable.clubhouse)
        }
    }
}