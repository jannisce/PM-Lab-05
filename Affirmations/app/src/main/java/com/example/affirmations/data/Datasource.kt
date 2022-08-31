package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Plant

class Datasource() {

    fun loadAffirmations(): List<Plant> {
        return listOf<Plant>(
            Plant(R.string.affirmation1, "https://imgur.com/t/plants_vs_zombies/OZU06CJ"),
            Plant(R.string.affirmation2, "https://imgur.com/t/plants_vs_zombies/FLXxq"),
            Plant(R.string.affirmation3, "https://imgur.com/t/plants_vs_zombies/lvLkbAh"),
            Plant(R.string.affirmation4, "https://imgur.com/t/plants_vs_zombies/Jj8Pm"),
            Plant(R.string.affirmation5, "https://imgur.com/t/plants_vs_zombies/86pJ9"),
            Plant(R.string.affirmation6, "https://imgur.com/t/plants_vs_zombies/UzRaF"),
            Plant(R.string.affirmation7, "https://imgur.com/t/plants_vs_zombies/yKxRN"),
            Plant(R.string.affirmation8, "https://imgur.com/t/plants_vs_zombies/qR2SPXg"),
            Plant(R.string.affirmation9, "https://imgur.com/t/plants_vs_zombies/2KfQO0f"),
            Plant(R.string.affirmation10, "https://imgur.com/t/plants_vs_zombies/eBFfYUx")
        )
    }
}