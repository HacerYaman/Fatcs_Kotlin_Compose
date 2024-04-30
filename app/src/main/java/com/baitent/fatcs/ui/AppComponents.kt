package com.baitent.fatcs.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.baitent.fatcs.R

@Composable
fun TopBar(value: String) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = value,
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            modifier = Modifier.size(24.dp),
            painter = painterResource(id = R.drawable.love),
            contentDescription = "Love"
        )

    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar(AppConstants().appBarText)
}

@Composable
fun TextComponent(
    textValue: String,
    textSize: TextUnit,
    color: Color = Color.Black
) {
    Text(
        text = textValue,
        fontSize = textSize,
        color = color, fontWeight = FontWeight.Light
    )
}

@Preview(showBackground = true)
@Composable
fun TextComponentPreview() {
    TextComponent(textValue = "", textSize = 24.sp)
}


@Composable
fun TextFieldComponent(){
    var currentValue by remember {
        mutableStateOf("")

    }
    OutlinedTextField(value = currentValue, onValueChange = {  } ,
        modifier = Modifier.fillMaxWidth(),
        placeholder = {
            Text(text = "Enter your name..", fontSize = 18.sp)
        }, textStyle =  )

}

@Preview(showBackground = true)
@Composable
fun TextFieldComponentPreview(){
    TextFieldComponent()
}


