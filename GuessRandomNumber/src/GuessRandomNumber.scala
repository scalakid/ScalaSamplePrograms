/**
 * Created by ADMIN on 25-Oct-15.
 * A small game where user have to guess a number between 0 and 9, within 5 attempts.
 */
object GuessRandomNumber {

  def main(args:Array[String])
  {
     val a=  startGame //call function to start game
    print("function return value ="+a)
  }//end of Main()



  def startGame {
    var a =0                                      //to store number guessed by user variable, since value is read from keyboard
    var count=1                                   //count no. of chances
    val randNum = scala.util.Random.nextInt(10) //generate random number between 0 and 9
    println("Number = "+randNum)

    println("Guess a number between 0 and 9 (both inc.) : ...")

    do {
      print("Attempt " + count + " : Enter the number : ") //read the guessed number
      a = io.StdIn.readInt //read from keyboard/standard input
      count += 1 //increase number of attempts by one

      if (a == randNum)
        println("Congrats!!...Your guess is correct..")
      else if (count == 5)
        println("Sorry.Number of attempts over !!..")

    } while (count != 5 && a != randNum) //continue loop if attempts left and not guessed correctly
  }//end of functon startGame
}
