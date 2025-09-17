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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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

@Preview(showSystemUi = true)
@Composable
fun MainWindow(modifier: Modifier = Modifier){
    Box(modifier = modifier.background(Color.White).fillMaxSize()){
        Column(modifier = modifier.padding(top= 30.dp)) {
            Image(
                painter = painterResource(R.drawable.intersection),
                contentDescription = "Shorekeeper"
            )
            Text(
                text = stringResource(R.string.header),
//                color = Color.White,
                fontSize = 30.sp,
                modifier = modifier.padding(20.dp)
            )
            Text(
                text = stringResource(R.string.h1),
//                color = Color.White,
                modifier = modifier.padding(start = 20.dp, end = 20.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text = stringResource(R.string.h2),
//                color = Color.White,
                modifier = modifier.padding( 20.dp),
                textAlign = TextAlign.Justify

            )
        }
        Row(modifier.fillMaxWidth().align(Alignment.BottomCenter).padding(bottom = 30.dp),
            horizontalArrangement = Arrangement.Center,
        ){
            Image(painter = painterResource(R.drawable.studio), contentDescription = null, modifier = modifier.size(41.dp).padding(top = 2.dp))
            Image(painter = painterResource(R.drawable.kotlin), contentDescription = null, modifier = modifier.size((41.dp)).padding(top = 5.dp) )
        }
    }
}