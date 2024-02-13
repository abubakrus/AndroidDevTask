package com.example.androiddevtask.presentation.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.androiddevtask.presentation.theme.Blue
import com.example.androiddevtask.presentation.theme.ExtraMediumSpacing
import com.example.androiddevtask.presentation.theme.ExtraSmallSpacing
import com.example.androiddevtask.presentation.theme.LargeSpacing
import com.example.androiddevtask.presentation.theme.MediumSpacing


@Composable
fun TabBar(
    title: String? = String(),
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.CenterStart,
) {
    Surface(
        modifier = modifier
            .statusBarsPadding()
            .fillMaxWidth()
            .padding(horizontal = LargeSpacing)
            .padding(top = MediumSpacing, bottom = ExtraSmallSpacing),
        color = MaterialTheme.colorScheme.surface
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.background),
        ) {
            if (title != null) Text(
                modifier = Modifier
                    .padding(top = ExtraMediumSpacing, bottom = ExtraMediumSpacing)
                    .align(Alignment.Center),
                text = title,
                style = MaterialTheme.typography.titleLarge,
                color = Blue,
            )
        }
    }
}
