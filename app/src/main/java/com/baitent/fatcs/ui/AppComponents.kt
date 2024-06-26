package com.baitent.fatcs.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.baitent.fatcs.R
import kotlin.system.measureTimeMillis

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
    TextComponent(textValue = "Hacer", textSize = 24.sp)
}


@Composable
fun TextFieldComponent(
    onTextChanged: (name: String) -> Unit
) {
    var currentValue by remember {
        mutableStateOf("")

    }
    val localFocusManager = LocalFocusManager.current

    OutlinedTextField(
        value = currentValue,
        onValueChange = {
            currentValue = it
            onTextChanged(it)

        },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done,
        ),
        keyboardActions = KeyboardActions {
            localFocusManager.clearFocus()
        },
        placeholder = {
            Text(text = "Enter your name..", fontSize = 18.sp)
        },
        textStyle = TextStyle.Default.copy(fontSize = 24.sp)

    )

}

@Preview(showBackground = true)
@Composable
fun TextFieldComponentPreview() {
}


@Composable
fun AnimalCard(image: Int, isSelected: Boolean, selectAnimal: (animalName: String) -> Unit) {

    val localFocusManager = LocalFocusManager.current

    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .padding(24.dp)
            .size(130.dp)

    ) {
        Box(

            modifier = Modifier
                .fillMaxSize()
                .border(
                    shape = RoundedCornerShape(8.dp),
                    width = 1.dp,
                    color = if (isSelected) Color.Green else Color.Transparent
                )
        ) {
            Image(
                modifier = Modifier
                    .padding(16.dp)
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .clickable {
                        val animalName = if (image == R.drawable.cat) "Cat" else "Dog"
                        selectAnimal(animalName)
                        localFocusManager.clearFocus()
                    },
                painter = painterResource(id = image),
                contentDescription = "Cat"
            )
        }

    }

}

@Preview
@Composable
fun AnimalCardPreview() {
    AnimalCard(R.drawable.cat, true, {})
}

@Composable
fun ButtonComponent(goToDetailScreen: () -> Unit) {
    Button(
        onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(),
    ) {
        TextComponent(
            textValue = "Go to Details Screen",
            textSize = 18.sp, color = Color.White
        )
    }
}