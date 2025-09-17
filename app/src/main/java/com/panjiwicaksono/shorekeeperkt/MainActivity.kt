package com.panjiwicaksono.shorekeeperkt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.panjiwicaksono.shorekeeperkt.ui.theme.ShorekeeperKtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainWindow()
        }
    }
}

@Preview(showSystemUi = false)
@Composable
fun MainWindow(modifier: Modifier = Modifier){
    Box(modifier = modifier.background(Color.Black).fillMaxSize()){
        Column(modifier = modifier.padding(top= 45.dp)) {
            Image(
                painter = painterResource(R.drawable.intersection),
                contentDescription = "Shorekeeper",
                modifier = modifier.clip(RoundedCornerShape(bottomEnd = 16.dp))
            )

            Text(
                text = stringResource(R.string.header),
                fontSize = 35.sp,
                modifier = modifier.padding(start = 20.dp, end = 20.dp, top = 20.dp),
                color = Color.White,
                fontFamily = FontFamily.Serif
            )

            Box(modifier = modifier.fillMaxWidth()){
                Text(
                    text = stringResource(R.string.h1),
                    modifier.padding(start = 120.dp, end = 20.dp, top = 10.dp).align(Alignment.CenterEnd),
                    fontSize = 11.sp,
                    color = Color.White,
                )
                Image(
                    painter = painterResource(R.drawable.sk1),
                    contentDescription = null,
                    modifier.padding(start = 20.dp, top = 16.dp).size(90.dp).align(Alignment.CenterStart)
                        .clip(RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp, bottomStart = 16.dp))
                )
            }

            Box(modifier = modifier.fillMaxWidth().padding(top = 10.dp, start = 20.dp, end = 20.dp)){
                Image(
                    painter = painterResource(R.drawable.sk2),
                    contentDescription = null,
                    modifier = modifier.size(90.dp).align(Alignment.CenterEnd).clip(
                        RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp, bottomStart = 16.dp)
                    )
                )
                Text(
                    text = stringResource(R.string.h2),
                    modifier = modifier.padding(end = 90.dp),
                    fontSize = 11.sp,
                    color = Color.White
                )
            }
        }
        Row(modifier.fillMaxWidth().align(Alignment.BottomCenter).padding(bottom = 30.dp),
            horizontalArrangement = Arrangement.Center,
        ){
            Image(painter = painterResource(R.drawable.studio), contentDescription = null, modifier = modifier.size(41.dp).padding(top = 2.dp))
            Image(painter = painterResource(R.drawable.kotlin), contentDescription = null, modifier = modifier.size((41.dp)).padding(top = 5.dp) )
        }

    }
}