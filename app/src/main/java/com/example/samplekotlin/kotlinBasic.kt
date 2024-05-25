package com.example.samplekotlin


class kotlinBasic {

    companion object{
        @JvmStatic
        fun main(args: Array<String>)
        {
            var a = 10;

            var name = "lakhan"

            println("Hello world $a")
          //  println("The sum of: ${add(5, 6,5)}")

            var num = 11
            var msg = ""


if(num>100)
                println("no is greater than 100")
            else
                print("no is less than 100")


            msg = if(num>100) "no is greater than 100" else "no is less than 100"
            println(msg)

            var num1 = 120

            if (num1>100)
            {
                print("no is greater than 100")
            }
            else if(num1<100)
            {
                print("no is less than 100")
            }
            else if(num1==100)
            {
                print("no is equal to 100")
            }
            else{
                print("no not defined")
            }

        }


 fun add(a: Int, b: Int): Int{
            return a+b
        }



fun add(a: Int, b:Int, c:Int): Int{
            return a+b+c
        }



    }
}
