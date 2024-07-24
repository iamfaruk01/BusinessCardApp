package com.faruk.a11_business_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.faruk.a11_business_card.ui.theme._11_business_cardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _11_business_cardTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xFFD2E8D4))
                        .padding(top = 240.dp),

                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SectionA(
                        name = stringResource(id = R.string.name),
                        title = stringResource(R.string.title),
                        modifier = Modifier
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 92.dp, top = 620.dp),



                ) {
                    SectionB(
                        stringResource(id = R.string.phone),
                        stringResource(id = R.string.share),
                        stringResource(id = R.string.email)
                    )
                }
            }
        }
    }
}

@Composable
fun SectionA(
    name: String,
    title: String,
    modifier: Modifier = Modifier
){
    val image = painterResource(id = R.drawable.android_logo)
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
            .size(120.dp)
            .background(color = Color(0xFF073042))

    )
    Text(
        text = name,
        fontSize = 44.sp,
        fontWeight = FontWeight.W200

    )
    Text(
        text = title,
        color = Color(0xFF016C38),
        fontWeight = FontWeight.Bold

    )

}

@Composable
fun SectionB(
    phone: String,
    share: String,
    email: String,
    modifier: Modifier = Modifier
){
    Row {
        val imageCall = painterResource(id = R.drawable.baseline_call_24)
        Image(
            painter = imageCall,
            contentDescription = null,
            modifier = modifier
                .padding(end = 12.dp),
            colorFilter = ColorFilter.tint(color = Color(0xFF016C38))
        )
        Text(
            text = phone,
            color = Color(0xFF016C38)
        )
    }
    Row {
        val imageShare = painterResource(id = R.drawable.baseline_share_24)
        Image(
            painter = imageShare,
            contentDescription = null,
            modifier = modifier
                .padding(end = 12.dp, top = 12.dp),
            colorFilter = ColorFilter.tint(color = Color(0xFF016C38))
        )
        Text(text = share, modifier = modifier.padding(top = 12.dp), color = Color(0xFF016C38))
    }
    Row {
        val imageEmail = painterResource(id = R.drawable.baseline_mail_24)
        Image(
            painter = imageEmail,
            contentDescription = null,
            modifier = modifier
                .padding(end = 12.dp, top = 12.dp),
            colorFilter = ColorFilter.tint(color = Color(0xFF016C38))
        )
        Text(
            text = email,
            modifier = modifier
                .padding(top = 12.dp),
            color = Color(0xFF016C38)
        )
    }
}