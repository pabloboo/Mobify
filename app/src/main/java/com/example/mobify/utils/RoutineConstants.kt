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
            "Shoulder mobility Day 1" -> getShoulderMobilityDay01()
            else -> null
        }
    }

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

    fun getShoulderMobilityDay01(): Routine {
        return Routine(
            "Shoulder mobility Day 1",
            listOf(
                ExerciseConstants.getExercise(exerciseName = "Shoulder internal rotation")
            )
        )
    }

}