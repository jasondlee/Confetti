package dev.johnoreilly.confetti.wear.preview

import dev.johnoreilly.confetti.GetConferencesQuery
import dev.johnoreilly.confetti.fragment.SessionDetails
import dev.johnoreilly.confetti.fragment.SpeakerDetails
import dev.johnoreilly.confetti.wear.proto.Theme
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime

object TestFixtures {
    val sessionTime = LocalDateTime.parse("2023-04-13T14:00")

    val kotlinConf2023 = GetConferencesQuery.Conference(
        "kotlinconf2023",
        listOf(
            LocalDate.parse("2023-04-12"),
            LocalDate.parse("2023-04-13"),
            LocalDate.parse("2023-04-14")
        ),
        "KotlinConf 2023"
    )

    // Generate from FetchDataTest.fetchConferences
    val conferences = listOf(
        kotlinConf2023,
        GetConferencesQuery.Conference(
            "fosdem2023",
            listOf(LocalDate.parse("2023-02-04"), LocalDate.parse("2023-02-05")),
            "Fosdem 2023"
        ),
        GetConferencesQuery.Conference(
            "droidconlondon2022",
            listOf(LocalDate.parse("2022-10-27"), LocalDate.parse("2022-10-28")),
            "droidcon London"
        ),
        GetConferencesQuery.Conference(
            "devfestnantes",
            listOf(LocalDate.parse("2022-10-20"), LocalDate.parse("2022-10-21")),
            "DevFest Nantes"
        ),
        GetConferencesQuery.Conference(
            "graphqlsummit2022",
            listOf(LocalDate.parse("2022-10-04"), LocalDate.parse("2022-10-05")),
            "GraphQL Summit"
        ),
        GetConferencesQuery.Conference(
            "frenchkit2022",
            listOf(LocalDate.parse("2022-09-29"), LocalDate.parse("2022-09-30")),
            "FrenchKit"
        ),
        GetConferencesQuery.Conference(
            "droidconsf",
            listOf(LocalDate.parse("2022-06-02"), LocalDate.parse("2022-06-03")),
            "droidcon SF"
        )
    )

    const val JohnUrl = "https://sessionize.com/image/48e7-400o400o2-HkquSQhsfczBGkrABwVTBc.jpg"
    val JohnOreilly = SessionDetails.Speaker(
        __typename = "Speaker",
        speakerDetails = SpeakerDetails(
            id = "0392772c-28d4-47f6-bd39-47d743fb4a81",
            name = "John O'Reilly",
            photoUrl = JohnUrl,
            tagline = "Software Engineer",
            company = null,
            companyLogoUrl = null,
            city = null,
            bio = "John is a Kotlin GDE that has been developing Android apps since 2010. He worked on server side Java applications in the 2000s and desktop clients in the 1990s. He's also been exploring and advocating for all things Kotlin Multiplatform since 2018.",
            socials = emptyList(),
            sessions = emptyList()
        )
    )

    const val MartinUrl = "https://sessionize.com/image/7c96-400o400o2-UiWeCMZDxPejrFsozKmLYr.jpeg"
    val MartinBonnin = SessionDetails.Speaker(
        __typename = "Speaker",
        speakerDetails = SpeakerDetails(
            id = "56fda597-4927-4d25-9a80-4795d15ef080",
            name = "Martin Bonnin",
            photoUrl = MartinUrl,
            tagline = "Software Engineer",
            company = null,
            companyLogoUrl = null,
            city = null,
            bio = "Martin is a maintainer of Apollo Kotlin. He has been writing Android applications since Cupcake and fell in love with Kotlin in 2017. Martin loves naming things and the sound of his laptop fan compiling all these type-safe programs. When not busy rewriting all his bash scripts in Kotlin, Martin loves to hike the Pyrénées or play a good game of Hearthstone.",
            socials = emptyList(),
            sessions = emptyList()
        )
    )

    val sessionDetails = SessionDetails(
        id = "368995",
        title = "Confetti: building a Kotlin Multiplatform conference app in 40min",
        type = "talk",
        startsAt = LocalDateTime.parse("2023-04-13T14:00"),
        endsAt = LocalDateTime.parse("2023-04-13T14:45"),
        sessionDescription = """In this talk Martin and John will live code the development of Confetti, a fullstack conference app using a graphql-kotlin backend and KMM based mobile clients

The talk will cover
- development of the graphql-kotlin backend
- use of Apollo library and it's Kotlin Multiplatform support allowing addition of GraphQL queries and related logic in code shared between iOS and Android clients.
- development of mobile clients that consume the shared KMM code (using Jetpack Compose on Android and SwiftUI on iOS)""",
        language = "en-US",
        speakers = listOf(
            JohnOreilly,
            MartinBonnin
        ),
        room = SessionDetails.Room(name = "Effectenbeurszaal"),
        tags = listOf(),
        __typename = "Session"
    )

    val MobileTheme = Theme(
        primary = 0xff8c4190L.toInt(),
        primaryVariant = 0xffffd5fcL.toInt(),
        secondary = 0xffa23f16L.toInt(),
        secondaryVariant = 0xffffebfbL.toInt(),
        surface = 0xfffcfcfcL.toInt(),
        error = 0xffba1b1bL.toInt(),
        onPrimary = 0xffffffffL.toInt(),
        onSecondary = 0xffffffffL.toInt(),
        onBackground = 0xff201a1bL.toInt(),
        onSurface = 0xff201a1bL.toInt(),
        onSurfaceVariant = 0xff4e444cL.toInt(),
        onError = 0xffffffffL.toInt(),
    )
}