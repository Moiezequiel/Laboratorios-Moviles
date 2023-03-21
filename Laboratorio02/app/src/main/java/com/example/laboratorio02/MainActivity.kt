package com.example.laboratorio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var weightEditText EditText
    private lateinit var heightEditText EditText
    private lateinit var btnTextView    Button
    private lateinit var bmiTextView   TextView
    private lateinit var resultTextView TextView
    private lateinit var actionCalculate TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun binding(){
        weightEditText = findViewById(R.id.weight_edit_text)
        heightEditText = findViewById(R.id.height_edit_text)
        btnTextView = findViewById(R.id.action_calculate)
        bmiTextView =findViewById(R.id.BMI_textview)
        resultTextView=findViewById(R.id.result_textview)
        actionCalculate=findViewById(R.id.info_textview)

    }

    private fun calculateBMI(weight: Float, height:Float):Float{
        return weight /((height/100)*(height/100))

    }
    private fun validateinput (weight: String, height: String):Boolean{
        when{
            weight.isNullOrEmpty()->{
                Toast.makeText(this, "weight is empty", Toast.LENGTH_SHORT).show()
                return false
            }
            height.isNullOrEmpty()->{

                Toast.makeText(this, "weight is empty", Toast.LENGTH_SHORT).show()
                return false
            }
        }
        return false
    }
    private fun displayresult(bmi:Float){
        bmiTextView=bmi.toString()

        var infoActionResult=" "
        var color=0

        when{
            bmi<18.50 ->{
                infoActionResult="Under Weight"
                color= R.color.under_weight
            }
            bmi in 18.50 ..24.99{
                infoActionResult="Healthy"
                color=R.color.normal_weight
            }


            }
        }
    }
}