package com.github.angellicaa99.superhero

import android.app.Application

class MyApplication: Application() {

    data class Scene(
        val title: String,
        val body: String,
        val actions: List<String>
    )

    companion object {
        // Constants
        val MAIN_MENU = "Main Menu"
        val TRY_AGAIN = "Try Again"


        // Scenes
        val scenes: List<Scene> = listOf (
            // 0
            Scene (
                "Introduction",
                "Super-Man can hear the heartbeat of every individual on this planet. " +
                        " He can also tell which one is Bat-Man’s (Bruce Wayne’s).",


                    actions = listOf (
                    "Click",
                    "Tap"

                )
            ),

            // 1
            Scene (
                "Spider-Man once managed to defeat The Hulk by telling a joke and calming him down.",
                "The Hulk turned back to Bruce Banner so he could laugh.",
                actions = listOf (
                    "Spider-Man once managed to defeat",
                    "The Hulk by telling a joke"
                )
            ),

            // 2
            Scene (
                "Deathstroke the superhero had the ability to use 90% of his brain at one time.",
                "He was the master of Karate as well.",
                actions = listOf (
                    "Deathstroke the superhero",
                    "master of Karate"

                )
            ),

            // 3
            Scene (
                "When Richard and Mary Parker were told by the doctor that they were going to have a boy,",
                "Wolverine was standing by them all the time.",
                actions = listOf (
                    "doctor",
                    "going to have a boy"

                )
            ),

            // 4
            Scene (
                "The superhero Winter Soldier had the ability to throw the shield so fast that it could slice the human limbs,",
                "assault the rifles and control panels.",
                actions = listOf (
                    "human limbs",
                    "rifles and control panel"

                )
            ),

            // 5
            Scene (
                "Toxin once saved Spiderman and Black Cat from the Venom",
                "and Carnage by beating them both with a single hand.",
                actions = listOf (
                    "toxin",
                    "carnage by beating"
                )
            ),

            // 6
            Scene (
                "Superman is known as the last son of Krypton,",
                "but the survivor of the planet’s also included his cousin. Dog and some criminals in the Phantom Zone.",
                actions = listOf (
                    "Make all existence back to normal",
                    "last son of krypton"
                )
            ),

            // 7 -- badEnding1
            Scene (
                "Bad Ending: All existence erased",
                "There is an issue called The Punisher Kills the Marvel Universe, where he kills every single Marvel superhero and villain, including himself.",
                actions = listOf (
                    MAIN_MENU,
                    TRY_AGAIN

                )
            ),

            // 8
            Scene (
                "Iron Man was developed by Stan Lee as a contest to produce a hero",
                "no one should like and force people to like him.",
                actions = listOf (
                    "iron man",
                    "contest to produce hero"

                )
            ),

            // 9
            Scene (
                "The Teenage Mutant Ninja Turtles was formerly an imitation of Daredevil,",
                "and both Daredevil and the Turtles were created from the same accident.",
                actions = listOf (
                    "There is an issue called The Punisher Kills the Marvel Universe,",
                    "where he kills every single Marvel superhero and villain,",
                    "including himself."
                )
            ),


            // 10
            Scene (
                "Normal Ending: There is an issue called The Punisher Kills the Marvel Universe,",
                "where he kills every single Marvel superhero and villain, including himself.",
                actions = listOf (
                    MAIN_MENU,
                    TRY_AGAIN
                )
            ),



            // 11
            Scene (
                "Best Ending: You're a hero, you restore all existence back to normal",
                "Congratulations Superhero",
                actions = listOf (
                    MAIN_MENU,
                    TRY_AGAIN
                )
            )

            )

        // Ending flags
        var badEnding = false
        var normalEnding = false
        var bestEnding = false

        // Utils
        lateinit var currentDisplayedEnding: Scene
    }
}