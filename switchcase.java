public class switchcase {
    public static void main (String args[]){

        int day = 3;
        
        String dayname;

        switch(day){
            case 1 :
                dayname = "Monday";
                break;
            case 2 :
                dayname = "Tuesday";
                break;
            default:
                dayname = "Invalid day";
                break;
        }

            System.out.println(dayname);
        
    }

}
