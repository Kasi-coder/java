public class newswit {
    public static void main(String[] args) {
        String day="monday";
        String result="";
        result=switch(day){
            /*case "saturday","sunday"->System.out.println("9.am");
            case "monday"->System.out.println("6.20.am");
            default->System.out.println("Enter correct day");
            */
            /*case "saturday","sunday"->result=("9.am");
            case "monday"->result=("6.20.am");
            default->result=("Enter correct day");
            
            */
            case "saturday","sunday"->("9.am"); //instead of using arrow i want to use //column so then we want to use : yield                                              
            case "monday"->("6.20.am");
            default->("Enter correct day");
        };
        System.out.println(result);

    }
    
}
