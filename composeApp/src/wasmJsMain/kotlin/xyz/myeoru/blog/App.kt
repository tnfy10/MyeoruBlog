package xyz.myeoru.blog

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import myeorublog.composeapp.generated.resources.Res
import myeorublog.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import xyz.myeoru.blog.core.ui.theme.MyeoruBlogTheme

@Composable
fun App() {
    MyeoruBlogTheme {
        Scaffold { innerPadding ->
            var showContent by remember { mutableStateOf(false) }
            Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = { showContent = !showContent }) {
                    Text("Click me!")
                }
                AnimatedVisibility(showContent) {
                    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painterResource(Res.drawable.compose_multiplatform), null)
                        Text("Compose 123")
                    }
                }
            }
        }
    }
}