package com.example.cupcake

import androidx.fragment.app.testing.launchFragment
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AndroidTest {

    @Test
    fun navigate_to_frags(){
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )
        launchFragment<FlavorFragment>(themeResId = R.style.ThemeOverlay_AppCompat)
            .onFragment{fragment ->
                navController.setGraph(R.navigation.nav_graph)
                Navigation.setViewNavController(fragment.requireView(), navController)}
    }

}