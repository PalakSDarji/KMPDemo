package com.kmpdemo.android.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kmpdemo.shared.data.UserRepository

@Composable
fun UserDetailScreen(
    userId: String,
    onBack: () -> Unit,
    repository: UserRepository = UserRepository()
) {
    val user = remember(userId) { repository.getUser(userId) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(user?.name ?: "User Details") },
                navigationIcon = {
                    TextButton(onClick = onBack) {
                        Text("Back")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(PaddingValues(16.dp)),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            if (user == null) {
                Text(
                    text = "User not found.",
                    style = MaterialTheme.typography.bodyLarge
                )
            } else {
                Text(text = "Email", style = MaterialTheme.typography.labelLarge)
                Text(text = user.email, style = MaterialTheme.typography.bodyLarge)

                Text(text = "Location", style = MaterialTheme.typography.labelLarge)
                Text(text = user.location, style = MaterialTheme.typography.bodyLarge)

                Text(text = "About", style = MaterialTheme.typography.labelLarge)
                Text(text = user.bio, style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}
