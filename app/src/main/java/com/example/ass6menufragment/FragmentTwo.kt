package com.example.ass6menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_two.view.*


class FragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        view.btnClickFragTwo.setOnClickListener(){
            var fragment: Fragment? = null
            fragment = FragmentOne()
            replaceFragment(fragment)
        }
        return view
    }
    fun replaceFragment(someFragment: Fragment){
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.FrameLayout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}