package com.example.androiddevtask.presentation.screens.model

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.androiddevtask.R
import com.example.androiddevtask.presentation.theme.ExtraMediumSpacing
import com.example.androiddevtask.presentation.theme.MediumSpacing
import com.example.androiddevtask.presentation.theme.SmallSpacing


@Composable
fun CardModel(
    companyId: String,
    companyName: String,
    logo: String,
    highlightTextColor: String,
    mainColor: String,
    textColor: String,
    accentColor: String,
    cardBackgroundColor: String,
    backgroundColor: String,
    name: String,
    requiredSum: Int,
    markToCash: Int,
    onClickToDetail: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .height(270.dp)
            .padding(ExtraMediumSpacing)
            .clip(RoundedCornerShape(15.dp))
            .background(color = Color(android.graphics.Color.parseColor(cardBackgroundColor)))
    ) {
        Row(
            modifier = Modifier.padding(MediumSpacing),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = companyName,
                style = MaterialTheme.typography.titleSmall,
                color = Color(android.graphics.Color.parseColor(highlightTextColor))
            )
            Spacer(modifier = Modifier.weight(1f))
            AsyncImage(
                model = logo,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(35.dp)
                    .clip(CircleShape)
            )
        }
        Spacer(modifier = Modifier.height(MediumSpacing))
        Divider(color = Color(android.graphics.Color.parseColor(textColor)))
        Spacer(modifier = Modifier.height(MediumSpacing))
        Row(
            modifier = Modifier
                .padding(start = MediumSpacing)
                .padding(SmallSpacing),
        ) {
            Text(
                text = requiredSum.toString(),
                style = MaterialTheme.typography.bodyLarge,
                color = Color(android.graphics.Color.parseColor(highlightTextColor))
            )
            Spacer(modifier = Modifier.width(SmallSpacing))
            Text(
                text = stringResource(id = R.string.point),
                style = MaterialTheme.typography.bodyLarge,
                color = Color(android.graphics.Color.parseColor(textColor))
            )
        }
        Row(
            modifier = Modifier
                .padding(start = MediumSpacing)
                .padding(SmallSpacing),
        ) {
            Column {
                Text(
                    text = stringResource(id = R.string.cashback),
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color(android.graphics.Color.parseColor(textColor))
                )
                Text(
                    text = markToCash.toString(),
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color(android.graphics.Color.parseColor(highlightTextColor))
                )
            }
            Spacer(modifier = Modifier.width(ExtraMediumSpacing))
            Column {
                Text(
                    text = stringResource(id = R.string.level),
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color(android.graphics.Color.parseColor(textColor))
                )
                Text(
                    text = name,
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color(android.graphics.Color.parseColor(highlightTextColor))
                )
            }
        }
        Spacer(modifier = Modifier.height(MediumSpacing))
        Divider(color = Color(android.graphics.Color.parseColor(textColor)))
        Spacer(modifier = Modifier.height(MediumSpacing))
        Row(
            modifier = Modifier.padding(ExtraMediumSpacing),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_eye),
                contentDescription = null,
                tint = Color(android.graphics.Color.parseColor(mainColor)),
                modifier = Modifier.size(28.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.icon_trash),
                contentDescription = null,
                tint = Color(android.graphics.Color.parseColor(accentColor)),
                modifier = Modifier.size(28.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            IconButton(
                onClick = { onClickToDetail(companyId) },
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(
                        Color(
                            android.graphics.Color.parseColor(
                                backgroundColor
                            )
                        )
                    )
            ) {
                Text(
                    modifier = Modifier.padding(ExtraMediumSpacing),
                    text = stringResource(id = R.string.more_details),
                    color = Color(android.graphics.Color.parseColor(mainColor))
                )
            }
        }
    }
}

