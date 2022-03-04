package com.motionweb.halal.ui.fragment.settings

import android.app.Dialog
import android.view.WindowManager
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.findNavController
import com.motionweb.halal.R
import com.motionweb.halal.core.ui.fragment.CoreFragment
import com.motionweb.halal.databinding.FragmentSettingsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingsFragment : CoreFragment<FragmentSettingsBinding>() {

    override fun createVB(): FragmentSettingsBinding =
        FragmentSettingsBinding.inflate(layoutInflater)

    override fun setupViews() {
        super.setupViews()
        vb.nrCountry.setOnClickListener {
            findNavController().navigate(R.id.countryFragment2)
        }
        vb.nrLanguage.setOnClickListener {
            findNavController().navigate(R.id.languagePrefsFragment)
        }
       vb.nrTheme .setOnClickListener{
           /*repair_theme.setOnClickListener {
               dialog = Dialog(requireActivity())
               dialog.setContentView(R.layout.theme)
               val width = WindowManager.LayoutParams.WRAP_CONTENT
               val height = WindowManager.LayoutParams.WRAP_CONTENT
               dialog.window!!.setLayout(width, height)
               dialog.getWindow()!!.setBackgroundDrawableResource(R.drawable.shape_radio)
               dialog.show()
               val textViewNo = dialog.findViewById<TextView>(R.id.btn_theme_otmena)
               val textViewYes = dialog.findViewById<TextView>(R.id.btn_theme_ok)
               textViewNo.setOnClickListener {
                   dialog.dismiss()
               }
               textViewYes.setOnClickListener {
                   val radioGroup: RadioGroup = dialog.findViewById<RadioGroup>(R.id.Theme_RadioGroup)
                   val di = radioGroup.checkedRadioButtonId
                   if (di == R.id.rb_Light) {
                       AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                   } else if (di == R.id.rb_Dark) {
                       AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                   }
                   dialog.dismiss()

               }
           }

*/





       }

    }

}