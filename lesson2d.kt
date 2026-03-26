fun main(){
   val marks = 45
   
   if (marks < 0 || marks > 100){
    println("Invalid code")
   }
   else if(marks >= 0 && marks< 30){
    println("You failed")
   }
   else if(marks >= 30 && marks < 50){
    println("Average")
   }
   else if(marks >= 50 && marks < 70){
    println("Above average")
   }
   else if{
    println("You passed")
   }
   else{
    println("Invalid score")
   }
}