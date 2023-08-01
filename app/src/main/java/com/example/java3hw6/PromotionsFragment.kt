package com.example.java3hw6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.java3hw6.databinding.FragmentPromotionsBinding

class PromotionsFragment : Fragment() {
    private lateinit var dataFromMusicFragment:Music
    private lateinit var binding: FragmentPromotionsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPromotionsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFromMusicFragment = arguments?.getSerializable("key") as Music
        binding.tvProSinger.text = dataFromMusicFragment.singer
        binding.tvMusicSongTitle.text = dataFromMusicFragment.songTitle
    }
}