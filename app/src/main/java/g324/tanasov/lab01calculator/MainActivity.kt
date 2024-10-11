package g324.tanasov.lab01calculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import g324.tanasov.lab01calculator.databinding.ActivityMainBinding
import java.lang.Math.pow
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt
import kotlin.math.tan


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    var num1 : Float = 0f
    var num2 : Float = 0f
    var res : Float = 0f
    lateinit var inputNum1 : String
    lateinit var inputNum2 : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


        bindingClass.editText1.setOnClickListener() {
            inputNum1 = bindingClass.editText1.getText().toString()
        }
        bindingClass.editText2.setOnClickListener() {
            inputNum2 = bindingClass.editText2.getText().toString()
        }
    }

    /*fun errorMessageNull(){
        val text = "Ошибка при делении на 0!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
   */


    fun saveNums() {
        try {
            num1 = bindingClass.editText1.getText().toString().toFloat()
            num2 = bindingClass.editText2.getText().toString().toFloat()
            bindingClass.editText1.setText(num1.toString())
            bindingClass.editText2.setText(num2.toString())
        }
        catch (e: Exception){
            num1 = 0f
            num2 = 0f
        }

    }


    fun btAdd (view: View){
        saveNums()
        res = num1 + num2
        bindingClass.result.text = res.toString()
    }

    fun btSub (view: View){
        saveNums()
        res = num1 - num2
        bindingClass.result.text = res.toString()
    }

    fun btMult (view: View){
        saveNums()
        res = num1 * num2
        bindingClass.result.text = res.toString()
    }

    fun btDiv (view: View){
        saveNums()

            res = num1 / num2
            bindingClass.result.text = res.toString()

        }

    fun btSin (view: View){
        bindingClass.editText2.setText("0")
        saveNums()
        bindingClass.editText2.setText("")
        res = sin(num1)
        bindingClass.result.text = res.toString()
    }

    fun btCos (view: View){
        bindingClass.editText2.setText("0")
        saveNums()
        bindingClass.editText2.setText("")
        res = cos(num1)
        bindingClass.result.text = res.toString()
    }

    fun btTan (view: View){
        bindingClass.editText2.setText("0")
        saveNums()
        bindingClass.editText2.setText("")
        res = tan(num1)
        bindingClass.result.text = res.toString()
    }

    fun btSqrt (view: View){
        bindingClass.editText2.setText("0")
        saveNums()
        bindingClass.editText2.setText("")
        res = sqrt(num1)
        bindingClass.result.text = res.toString()
    }

    fun btPow (view: View){
        bindingClass.editText2.setText("0")
        saveNums()
        bindingClass.editText2.setText("")
        res = pow(num1.toDouble(), 2.0).toFloat()
        bindingClass.result.text = res.toString()
    }


}



