package com.nguyen.codelabdatabinding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.nguyen.codelabdatabinding.R
import com.nguyen.codelabdatabinding.data.SimpleViewModelSolution
import com.nguyen.codelabdatabinding.databinding.PlainActivitySolution4Binding

/**
 * Fourth version of the Activity in the codelab.
 */
class PlainOldActivitySolution4 : AppCompatActivity() {

    // Obtain ViewModel from ViewModelProviders
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimpleViewModelSolution::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: PlainActivitySolution4Binding =
            DataBindingUtil.setContentView(this, R.layout.plain_activity_solution_4)

        binding.lifecycleOwner = this  // use Fragment.viewLifecycleOwner for fragments

        binding.viewmodel = viewModel
    }
}
