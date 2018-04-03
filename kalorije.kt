/**
 * Created by Reptilko on 11/26/2017.
 */
fun main(args: Array<String>) {
    print("Enter your weight in kg: ")
    var bodyweightKg:Double=readLine()?.toDouble() ?:-1.1
    print("Enter your height in cm: ")
    var heightCm:Double=readLine()?.toDouble() ?:-1.1
    print("Enter your age in years: ")
    var ageYears:Double=readLine()?.toDouble() ?:-1.1
    print("Enter your sex(true for male, false for female: ")
    var sex:Boolean=readLine()?.toBoolean() ?:true
    print("**************************************************************************")
    var BMR:Double
    if (sex==true) {
        BMR= 66 + (13.7 * bodyweightKg) + (5 * heightCm) - (6.8 * ageYears)
    }
    else{
        BMR=655 + (9.6 * bodyweightKg) + (1.8 * heightCm) - (4.7 * ageYears)
    }
    print("\nHow active are you?\n")
    print("(1) Sedentary=Little or no Exercise/desk job.\n" +
            "(2) Lightly active=Light exercise/sports 1 – 3 days/week.\n" +
            "(3) Moderately active=Moderate Exercise/sports 3 – 5 days/week.\n" +
            "(4) Very active=Heavy Exercise/sports 6 – 7 days/ week.\n" +
            "(5) Extremely active=Very heavy exercise/physical job/training 2x/day.\n")
    var activityLevel:Int=readLine()?.toInt() ?:1
    var TDEE:Double?
    when (activityLevel) {
        1 -> {
            TDEE = BMR * 1.2
            print("Your TDEE is $TDEE kcal.\n")
        }
        2 -> {
            TDEE = BMR * 1.375
            print("Your TDEE is $TDEE kcal.\n")
        }
        3 -> {

            TDEE = BMR * 1.55
            print("Your TDEE is $TDEE kcal.\n")
        }
        4 -> {
            TDEE = BMR * 1.725
            print("Your TDEE is $TDEE kcal.\n")
        }
        5 -> {
            TDEE = BMR * 1.9
            print("Your TDEE is $TDEE kcal.\n")
        }
        else -> {
            TDEE=15000.50
            print("Error.")
        }
    }

    var totalCalories=TDEE.toInt()
    var totalFat=(TDEE*0.35/9).toInt()
    var totalCarbs=(TDEE*0.3/4).toInt()
    var totalProtein=(TDEE*0.35/4).toInt()
    print("**************************************************************************\n")
    print("You total calories needs are $totalCalories kcal.\n" +
            "Your total protein needs are $totalProtein grams. \n" +
            "Your total fat needs are $totalFat grams.\n" +
            "Your total carbs needs are $totalCarbs grams.")


}