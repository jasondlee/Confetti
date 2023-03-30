@file:OptIn(ExperimentalHorologistComposeLayoutApi::class, ExperimentalHorologistApi::class)

package dev.johnoreilly.confetti.wear.sessions

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TitleCard
import com.google.android.horologist.annotations.ExperimentalHorologistApi
import com.google.android.horologist.compose.layout.ScalingLazyColumnState
import com.google.android.horologist.compose.navscaffold.ExperimentalHorologistComposeLayoutApi
import dev.johnoreilly.confetti.ConfettiViewModel
import dev.johnoreilly.confetti.fragment.SessionDetails
import kotlinx.datetime.LocalDate
import org.koin.androidx.compose.getViewModel

@Composable
fun SessionsRoute(
    date: LocalDate,
    navigateToSession: (String) -> Unit,
    columnState: ScalingLazyColumnState,
    viewModel: ConfettiViewModel = getViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    SessionListView(
        date = date,
        uiState = uiState,
        sessionSelected = navigateToSession,
        columnState = columnState
    )
}

@Composable
fun SessionView(
    session: SessionDetails,
    sessionSelected: (sessionId: String) -> Unit,
) {
    val speakers = session.speakers.joinToString(", ") { it.name }

    TitleCard(
        modifier = Modifier.fillMaxWidth(),
        onClick = { sessionSelected(session.id) },
        title = { Text(session.title) }
    ) {
        if (speakers.isNotEmpty()) {
            Text(speakers)
        }
    }
}

