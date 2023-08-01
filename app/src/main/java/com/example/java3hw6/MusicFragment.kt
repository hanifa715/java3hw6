package com.example.java3hw6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.java3hw6.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {
    private lateinit var binding: FragmentMusicBinding
    private var songList = arrayListOf(
        Music(1,"Blank Space","Taylor Swift","3:22"),
        Music(2,"Watch me","Silento","5:36"),
        Music(3,"Earned it","The Weeknd","4:51"),
        Music(4,"The Hills","The Weeknd","3:41"),
        Music(5,"Writing's On The Wall","Sam Smith","5:33"),
    )
    private val bundle = Bundle()
    private val promotionsFragment:PromotionsFragment = PromotionsFragment()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MusicAdapter(songList,this::onClick)
        binding.rvMusic.adapter = adapter
    }
    fun onClick(position:Int){
        bundle.putSerializable("key",songList[position])
        promotionsFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.promotions_container,promotionsFragment).addToBackStack(null).commit()
    }


}