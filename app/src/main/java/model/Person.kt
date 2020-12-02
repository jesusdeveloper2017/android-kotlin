package model

/**
 * Created by DELL on 16/11/2017.
 */
class Person (var name: String?, var age: Int?) {

    /*second constructor*/
    constructor(name: String): this(name, null){
        //codigo opcional
    }

    /*third constructor*/
    constructor(age: Int): this(null, age)


}