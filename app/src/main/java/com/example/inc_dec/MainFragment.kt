package com.example.inc_dec

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.inc_dec.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var count = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPlus.setOnClickListener {
            count++
            binding.zeroTv.text = count.toString()
            if (count == 10) {
                binding.btnPlus.setText(("-1")).toString().plus(count--)
                count--
                if (count == 0) {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, SecondFragment()).addToBackStack(null)
                        .commit()


                }


            }


        }
    }
}
