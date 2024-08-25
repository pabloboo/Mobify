package com.example.mobify.utils

import com.example.mobify.model.Routine

object RoutineConstants {

    fun findRoutineByName(routineName: String): Routine? {
        return when (routineName) {
            "Hip mobility Day 1" -> getHipMobilityDay01()
            "Hip mobility Day 2" -> getHipMobilityDay02()
            "Hip mobility Day 3" -> getHipMobilityDay03()
            "Hip mobility Day 4" -> getHipMobilityDay04()
            "Hip mobility Day 5" -> getHipMobilityDay05()
            "Hip mobility Day 6" -> getHipMobilityDay06()
            "Hip mobility Day 7" -> getHipMobilityDay07()
            "Hip mobility Day 8" -> getHipMobilityDay08()
            "Hip mobility Day 9" -> getHipMobilityDay09()
            "Hip mobility Day 10" -> getHipMobilityDay10()
            "Hip mobility Day 11" -> getHipMobilityDay11()
            "Hip mobility Day 12" -> getHipMobilityDay12()

            "Hamstring flexibility Day 1" -> getHamstringFlexibilityDay01()
            "Hamstring flexibility Day 2" -> getHamstringFlexibilityDay02()
            "Hamstring flexibility Day 3" -> getHamstringFlexibilityDay03()
            "Hamstring flexibility Day 4" -> getHamstringFlexibilityDay04()
            "Hamstring flexibility Day 5" -> getHamstringFlexibilityDay05()
            "Hamstring flexibility Day 6" -> getHamstringFlexibilityDay06()
            "Hamstring flexibility Day 7" -> getHamstringFlexibilityDay07()
            "Hamstring flexibility Day 8" -> getHamstringFlexibilityDay08()
            "Hamstring flexibility Day 9" -> getHamstringFlexibilityDay09()
            "Hamstring flexibility Day 10" -> getHamstringFlexibilityDay10()
            "Hamstring flexibility Day 11" -> getHamstringFlexibilityDay11()
            "Hamstring flexibility Day 12" -> getHamstringFlexibilityDay12()

            "Shoulder mobility Day 1" -> getShoulderMobilityDay01()
            "Shoulder mobility Day 2" -> getShoulderMobilityDay02()
            "Shoulder mobility Day 3" -> getShoulderMobilityDay03()
            "Shoulder mobility Day 4" -> getShoulderMobilityDay04()
            "Shoulder mobility Day 5" -> getShoulderMobilityDay05()
            "Shoulder mobility Day 6" -> getShoulderMobilityDay06()
            "Shoulder mobility Day 7" -> getShoulderMobilityDay07()
            "Shoulder mobility Day 8" -> getShoulderMobilityDay08()
            "Shoulder mobility Day 9" -> getShoulderMobilityDay09()
            "Shoulder mobility Day 10" -> getShoulderMobilityDay10()
            "Shoulder mobility Day 11" -> getShoulderMobilityDay11()
            "Shoulder mobility Day 12" -> getShoulderMobilityDay12()

            "Posture mobility Day 1" -> getPostureMobilityDay01()
            "Posture mobility Day 2" -> getPostureMobilityDay02()
            "Posture mobility Day 3" -> getPostureMobilityDay03()
            "Posture mobility Day 4" -> getPostureMobilityDay04()
            "Posture mobility Day 5" -> getPostureMobilityDay05()
            "Posture mobility Day 6" -> getPostureMobilityDay06()
            "Posture mobility Day 7" -> getPostureMobilityDay07()
            "Posture mobility Day 8" -> getPostureMobilityDay08()
            "Posture mobility Day 9" -> getPostureMobilityDay09()
            "Posture mobility Day 10" -> getPostureMobilityDay10()
            "Posture mobility Day 11" -> getPostureMobilityDay11()
            "Posture mobility Day 12" -> getPostureMobilityDay12()

            else -> null
        }
    }

    // Hip mobility
    fun getHipMobilityDay01(): Routine {
        return Routine(
            "Hip mobility Day 1",
            listOf(
                ExerciseConstants.getExercise(exerciseName =  "Single leg RDL"),
                ExerciseConstants.getExercise(exerciseName = "Deep split squat"),
                ExerciseConstants.getExercise(exerciseName = "Pancake stretch"),
                ExerciseConstants.getExercise(exerciseName = "Pancake stretch"),
                ExerciseConstants.getExercise(exerciseName = "Modified pigeon stretch"),
                ExerciseConstants.getExercise(exerciseName = "Modified pigeon stretch")
            )
        )
    }

    fun getHipMobilityDay02(): Routine {
        return Routine(
            "Hip mobility Day 2",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Standing hamstring kick"),
                ExerciseConstants.getExercise(exerciseName = "Wide squat"),
                ExerciseConstants.getExercise(exerciseName = "Runners lunge"),
                ExerciseConstants.getExercise(exerciseName = "Runners lunge"),
                ExerciseConstants.getExercise(exerciseName = "Butterfly stretch"),
                ExerciseConstants.getExercise(exerciseName = "Butterfly stretch")
            )
        )
    }

    fun getHipMobilityDay03(): Routine {
        return Routine(
            "Hip mobility Day 3",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Single leg RDL"),
                ExerciseConstants.getExercise(exerciseName = "Deep split squat"),
                ExerciseConstants.getExercise(exerciseName = "Pancake stretch"),
                ExerciseConstants.getExercise(exerciseName = "Pancake stretch"),
                ExerciseConstants.getExercise(exerciseName = "Modified pigeon stretch"),
                ExerciseConstants.getExercise(exerciseName = "Modified pigeon stretch")
            )
        )
    }

    fun getHipMobilityDay04(): Routine {
        return Routine(
            "Hip mobility Day 4",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Standing hamstring kick"),
                ExerciseConstants.getExercise(exerciseName = "Wide squat"),
                ExerciseConstants.getExercise(exerciseName = "Runners lunge"),
                ExerciseConstants.getExercise(exerciseName = "Runners lunge"),
                ExerciseConstants.getExercise(exerciseName = "Butterfly stretch"),
                ExerciseConstants.getExercise(exerciseName = "Butterfly stretch")
            )
        )
    }

    fun getHipMobilityDay05(): Routine {
        return Routine(
            "Hip mobility Day 5",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "90/90 Hip Switch"),
                ExerciseConstants.getExercise(exerciseName = "Standing pancake"),
                ExerciseConstants.getExercise(exerciseName = "Standing pancake"),
                ExerciseConstants.getExercise(exerciseName = "Figure four stretch"),
                ExerciseConstants.getExercise(exerciseName = "Figure four stretch"),
                ExerciseConstants.getExercise(exerciseName = "Hip flexor stretch"),
                ExerciseConstants.getExercise(exerciseName = "Hip flexor stretch")
            )
        )
    }

    fun getHipMobilityDay06(): Routine {
        return Routine(
            "Hip mobility Day 6",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Elephant walks"),
                ExerciseConstants.getExercise(exerciseName = "Couch stretch"),
                ExerciseConstants.getExercise(exerciseName = "Seated hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Seated hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Cobra"),
                ExerciseConstants.getExercise(exerciseName = "Cobra")
            )
        )
    }

    fun getHipMobilityDay07(): Routine {
        return Routine(
            "Hip mobility Day 7",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "90/90 Hip Switch"),
                ExerciseConstants.getExercise(exerciseName = "Standing pancake"),
                ExerciseConstants.getExercise(exerciseName = "Standing pancake"),
                ExerciseConstants.getExercise(exerciseName = "Figure four stretch"),
                ExerciseConstants.getExercise(exerciseName = "Figure four stretch"),
                ExerciseConstants.getExercise(exerciseName = "Hip flexor stretch"),
                ExerciseConstants.getExercise(exerciseName = "Hip flexor stretch")
            )
        )
    }

    fun getHipMobilityDay08(): Routine {
        return Routine(
            "Hip mobility Day 8",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Elephant walks"),
                ExerciseConstants.getExercise(exerciseName = "Couch stretch"),
                ExerciseConstants.getExercise(exerciseName = "Seated hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Seated hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Cobra"),
                ExerciseConstants.getExercise(exerciseName = "Cobra")
            )
        )
    }

    fun getHipMobilityDay09(): Routine {
        return Routine(
            "Hip mobility Day 9",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Duck walks"),
                ExerciseConstants.getExercise(exerciseName = "Standing pancake good morning"),
                ExerciseConstants.getExercise(exerciseName = "90/90 extensions"),
                ExerciseConstants.getExercise(exerciseName = "Wall deep squat"),
                ExerciseConstants.getExercise(exerciseName = "Wall deep squat")
            )
        )
    }

    fun getHipMobilityDay10(): Routine {
        return Routine(
            "Hip mobility Day 10",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Cossack squat"),
                ExerciseConstants.getExercise(exerciseName = "Hip circles"),
                ExerciseConstants.getExercise(exerciseName = "Modified horse stance stretch"),
                ExerciseConstants.getExercise(exerciseName = "Modified horse stance stretch"),
                ExerciseConstants.getExercise(exerciseName = "Flat back hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Flat back hamstring stretch")
            )
        )
    }

    fun getHipMobilityDay11(): Routine {
        return Routine(
            "Hip mobility Day 11",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Duck walks"),
                ExerciseConstants.getExercise(exerciseName = "Standing pancake good morning"),
                ExerciseConstants.getExercise(exerciseName = "90/90 extensions"),
                ExerciseConstants.getExercise(exerciseName = "Wall deep squat"),
                ExerciseConstants.getExercise(exerciseName = "Wall deep squat")
            )
        )
    }

    fun getHipMobilityDay12(): Routine {
        return Routine(
            "Hip mobility Day 12",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Cossack squat"),
                ExerciseConstants.getExercise(exerciseName = "Hip circles"),
                ExerciseConstants.getExercise(exerciseName = "Modified horse stance stretch"),
                ExerciseConstants.getExercise(exerciseName = "Modified horse stance stretch"),
                ExerciseConstants.getExercise(exerciseName = "Flat back hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Flat back hamstring stretch")
            )
        )
    }

    // Hamstring flexibility
    fun getHamstringFlexibilityDay01(): Routine {
        return Routine(
            "Hamstring flexibility Day 1",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Hamstring kicks"),
                ExerciseConstants.getExercise(exerciseName = "Single leg RDL"),
                ExerciseConstants.getExercise(exerciseName = "Toe touch"),
                ExerciseConstants.getExercise(exerciseName = "Toe touch")
            )
        )
    }

    fun getHamstringFlexibilityDay02(): Routine {
        return Routine(
            "Hamstring flexibility Day 2",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Elephant walks"),
                ExerciseConstants.getExercise(exerciseName = "Good morning"),
                ExerciseConstants.getExercise(exerciseName = "Single leg hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Single leg hamstring stretch")
            )
        )
    }

    fun getHamstringFlexibilityDay03(): Routine {
        return Routine(
            "Hamstring flexibility Day 3",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Hamstring kicks"),
                ExerciseConstants.getExercise(exerciseName = "Single leg RDL"),
                ExerciseConstants.getExercise(exerciseName = "Toe touch"),
                ExerciseConstants.getExercise(exerciseName = "Toe touch")
            )
        )
    }

    fun getHamstringFlexibilityDay04(): Routine {
        return Routine(
            "Hamstring flexibility Day 4",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Elephant walks"),
                ExerciseConstants.getExercise(exerciseName = "Good morning"),
                ExerciseConstants.getExercise(exerciseName = "Single leg hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Single leg hamstring stretch")
            )
        )
    }

    fun getHamstringFlexibilityDay05(): Routine {
        return Routine(
            "Hamstring flexibility Day 5",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Sit and reach (reps)"),
                ExerciseConstants.getExercise(exerciseName = "Sit and reach (hold)"),
                ExerciseConstants.getExercise(exerciseName = "Flat back hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Flat back hamstring stretch")
            )
        )
    }

    fun getHamstringFlexibilityDay06(): Routine {
        return Routine(
            "Hamstring flexibility Day 6",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Crossbody leg swings"),
                ExerciseConstants.getExercise(exerciseName = "Standing pancake"),
                ExerciseConstants.getExercise(exerciseName = "Pancake stretch"),
                ExerciseConstants.getExercise(exerciseName = "Pancake stretch")
            )
        )
    }

    fun getHamstringFlexibilityDay07(): Routine {
        return Routine(
            "Hamstring flexibility Day 7",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Sit and reach (reps)"),
                ExerciseConstants.getExercise(exerciseName = "Sit and reach (hold)"),
                ExerciseConstants.getExercise(exerciseName = "Flat back hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Flat back hamstring stretch")
            )
        )
    }

    fun getHamstringFlexibilityDay08(): Routine {
        return Routine(
            "Hamstring flexibility Day 8",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Crossbody leg swings"),
                ExerciseConstants.getExercise(exerciseName = "Standing pancake"),
                ExerciseConstants.getExercise(exerciseName = "Pancake stretch"),
                ExerciseConstants.getExercise(exerciseName = "Pancake stretch")
            )
        )
    }

    fun getHamstringFlexibilityDay09(): Routine {
        return Routine(
            "Hamstring flexibility Day 9",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Standing pancake good morning"),
                ExerciseConstants.getExercise(exerciseName = "Hamstring chokes"),
                ExerciseConstants.getExercise(exerciseName = "Toe touch"),
                ExerciseConstants.getExercise(exerciseName = "Toe touch")
            )
        )
    }

    fun getHamstringFlexibilityDay10(): Routine {
        return Routine(
            "Hamstring flexibility Day 10",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Roll down"),
                ExerciseConstants.getExercise(exerciseName = "Standing pancake good morning"),
                ExerciseConstants.getExercise(exerciseName = "Crossbody hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Crossbody hamstring stretch")
            )
        )
    }

    fun getHamstringFlexibilityDay11(): Routine {
        return Routine(
            "Hamstring flexibility Day 11",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Standing pancake good morning"),
                ExerciseConstants.getExercise(exerciseName = "Hamstring chokes"),
                ExerciseConstants.getExercise(exerciseName = "Toe touch"),
                ExerciseConstants.getExercise(exerciseName = "Toe touch")
            )
        )
    }

    fun getHamstringFlexibilityDay12(): Routine {
        return Routine(
            "Hamstring flexibility Day 12",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Roll down"),
                ExerciseConstants.getExercise(exerciseName = "Standing pancake good morning"),
                ExerciseConstants.getExercise(exerciseName = "Crossbody hamstring stretch"),
                ExerciseConstants.getExercise(exerciseName = "Crossbody hamstring stretch")
            )
        )
    }

    // Shoulder mobility
    fun getShoulderMobilityDay01(): Routine {
        return Routine(
            "Shoulder mobility Day 1",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Crossbody arm swings"),
                ExerciseConstants.getExercise(exerciseName = "Chair dips"),
                ExerciseConstants.getExercise(exerciseName = "Dip hold"),
                ExerciseConstants.getExercise(exerciseName = "Box shoulder stretch")
            )
        )
    }

    fun getShoulderMobilityDay02(): Routine {
        return Routine(
            "Shoulder mobility Day 2",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Arm circles"),
                ExerciseConstants.getExercise(exerciseName = "Chest pulses"),
                ExerciseConstants.getExercise(exerciseName = "Behind the back bicep stretch"),
                ExerciseConstants.getExercise(exerciseName = "Door frame chest stretch")
            )
        )
    }

    fun getShoulderMobilityDay03(): Routine {
        return Routine(
            "Shoulder mobility Day 3",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Crossbody arm swings"),
                ExerciseConstants.getExercise(exerciseName = "Chair dips"),
                ExerciseConstants.getExercise(exerciseName = "Dip hold"),
                ExerciseConstants.getExercise(exerciseName = "Box shoulder stretch")
            )
        )
    }

    fun getShoulderMobilityDay04(): Routine {
        return Routine(
            "Shoulder mobility Day 4",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Arm circles"),
                ExerciseConstants.getExercise(exerciseName = "Chest pulses"),
                ExerciseConstants.getExercise(exerciseName = "Behind the back bicep stretch"),
                ExerciseConstants.getExercise(exerciseName = "Door frame chest stretch")
            )
        )
    }

    fun getShoulderMobilityDay05(): Routine {
        return Routine(
            "Shoulder mobility Day 5",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Crossbody arm swings"),
                ExerciseConstants.getExercise(exerciseName = "Shoulder dislocations"),
                ExerciseConstants.getExercise(exerciseName = "Loaded lat stretch"),
                ExerciseConstants.getExercise(exerciseName = "Bicep stretch")
            )
        )
    }

    fun getShoulderMobilityDay06(): Routine {
        return Routine(
            "Shoulder mobility Day 6",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Arm circles"),
                ExerciseConstants.getExercise(exerciseName = "Chest pulses"),
                ExerciseConstants.getExercise(exerciseName = "Behind the back bicep stretch"),
                ExerciseConstants.getExercise(exerciseName = "Door frame chest stretch")
            )
        )
    }

    fun getShoulderMobilityDay07(): Routine {
        return Routine(
            "Shoulder mobility Day 7",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Crossbody arm swings"),
                ExerciseConstants.getExercise(exerciseName = "Shoulder dislocations"),
                ExerciseConstants.getExercise(exerciseName = "Loaded lat stretch"),
                ExerciseConstants.getExercise(exerciseName = "Bicep stretch")
            )
        )
    }

    fun getShoulderMobilityDay08(): Routine {
        return Routine(
            "Shoulder mobility Day 8",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Chest pulses"),
                ExerciseConstants.getExercise(exerciseName = "Cherry pickers"),
                ExerciseConstants.getExercise(exerciseName = "Side stretch"),
                ExerciseConstants.getExercise(exerciseName = "Broomstick chest opener")
            )
        )
    }

    fun getShoulderMobilityDay09(): Routine {
        return Routine(
            "Shoulder mobility Day 9",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Crossbody arm swings"),
                ExerciseConstants.getExercise(exerciseName = "Shoulder dislocations"),
                ExerciseConstants.getExercise(exerciseName = "Loaded lat stretch"),
                ExerciseConstants.getExercise(exerciseName = "Bicep stretch")
            )
        )
    }

    fun getShoulderMobilityDay10(): Routine {
        return Routine(
            "Shoulder mobility Day 10",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Chest pulses"),
                ExerciseConstants.getExercise(exerciseName = "Cherry pickers"),
                ExerciseConstants.getExercise(exerciseName = "Side stretch"),
                ExerciseConstants.getExercise(exerciseName = "Broomstick chest opener")
            )
        )
    }

    fun getShoulderMobilityDay11(): Routine {
        return Routine(
            "Shoulder mobility Day 11",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Crossbody arm swings"),
                ExerciseConstants.getExercise(exerciseName = "Chair dips"),
                ExerciseConstants.getExercise(exerciseName = "Dip hold"),
                ExerciseConstants.getExercise(exerciseName = "Lat stretch")
            )
        )
    }

    fun getShoulderMobilityDay12(): Routine {
        return Routine(
            "Shoulder mobility Day 12",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Chest pulses"),
                ExerciseConstants.getExercise(exerciseName = "Cherry pickers"),
                ExerciseConstants.getExercise(exerciseName = "Side stretch"),
                ExerciseConstants.getExercise(exerciseName = "Broomstick chest opener")
            )
        )
    }

    // Posture mobility

    fun getPostureMobilityDay01(): Routine {
        return Routine(
            "Posture mobility Day 1",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Wall extension"),
                ExerciseConstants.getExercise(exerciseName = "Wall extension"),
                ExerciseConstants.getExercise(exerciseName = "Pike"),
                ExerciseConstants.getExercise(exerciseName = "Wall lat stretch"),
                ExerciseConstants.getExercise(exerciseName = "Wall angels")
            )
        )
    }

    fun getPostureMobilityDay02(): Routine {
        return Routine(
            "Posture mobility Day 2",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Seated twists"),
                ExerciseConstants.getExercise(exerciseName = "Cat-cow"),
                ExerciseConstants.getExercise(exerciseName = "Basic back lift"),
                ExerciseConstants.getExercise(exerciseName = "Lateral neck stretch")
            )
        )
    }

    fun getPostureMobilityDay03(): Routine {
        return Routine(
            "Posture mobility Day 3",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Wall extension"),
                ExerciseConstants.getExercise(exerciseName = "Wall extension"),
                ExerciseConstants.getExercise(exerciseName = "Pike"),
                ExerciseConstants.getExercise(exerciseName = "Wall lat stretch"),
                ExerciseConstants.getExercise(exerciseName = "Wall angels")
            )
        )
    }

    fun getPostureMobilityDay04(): Routine {
        return Routine(
            "Posture mobility Day 4",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Seated twists"),
                ExerciseConstants.getExercise(exerciseName = "Cat-cow"),
                ExerciseConstants.getExercise(exerciseName = "Basic back lift"),
                ExerciseConstants.getExercise(exerciseName = "Lateral neck stretch")
            )
        )
    }

    fun getPostureMobilityDay05(): Routine {
        return Routine(
            "Posture mobility Day 5",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Wall back bend walkdown"),
                ExerciseConstants.getExercise(exerciseName = "Roll down"),
                ExerciseConstants.getExercise(exerciseName = "Wall chest stretch"),
                ExerciseConstants.getExercise(exerciseName = "Wall angels")
            )
        )
    }

    fun getPostureMobilityDay06(): Routine {
        return Routine(
            "Posture mobility Day 6",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Active twist hold"),
                ExerciseConstants.getExercise(exerciseName = "Lateral stretch"),
                ExerciseConstants.getExercise(exerciseName = "Cat"),
                ExerciseConstants.getExercise(exerciseName = "Cat"),
                ExerciseConstants.getExercise(exerciseName = "Cow"),
                ExerciseConstants.getExercise(exerciseName = "Cow")
            )
        )
    }

    fun getPostureMobilityDay07(): Routine {
        return Routine(
            "Posture mobility Day 7",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Wall back bend walkdown"),
                ExerciseConstants.getExercise(exerciseName = "Roll down"),
                ExerciseConstants.getExercise(exerciseName = "Wall chest stretch"),
                ExerciseConstants.getExercise(exerciseName = "Wall angels")
            )
        )
    }

    fun getPostureMobilityDay08(): Routine {
        return Routine(
            "Posture mobility Day 8",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Active twist hold"),
                ExerciseConstants.getExercise(exerciseName = "Lateral stretch"),
                ExerciseConstants.getExercise(exerciseName = "Cat"),
                ExerciseConstants.getExercise(exerciseName = "Cat"),
                ExerciseConstants.getExercise(exerciseName = "Cow"),
                ExerciseConstants.getExercise(exerciseName = "Cow")
            )
        )
    }

    fun getPostureMobilityDay09(): Routine {
        return Routine(
            "Posture mobility Day 9",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Wall extension"),
                ExerciseConstants.getExercise(exerciseName = "Wall extension"),
                ExerciseConstants.getExercise(exerciseName = "Sit and reach (hold)"),
                ExerciseConstants.getExercise(exerciseName = "Shoulder external rotation"),
                ExerciseConstants.getExercise(exerciseName = "Wall angels")
            )
        )
    }

    fun getPostureMobilityDay10(): Routine {
        return Routine(
            "Posture mobility Day 10",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Thread the needle"),
                ExerciseConstants.getExercise(exerciseName = "Lunging lateral stretch"),
                ExerciseConstants.getExercise(exerciseName = "Shoulder internal rotation"),
                ExerciseConstants.getExercise(exerciseName = "Cat-cow")
            )
        )
    }

    fun getPostureMobilityDay11(): Routine {
        return Routine(
            "Posture mobility Day 11",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Wall extension"),
                ExerciseConstants.getExercise(exerciseName = "Wall extension"),
                ExerciseConstants.getExercise(exerciseName = "Sit and reach (hold)"),
                ExerciseConstants.getExercise(exerciseName = "Sit and reach (hold)"),
                ExerciseConstants.getExercise(exerciseName = "Shoulder external rotation"),
                ExerciseConstants.getExercise(exerciseName = "Shoulder external rotation"),
                ExerciseConstants.getExercise(exerciseName = "Wall angels")
            )
        )
    }

    fun getPostureMobilityDay12(): Routine {
        return Routine(
            "Posture mobility Day 12",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Thread the needle"),
                ExerciseConstants.getExercise(exerciseName = "Thread the needle"),
                ExerciseConstants.getExercise(exerciseName = "Lunging lateral stretch"),
                ExerciseConstants.getExercise(exerciseName = "Lunging lateral stretch"),
                ExerciseConstants.getExercise(exerciseName = "Shoulder internal rotation"),
                ExerciseConstants.getExercise(exerciseName = "Shoulder internal rotation"),
                ExerciseConstants.getExercise(exerciseName = "Cat-cow")
            )
        )
    }

}