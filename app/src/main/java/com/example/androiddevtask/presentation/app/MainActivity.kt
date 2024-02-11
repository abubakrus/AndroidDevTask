package com.example.androiddevtask.presentation.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.fragment.app.FragmentActivity
import com.example.androiddevtask.presentation.theme.AndroidDevTaskTheme
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : FragmentActivity() {

    private val viewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidDevTaskTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    AndroidDevTaskComposeApp(
                        modifier = Modifier.statusBarsPadding(),
                        destinationFlow = viewModel.destinationFlow
                    )
                }
            }
        }
    }
}


