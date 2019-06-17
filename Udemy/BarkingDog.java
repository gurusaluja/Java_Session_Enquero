public class BarkingDog {
 public static boolean shouldWakeUp(boolean barking, int hourOfDay){
    if(!barking){
        return false;
    }else{
        return (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay <= 23)?  true : false;
    }
}
}