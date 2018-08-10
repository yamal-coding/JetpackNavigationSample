package com.example.yamal.jetpacknavigationsample


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_helloworld.*

class HelloWorldFragment : Fragment() {

    // Inflate the layout for this fragment
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_helloworld, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title.text = arguments?.getString("name").let {
            String.format(getString(R.string.hello_world_fragment_title), it)
        } ?: getString(R.string.hello_world_text)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment
         */
        @JvmStatic
        fun newInstance() = HelloWorldFragment()
    }
}
