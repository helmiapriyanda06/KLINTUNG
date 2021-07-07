package com.helmi_18104036.klintung.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.helmi_18104036.klintung.R
import com.helmi_18104036.klintung.databinding.FragmentAboutBinding
import com.helmi_18104036.klintung.utils.SettingPreference

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class AboutFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var binding: FragmentAboutBinding
    private lateinit var mSettingPreference: SettingPreference
    private lateinit var mContext: Context
    private var isDarkTheme:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onAttach(context: Context) {
        mContext = context
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about,container,false)
        mSettingPreference = SettingPreference(requireActivity())
        isDarkTheme = mSettingPreference.getSetting()
        showPreferenceInForm()

        binding.btnSave.setOnClickListener {
            val isDark = binding.rgTheme.checkedRadioButtonId == R.id.rb_yes
            mSettingPreference.setSetting(isDark)
            requireActivity().setResult(RESULT_CODE, Intent())
            requireActivity().finish()

            Toast.makeText(requireActivity(),"Tema berhasil diubah", Toast.LENGTH_SHORT).show()
        }


        return binding.root
    }

    private fun showPreferenceInForm(){
        if (isDarkTheme){
            binding.rbYes.isChecked = true
        }else{
            binding.rbNo.isChecked = true
        }
    }


    companion object {
        const val RESULT_CODE = 101
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AboutFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}