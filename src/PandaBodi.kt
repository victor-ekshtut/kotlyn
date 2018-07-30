/**
 * Created by Reptilko on 12/12/2017.
 */

data class BODI(var bodyweightKg: Double, var heightCm: Double, var ageYears:Int, var sex: String, var activityLevel: Int) {
    val BMR: Double
        get() {
            if (sex == "male") return 66 + (13.7 * bodyweightKg) + (5 * heightCm) - (6.8 * ageYears)
            else if (sex == "female") return 655 + (9.6 * bodyweightKg) + (1.8 * heightCm) - (4.7 * ageYears)
            else return 10.10
        }
    val TDEE: Double
        get() {
            when (activityLevel) {
                1 -> return BMR * 1.2
                2 -> return BMR * 1.375
                3 -> return BMR * 1.55
                4 -> return BMR * 1.725
                5 -> return BMR * 1.9
                else -> return 150.00
            }
        }
    val totalCalories: Int
        get() {
            return TDEE.toInt()
        }
    val totalFat: Int
        get() {
            return (TDEE * 0.35 / 9).toInt()
        }
    val totalCarbs: Int
        get() {
            return (TDEE * 0.3 / 4).toInt()
        }
    val totalProtein: Int
        get() {
            return (TDEE * 0.35 / 4).toInt()
        }
    val BMI: Int
        get() {
            return (bodyweightKg / (heightCm * heightCm) * 10000).toInt()
        }
    val razinaBMI: String
        get() {
            if(BMI>0 && BMI<15)  return "You are very severely underweight.\n"
            else if(BMI>15 && BMI<16)  return "You are severely underweight.\n"
            else if(BMI>16 && BMI<18.5) return "You are underweight.\n"
            else if(BMI>18.5 && BMI<25) return "You have normal weight.\n"
            else if(BMI>25 && BMI<30) return "You are overweight.\n"
            else if(BMI>30) return "You are fat.\n"
            else return ""
        }
}
fun main(args: Array<String>) {
    val pandaBodi=BODI(79.2,179.00, 22,"male",1)
    println(pandaBodi)
    println("Enter your bodyweight in kilograms:")
    pandaBodi.bodyweightKg=readLine()?.toDouble() ?: -1.1
    println("Enter your height in centimeters:")
    pandaBodi.heightCm= readLine()?.toDouble() ?: -1.1
    println("Enter your age:")
    pandaBodi.ageYears=readLine()?.toInt() ?: -1
    println("Enter your sex(male/female):")
    pandaBodi.sex= readLine() ?: "male"
    println("Enter your activity level:")
    print("(1) Sedentary=Little or no Exercise/desk job.\n" +
            "(2) Lightly active=Light exercise/sports 1 – 3 days/week.\n" +
            "(3) Moderately active=Moderate Exercise/sports 3 – 5 days/week.\n" +
            "(4) Very active=Heavy Exercise/sports 6 – 7 days/ week.\n" +
            "(5) Extremely active=Very heavy exercise/physical job/training 2x/day.\n")
    pandaBodi.activityLevel=readLine()?.toInt() ?: -1
    println("Caloric needs: ${pandaBodi.totalCalories}kcal.\nProteins: ${pandaBodi.totalProtein}g, " +
            "fat: ${pandaBodi.totalFat}g, carbohydrates: ${pandaBodi.totalCarbs}g." +
            "BMI:${pandaBodi.BMI}. ${pandaBodi.razinaBMI}")
}

