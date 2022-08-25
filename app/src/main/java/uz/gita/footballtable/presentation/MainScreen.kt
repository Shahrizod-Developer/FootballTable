package uz.gita.footballtable.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.footballtable.R
import uz.gita.footballtable.databinding.MainScreenBinding

class MainScreen : Fragment() {


    private val binding by viewBinding(MainScreenBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}