package app.dev.project.com.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import model.Person

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //root_relative_layout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, R.color.colorAccent))

        Glide.with(this@MainActivity).load(R.drawable.night).into(img_background)

        btnSignUp.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view:View?){
                action()
            }
        })

    }

    /**
     * This method is called when the signUp button is clicked.
     */
    private fun action(){

        try {
            /*
            counter += 1

            if ((counter % 2).equals(0)) {

                Toast.makeText(this@MainActivity, "'" + counter + "' es Par", Toast.LENGTH_SHORT).show() //not recommended
            } else {
                Toast.makeText(this@MainActivity, "'$counter' es Impar", Toast.LENGTH_SHORT).show() //best way
            }
            */

        /*using if else as expression
        counter += 1
        val result = if ((counter % 2).equals(0)){
                         "'$counter' es par"
        }
        else {
            "'$counter' es impar"
        }

        Toast.makeText(this@MainActivity, result, Toast.LENGTH_SHORT).show()
        */


        /*
        for (i in 1..10){
            println(i)
        }
        */

        /*
        for (i in 1..10 step 2){
            println(i)
        }
        */


        /*
        for (i in 10 downTo 1){
            println(i)
        }
        */

        /*
        for (i in 10 downTo 1 step 2){
            println(i)
        }

        */

        /*
        val names = listOf<String>("Jesus", "David", "Maria", "Isabel")

        for (name in names){
            println(name)
        }
        */


        /*
        val list = ArrayList<String>()

        list.add("Hola")

        list.add("Lobi")

        for (item: String in list) {
            println(item)
        }
        */

        /*
        val array = listOf<String>("Mensaje de texto", "", "-")

        val x:String = array.get((Math.random() * 3).toInt())

        val result:String

        when(x){

            ""                 -> result = "Mensaje Vacio"
            "Mensaje de texto" -> result =("Es igual")
            else               ->
                result = "Caso por defecto"
        }

        Toast.makeText(this@MainActivity, result, Toast.LENGTH_LONG).show()
        */

        /*
        val x: IntArray = intArrayOf(5, 6, 7)
        println(x[2])
        */

        /*
        val arrayElement = getArrayElement((Math.random() * 7).toInt())

        Toast.makeText(this@MainActivity, arrayElement, Toast.LENGTH_SHORT).show()
        */

        val person1 = Person("Jesus", 23)

        person1.age = 24

        val person2 = Person("Nell", 45)

        val person3 = Person("Juan de Dios")

        val person4 = Person(11)

        val family = ArrayList<Person>()
            family.add(person1)
            family.add(person2)
            family.add(person3)
            family.add(person4)

         var data = ""

        for (person: Person in family){

            data += "Nombre: ${person.name} edad: ${person.age} \n"

        }

        Toast.makeText(this@MainActivity, data, Toast.LENGTH_SHORT).show()


        }
        catch (e:Exception){
            Toast.makeText(this@MainActivity, e.toString(), Toast.LENGTH_LONG).show()
        }

    }

    fun getArrayElement(position:Int): String {

        val lenguages = listOf<String>("Android", "Java", "C#", "Laravel", "SQL", "Pl/SQL", "Kotlin")

        return lenguages[position]
    }
}
