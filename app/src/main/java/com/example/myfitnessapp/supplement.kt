package com.example.myfitnessapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView


class supplement_fragment : Fragment() {
    private lateinit var webView: WebView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.supplement,container,false)
        webView=view.findViewById(R.id.wv2)
        webView.loadUrl("https://my-gym-trainer.vercel.app/index1.html")
        /*webView.webViewClient = object : WebViewClient(){
           }*/
        return view
    }
}
