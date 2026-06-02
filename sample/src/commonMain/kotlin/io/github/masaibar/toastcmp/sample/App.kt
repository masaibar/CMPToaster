package io.github.masaibar.toastcmp.sample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.masaibar.toastcmp.ToastDuration
import io.github.masaibar.toastcmp.rememberToast

@Composable
fun App() {
  MaterialTheme {
    val toast = rememberToast()
    Surface(modifier = Modifier.fillMaxSize()) {
      Column(
        modifier = Modifier
          .fillMaxSize()
          .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
      ) {
        Text(
          text = "ToastCMP sample",
          style = MaterialTheme.typography.headlineSmall
        )
        Button(
          onClick = { toast.show("Saved!") },
          modifier = Modifier.fillMaxWidth()
        ) {
          Text("Show short toast")
        }
        Button(
          onClick = { toast.show("Upload finished", ToastDuration.LONG) },
          modifier = Modifier.fillMaxWidth()
        ) {
          Text("Show long toast")
        }
      }
    }
  }
}
